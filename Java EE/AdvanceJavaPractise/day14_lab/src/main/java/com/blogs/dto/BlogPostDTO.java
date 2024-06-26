package com.blogs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//title , desc , contents , category id ,  author id
//@Getter
//@Setter
//@ToString
public class BlogPostDTO extends BaseDTO {
	private String title;
	@JsonProperty(value = "desc") //Jackson annotation to customize json property name
	private String description;
	private String content;
	@JsonProperty(access = Access.WRITE_ONLY) //de ser only
	private Long bloggerId;
	@JsonProperty(access = Access.WRITE_ONLY) //de ser only
	private Long categoryId;
	public Long getCategoryId() {
		return categoryId;
	}
	

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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getBloggerId() {
		return bloggerId;
	}
	public void setBloggerId(Long bloggerId) {
		this.bloggerId = bloggerId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "BlogPostDTO [title=" + title + ", description=" + description + ", content=" + content + ", bloggerId="
				+ bloggerId + ", categoryId=" + categoryId + "]";
	}
	
	
}
