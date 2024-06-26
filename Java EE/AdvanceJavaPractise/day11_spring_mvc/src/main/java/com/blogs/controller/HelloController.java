package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //spring bean (singleton n eager), containing req handling logic
public class HelloController {
	public HelloController() {
		System.out.println("in ctor of "+getClass());
	}
	//request handling method
	@RequestMapping("/hello")
	public String sayHello()
	{
		System.out.println("in say hello");
		return "/welcome";//Handler rets -- Logical View Name(LVN) --> D.S
		//AVN  - /WEB-INF/views/welcome.jsp
	}

}
