package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.Patient;
import com.app.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	public PatientController(){
		System.out.println("in ctr of"+getClass());
	}
	@PostMapping
	public Patient addNewPatient(Patient patient) {
		System.out.println("in add new patient");
		return patientService.addNewPatient(patient);
	}
}
