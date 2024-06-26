package com.blogs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.CommentDTO;
import com.blogs.entities.Comment;
import com.blogs.repository.CommentRepository;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentRepository commentRepository;

	@Override
	public ApiResponse addNewComment(Comment comment) {
		
		return null;
	}
	
}
