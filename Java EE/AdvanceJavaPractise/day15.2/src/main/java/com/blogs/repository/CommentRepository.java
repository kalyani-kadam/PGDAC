package com.blogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
