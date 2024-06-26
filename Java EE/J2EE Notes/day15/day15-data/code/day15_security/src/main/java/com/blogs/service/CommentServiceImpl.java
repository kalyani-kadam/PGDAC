package com.blogs.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exceptions.ApiException;
import com.blogs.custom_exceptions.ResourceNotFoundException;
import com.blogs.dto.ApiResponse;
import com.blogs.dto.CommentDTO;
import com.blogs.entities.BlogPost;
import com.blogs.entities.Comment;
import com.blogs.entities.User;
import com.blogs.repository.BlogPostRepository;
import com.blogs.repository.CommentRepository;
import com.blogs.repository.UserRepository;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {
	// depcy
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BlogPostRepository blogPostRepository;

	@Override
	public ApiResponse addComment(CommentDTO dto) {
		// get commenter
		User commenter = userRepository.findById(dto.getCommenterId())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid commenter id!!!"));
		// get post
		BlogPost post = blogPostRepository.findById(dto.getPostId())
				.orElseThrow(() -> 
				new ResourceNotFoundException("Invalid post id!!!"));
		// validate - blogger can't add the comment on his/her own  post
		if (commenter.getId() == post.getAuthor().getId())
			throw new ApiException("Bloggers can't comment on their own posts !!!!!");
		// map dto --> entity
		Comment comment = modelMapper.map(dto, Comment.class);
		// establish the associations
		// comment--> user
		comment.setCommenter(commenter);
		// comment --> post
		comment.setPost(post);
		// since there is no cascading , you will have to explicitly save
		Comment savedComment = commentRepository.save(comment);
		return new ApiResponse("new comment added with id=" + savedComment.getId());
	}

}
