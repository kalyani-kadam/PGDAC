package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //spring bean containing request handling logic
public class UserHomeController {
	public UserHomeController() {
		System.out.println("in ctr of "+getClass());
	}
	//add a method to render login page
	@GetMapping("/")
	public String showloginForm() {
		System.out.println("in show login form");
		return "/users/login"; //handler returns LVN --> D.S --> V.R. --> AVN
		//AVN --> WEB-INF/views/users/login.jsp
	}
}
