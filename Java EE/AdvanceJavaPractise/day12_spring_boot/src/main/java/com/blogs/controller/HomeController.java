package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("in ctor of " + getClass());
	}

	@RequestMapping("/")
	public String deliverIndexPage() {
		System.out.println("in deliver index page");
		return "/index";//Handler rets LVN --> D.S --> sends it V.R --> rets AVN
		//   /WEB-INF/views/index.jsp
	}

}
