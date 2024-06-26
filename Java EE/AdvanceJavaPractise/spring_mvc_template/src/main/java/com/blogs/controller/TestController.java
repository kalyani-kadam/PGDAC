package com.blogs.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //mandatory cls level annotation to tell SC,following is request handling spring bean

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
	
	//add reuest handling method to forward the clnt to the view layer to display a welcome msg
	@RequestMapping("/test1") //@RequestMapping(value = "/test1") //key for container = /test1
	//and value is com.blogs.controller.TestController.testMe
	public String testMe() {
		System.out.println("in test me");
		return "/display"; //LVN-/dispaly, Handler rets LVN --> D.S. --> V.R --> prefix + LVN + suffix --> AVN -->D.S.
		//handler returns LVN to dispatcherServlet, 
		//then DS will send it to ViewResolver
		//then view resolver uses prefix + LVN + suffix for converting LVN to AVN 
		//then VR send this AVN to DS 
		
		//AVN - /WEB-INF/views/display.jsp
	}
}
