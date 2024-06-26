package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.ApiResponse;
import com.blogs.entities.Comment;
import com.blogs.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	@PostMapping
	public ApiResponse addNewComment(@RequestBody Comment dto){
		return commentService.addNewComment(dto);
	}
}
