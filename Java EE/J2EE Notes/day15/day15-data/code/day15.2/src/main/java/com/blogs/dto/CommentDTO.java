package com.blogs.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentDTO extends BaseDTO {
	@Length(min = 10, max = 100, message = "invalid length of comment text")
	private String commentText;
	@Min(1)
	@Max(5)
	private int rating;
	@JsonProperty(access = Access.WRITE_ONLY)
	@NotNull
	private Long commenterId;
	@JsonProperty(access = Access.WRITE_ONLY)
	@NotNull
	private Long postId;
}
