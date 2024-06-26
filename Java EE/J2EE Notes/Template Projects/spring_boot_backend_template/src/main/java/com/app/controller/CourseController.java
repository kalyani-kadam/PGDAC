package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CourseDTO;
import com.app.entity.Course;
import com.app.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	public CourseController() {
		System.out.println("in ctr of "+getClass());
	}
	
	@GetMapping
	public List<Course> listAllCourses(){
		System.out.println("in list all catogories");
		return courseService.getAllCourses();
	}
}
