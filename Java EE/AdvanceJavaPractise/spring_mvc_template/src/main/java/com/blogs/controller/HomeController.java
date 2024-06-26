package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("int ctor of "+getClass());
	}
	public void myInit() {
		System.out.println("in init of "+getClass());
	}
	
	@RequestMapping("/")
	public String homePage() {
		System.out.println("in homepage method");
		return "/index";
	}
	//web-inf/views/index.jsp
}
