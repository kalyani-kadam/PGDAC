package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.CommentDTO;
import com.blogs.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	/*
	 * URL - http://host:port/comments
	Method - POST
	req - comment dto 
	resp - ApiResp with mesg
	 */
	@PostMapping
	public ApiResponse addComment(@RequestBody CommentDTO dto)
	{
		System.out.println("in add comment "+dto);
		return commentService.addComment(dto);
		
	}
}
