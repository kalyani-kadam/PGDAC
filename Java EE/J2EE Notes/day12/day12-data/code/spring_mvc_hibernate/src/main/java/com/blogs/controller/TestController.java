package com.blogs.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //mandatory cls level annotation to tell SC , 
//following is req handling spring bean
//singleton n eager
public class TestController {
	public TestController() {
		System.out.println("in ctor of "+getClass());
	}
	//add init method
	@PostConstruct
	public void myInit() {
		System.out.println("in init of "+getClass());
	}
	//add a request handling method to forward the clnt to the view 
	//layer display a welcome mesg
	@RequestMapping("/test1")
	public String testMe() {
		System.out.println("in test me");
		return "/display";//=> LVN, Handler rets LVN --> D.S 
		//--> V.R --> prefix+LVN+suffix --> AVN --> D.S
		//AVN - /WEB-INF/views/display.jsp
	}

}
