package com.blogs.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exceptions.InvalidCredentialsException;
import com.blogs.custom_exceptions.ResourceNotFoundException;
import com.blogs.dto.ApiResponse;
import com.blogs.dto.BlogPostDTO;
import com.blogs.dto.EmailDTO;
import com.blogs.dto.PostRespDTO;
import com.blogs.entities.BlogPost;
import com.blogs.entities.Category;
import com.blogs.entities.User;
import com.blogs.repository.BlogPostRepository;
import com.blogs.repository.CategoryRepository;
import com.blogs.repository.UserRepository;

@Service
@Transactional
public class BlogPostServiceImpl implements BlogPostService {
	// depcy
	@Autowired
	private BlogPostRepository blogPostRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public ApiResponse createNewBlog(BlogPostDTO dto) {
		// 1. get category from category id
		Category category = categoryRepository
				.findById(dto.getCategoryId())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid category id !!!!"));
		User blogger=userRepository.findById(dto.getBloggerId())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid blogger id !!!!"));
		//category, blogger : persistent
		//map blog post dto --> entity
		BlogPost blogPost = mapper.map(dto, BlogPost.class);
		//establish E-R
		//post  *<--->1 catgeory
		category.addBlogPost(blogPost);
		// blog post *---->1 user
		blogPost.setAuthor(blogger);
		//=> success
		return new ApiResponse("new blog post added ");
	}
	/*
	 * In case of success --hibernate , as a def. implementor will commit tx n then closes the session)
	 */

//	@Override
//	public PostRespDTO getAllPosts(EmailDTO dto) {
//		//1 pass email to repos method
//		User user = userRepository.fetchByEmail(dto.getEmail())
//		.orElseThrow(() -> new InvalidCredentialsException("Invalid email"));
//		
//		
////		Optional<User> user = userRepository.
////				findByEmail(dto.getEmail())
////				.orElseThrow(()-> new InvalidCredentialsException("Invalid email!!"));
//		
//		return mapper.map(user, PostRespDTO.class);
//	}
	
}
