package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/categories")
public class ListCategory {
	public ListCategory() {
		System.out.println("in ctr of "+getClass());
	}
	
	//add  req handling method to list all categories
	@GetMapping("/list")
	public ModelAndView getCategoriesList() {
		System.out.println("in getCategoriesList");
		return new ModelAndView("/categories/list","category_list",null);
	}
	///web-inf/views/categories/list.jsp
}
