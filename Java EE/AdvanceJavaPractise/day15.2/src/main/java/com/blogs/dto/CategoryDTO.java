package com.blogs.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CategoryDTO extends BaseDTO {
	private String name;
	private String description;

}
