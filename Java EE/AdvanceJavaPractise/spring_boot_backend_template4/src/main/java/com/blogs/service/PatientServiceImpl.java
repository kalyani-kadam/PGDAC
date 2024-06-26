package com.blogs.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.blogs.entities.Patient;
import com.blogs.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;
	@Override
	public Patient addNewPatient(Patient patient) {
		return patientRepository.save(patient);
	}

}
