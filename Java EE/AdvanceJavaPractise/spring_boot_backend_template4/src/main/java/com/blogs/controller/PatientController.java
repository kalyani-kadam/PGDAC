package com.blogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.ApiResponse;
import com.blogs.entities.Patient;
import com.blogs.service.PatientService;

@RestController // => @Controller at class level + @ResponseBody implicitly added on return
				// types of request handling method(@RequestMapping | @GetMapping |
				// @POstMapping...)
@RequestMapping("/patients") // optional but recommneded
public class PatientController {
	//depcy 
	@Autowired //bytype
	private PatientService PatientService;
	
	public PatientController() {
		System.out.println("in ctr of" + getClass());
	}

	/*
	 * Design end point of REST API for adding new Patient(Create) URL -
	 * http://localhost/port/categories Method - POST Payload(request data) -
	 * Patient details (name n description) : Patient Entity Response
	 * JSON --> Java(de-ser | un marshalling) => un marshalling
	 * - @ResponseBody -- Patient(with generated id)
	 */
	
	@PostMapping
	public Patient addNewPatient(@RequestBody	Patient Patient) {
		System.out.println("in add new Patient");
		return PatientService.addNewPatient(Patient);
	}
	
}
