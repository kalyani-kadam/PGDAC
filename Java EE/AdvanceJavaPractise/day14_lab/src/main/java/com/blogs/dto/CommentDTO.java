package com.blogs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
public class CommentDTO extends BaseDTO {
	private String commentText;
	private int rating;
	@JsonProperty(access = Access.WRITE_ONLY)
	private Long commenterId;
	@JsonProperty(access = Access.WRITE_ONLY)
	private Long postId;
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Long getCommenterId() {
		return commenterId;
	}
	public void setCommenterId(Long commenterId) {
		this.commenterId = commenterId;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	@Override
	public String toString() {
		return "CommentDTO [commentText=" + commentText + ", rating=" + rating + ", commenterId=" + commenterId
				+ ", postId=" + postId + "]";
	}
	
	
}
