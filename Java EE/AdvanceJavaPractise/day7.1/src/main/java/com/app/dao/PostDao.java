package com.app.dao;

import java.util.List;

import com.app.entities.Posts;

public interface PostDao {
	String addPost(Posts post);
	Posts getPostDetails(Long postId);
	List<Posts> getAllPostDetails();
}
