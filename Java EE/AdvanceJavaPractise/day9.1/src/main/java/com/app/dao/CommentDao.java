package com.app.dao;

import java.util.List;

import com.app.entities.Comment;

public interface CommentDao {
String addNewComment(Comment comment,Long commenterId,Long postId);
List<Comment> getCommentByPostTitle(String title);
}
