package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dto.CourseDTO;
import com.app.entity.Course;

public interface CourseService {
	public List<Course> getAllCourses();
}
