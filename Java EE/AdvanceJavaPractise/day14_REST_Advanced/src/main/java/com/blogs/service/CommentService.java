package com.blogs.service;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.CommentDTO;
import com.blogs.entities.Comment;

public interface CommentService {
	ApiResponse addNewComment(Comment comment);

//	ApiResponse addNewComment(CommentDTO comment);
}
