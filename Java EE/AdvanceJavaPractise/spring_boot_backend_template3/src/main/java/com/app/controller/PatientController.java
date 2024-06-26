package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Patient;
import com.app.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping
	public Patient addNewPatient(@RequestBody Patient patient) {
//		Patient p=new pati
		return patientService.addNewPatient(patient);
	}
}
