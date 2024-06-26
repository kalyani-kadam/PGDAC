package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.DoctotDTO;
import com.app.entity.Doctor;
import com.app.entity.Patient;
import com.app.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping
	public Doctor addNewDoctor(@RequestBody Doctor doctor) {
//		Patient p=new pati
		return doctorService.addNewDoctor(doctor);
	}
	
	@GetMapping
	public List<DoctotDTO> getAllDoctors() {
		return doctorService.getAllDoctors();
	}
}
