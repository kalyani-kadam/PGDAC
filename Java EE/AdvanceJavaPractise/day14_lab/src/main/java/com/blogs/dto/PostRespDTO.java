package com.blogs.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

//title,desc,updationDate,bloggerName,categoryName
public class PostRespDTO {
	private String title;
	@JsonProperty(value = "desc") //Jackson annotation to customize json property name
	private String description;
	private LocalDateTime updationDate;
	@JsonProperty(access = Access.WRITE_ONLY) //de ser only
	private String bloggerName;
	@JsonProperty(access = Access.WRITE_ONLY) //de ser only
	private String categoryName;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(LocalDateTime updationDate) {
		this.updationDate = updationDate;
	}
	public String getBloggerName() {
		return bloggerName;
	}
	public void setBloggerName(String bloggerName) {
		this.bloggerName = bloggerName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "PostDTO [title=" + title + ", description=" + description + ", updationDate=" + updationDate
				+ ", bloggerName=" + bloggerName + ", categoryName=" + categoryName + "]";
	}
	
	
}
