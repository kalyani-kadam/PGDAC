package com.blogs.service;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.BlogPostDTO;
import com.blogs.dto.EmailDTO;
import com.blogs.dto.PostRespDTO;

public interface BlogPostService {
	ApiResponse createNewBlog(BlogPostDTO dto);
//	PostRespDTO getAllPosts(EmailDTO dto);
}
