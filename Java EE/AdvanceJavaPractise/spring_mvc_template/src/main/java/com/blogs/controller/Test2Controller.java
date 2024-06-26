package com.blogs.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// /test/test2

@Controller
//base pattern of the incoming url-pattern, can be supplied at the class level -- optional but reccomended
@RequestMapping("/test") //can intercept NAY request(GET|POST|PUT|DELETE|PATCH)
public class Test2Controller {
	public Test2Controller() {
		System.out.println("in ctor of"+getClass());
	}
	
	//add req handling method to display server side time stamp
	//(i.e. a dynamic response)
	
	@GetMapping("/test2")//IT is equivalent to @RequestMapping(method = GET)
//	@PostMapping("/test2") //it will give 405 error as server will use GET method for sending request but here we are using Method = POST 
	public ModelAndView renderDynamicResult() {
		System.out.println("in render dynamic result");
		//o.s.w.s.MOdelAndView : classs that hold LVN + results
		//Results are represented by model attributes
		//(name,value pair)
		//Constructor -
		//MOdelAndView(String LogicalViewName, String modelAttrName, Object modelAttrValue)
		
		return new ModelAndView("/test/display","server_ts",LocalDateTime.now());
		
//		Handler rets ModelAndView to DispatcherServelet 
		//D.S. send LVN --> viewREsolver(VR) --> AVN(WEB-INF/views/test/display.jsp --> D.S
//		-->adds model attr under request scope
//		D.S forwards the clnt to JSP based view layer
	}
}
