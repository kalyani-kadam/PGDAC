package com.blogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.entities.Category;
import com.blogs.service.CategoryService;

/*
 * @Controller at class level + @ResponseBody implicitly added 
 * on ret types of req handling methods(@RequestMapping 
 * | @GetMapping|@PostMapping...) 
 */
@RestController
@RequestMapping("/categories") // optional BUT reco
public class CategoryController {
	//depcy
	@Autowired//byType
	private CategoryService categoryService;
	
	public CategoryController() {
		System.out.println("in ctor of " + getClass());
		
	}
	/*
	 * 1. Get All Categories
		Design end point of REST API
		URL - http://host:port/categories
	Method - GET
	Payload(request data) - NONE
	Resp - : (@ResponseBody) List<Category>
	 */
	@GetMapping
	public List<Category> listAllCategories() {
		System.out.println("in list all categories");
		return categoryService.getAllCategories();
	}
	/*
	 * Design end point of REST API for adding new category(Create)
URL - http://host:port/categories
Method - POST
Payload(request data) - category details (name n desc) : Category entity
JSON --> Java (de-ser | un marshalling) => un marshalling
Resp - : @ResponseBody -- Category (with generated id) => marshalling
	 */
	@PostMapping
	public Category addNewCategory(@RequestBody Category category)
	{
		System.out.println("in add new category "+category);
		return categoryService.addNewCategory(category);
	}
}
