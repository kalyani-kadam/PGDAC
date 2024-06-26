package com.blogs.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "posts")
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString(exclude = {"chosenCategory","author","tags"})
public class BlogPost extends BaseEntity {
	@Column(length = 50,unique = true)
	private String title;
	@Column(length = 100)
	private String description;
	@Column(length = 500)
	private String content;
	//BlogPost *-->1 Category
	@ManyToOne
	//optional BUT reco -- to specify name of the FK column 
	//+ not null constraint
	@JoinColumn(name = "category_id",nullable = false)
	private Category chosenCategory;
	//BlogPost *-->1 User(author)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id",nullable = false)
	private User author;
	//many to many association BlogPost *--->* Tag
	@ManyToMany //mandatory o.w --Mapping Exception
	//to customise the join table
	@JoinTable(name="post_tags",
	joinColumns = @JoinColumn(name="post_id"),
	inverseJoinColumns = @JoinColumn(name="tag_id")
	)	
	private Set<Tag> tags=new HashSet<>();

	public BlogPost() {
		
	}
	
	public BlogPost(String title, String description, String content) {
		super();
		this.title = title;
		this.description = description;
		this.content = content;
	}

	public Category setChosenCategory(Category category) {
		return this.chosenCategory=category;
		
	}

	public User setAuthor(User blogger) {
		return this.author=blogger;
		
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

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	public Category getChosenCategory() {
		return chosenCategory;
	}

	public User getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "BlogPost [title=" + title + ", description=" + description + ", content=" + content + "]";
	}
	
	
}
