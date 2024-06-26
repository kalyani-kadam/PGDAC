package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blogs.service.CategoryService;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	// depcy
	@Autowired // byType
	private CategoryService categoryService;

	public CategoryController() {
		System.out.println("in ctor of " + getClass());
	}

	// add req handling method to list all categories
	@GetMapping("/list")
	public String listAllCategories(Model map) {
		System.out.println("in list all categories");
		// get all categories from the service layer n add it under model map
		map.addAttribute("all_categories",
				categoryService.getAllCategories());
		return "/categories/list";// LVN -->
		// AVN - /WEB-INF/views/categories/list.jsp

	}

}
