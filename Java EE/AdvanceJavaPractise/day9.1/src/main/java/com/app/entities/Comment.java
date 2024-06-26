package com.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "comments",
uniqueConstraints=@UniqueConstraint(columnNames = {"commenter_id","post_id"}))
public class Comment extends BaseEntity {
	@Column(name="comment_text",length = 100)
	private String commentText;
	private int rating;
	
	//configure comment *-->1 user(commenter)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="commenter_id",nullable=false)
	private User user;
	
	//configure comment *-->1 BlogPost(post_id)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="post_id", nullable=false)
	private BlogPost post;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(String commentText, int rating) {
		super();
		this.commentText = commentText;
		this.rating = rating;
	}

	
	
	public Comment(String commentText, int rating, User user, BlogPost post) {
		super();
		this.commentText = commentText;
		this.rating = rating;
		this.user = user;
		this.post = post;
	}

	public Comment(String commentText) {
		super();
		this.commentText = commentText;
	}
	
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

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BlogPost getPost() {
		return post;
	}

	public void setPost(BlogPost post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Comment ID "+getId()+" [commentText=" + commentText + ", rating=" + rating + "]";
	}
	
	
}
