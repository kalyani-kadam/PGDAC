package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Course;
import com.app.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
//	@Autowired
//	private ModelMapper modelMapper;
	
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
//				.stream()
//				.map(course -> modelMapper.map(course, CourseDTO.class))
//				.collect(Collectors.toList());
	}
}
