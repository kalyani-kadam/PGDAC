package com.blogs.dto;

public class CommentDTO extends BaseDTO{
	private String comment;
	private int rating;
	private Long commentId;
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
