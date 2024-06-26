package com.blogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.ApiResponse;
import com.blogs.entities.Category;
import com.blogs.service.CategoryService;

@RestController // => @Controller at class level + @ResponseBody implicitly added on return
				// types of request handling method(@RequestMapping | @GetMapping |
				// @POstMapping...)
@RequestMapping("/categories") // optional but recommneded
public class CategoryController {
	//depcy 
	@Autowired //bytype
	private CategoryService categoryService;
	
	public CategoryController() {
		System.out.println("in ctr of" + getClass());
	}

	/*1. Get All Categories
	Design end point of REST API
	URL - http://localhost/port/categories
	Method - GET 
	Payload(request data) - NONE
	Response - List of category List<Category>
	(sent from RestController --> D.S --> marshalling(serialization :  java --> JSON) --> WILL be sent to the REST client*/

	@GetMapping
	public List<Category> listAllCategories() {
		System.out.println("in list all categories");
		return categoryService.getAllCategories();
	}
	
	/*
	 * Design end point of REST API for adding new category(Create) URL -
	 * http://localhost/port/categories Method - POST Payload(request data) -
	 * category details (name n description) : Category Entity Response
	 * JSON --> Java(de-ser | un marshalling) => un marshalling
	 * - @ResponseBody -- Category(with generated id)
	 */
	
	@PostMapping
	public Category addNewCategory(@RequestBody	Category category) {
		System.out.println("in add new category");
		return categoryService.addNewCategory(category);
	}
	
	/*
	 * Delete catgeory details Design end point of REST API for deleting existing
	 * category(Delete) URL - http://localhost/port/categories/{categoryId} (URI
	 * template variable | path variable) Method - DELETE Payload(request data) -
	 * none Response - @ResponseBody -- plain string message
	 */
	
	@DeleteMapping("/{categoryId}")
	//@PathVariable - method arg level annotation, to bind incoming path variable to method argument
	
//	public String deleteCategoryDetails(@PathVariable(name = "categoryId") Long catID) { //below line and this line is same
	/*
	 * public String deleteCategoryDetails(@PathVariable Long categoryId) {
	 * System.out.println("in delete category"+categoryId); return
	 * categoryService.deleteCategoryDetails(categoryId); }
	 */
	
//	Better Practice : Instead of a plain string message , wrap it in the java object (ApiResponse) n send it to front end

	public ApiResponse deleteCategoryDetails(@PathVariable Long categoryId) 
	{
		System.out.println("in delete category"+categoryId);
		return new ApiResponse(categoryService.deleteCategoryDetails(categoryId));
	}
	
	
	/*
	 * 4. Update category details
	 * 
	 * 4.1 Get category details By Id Design end point of REST API for deleting
	 * existing category(GET) URL - http://localhost/port/categories/{categoryId}
	 * (URI template variable | path variable) Method - GET Payload(request data) -
	 * none Response - @ResponseBody -- Category
	 */
	
	@GetMapping("/{catId}")
	public Category getCategoryDetails(@PathVariable Long CatId) {
		System.out.println("in category Id"+CatId);
		return categoryService.getCategoryDetails(CatId);
	}
	
	/*
	 * 4.2 Update category details Design end point of REST API for deleting
	 * existing category(PUT) URL - http://localhost/port/categories Method - PUT
	 * Payload(request data) - Category Response - @ResponseBody -- Category
	 */
	
	@PutMapping
	public Category updateCategoryDetails(@RequestBody Category category) {
		System.out.println("in update "+category);
		return categoryService.updateCategoryDetails(category);
		
	}

}
