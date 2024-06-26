package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Posts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String content;
	private String description;
	private String image_path;
	@Column(nullable=false)
	private String title;
	
	public Posts() {
		
	}
	public Posts(String content, String description, String image_path, String title) {
		super();
		this.content = content;
		this.description = description;
		this.image_path = image_path;
		this.title = title;
	}
	
	//getter n setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Posts [id=" + id + ", content=" + content + ", description=" + description + ", image_path="
				+ image_path + ", title=" + title + "]";
	}
	
}
