package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApointmentResponseDTO;
import com.app.dto.AppointmentDTO;
import com.app.entity.Appointment;
import com.app.service.AppoinmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
	@Autowired
	private AppoinmentService appoinmentService;
	
	@PostMapping
	public ApointmentResponseDTO addNewAppointment(AppointmentDTO dto) {
//		return appoinmentService.addNewAppoinment(appointment);
		return appoinmentService.addNewAppoinment(dto);
	}
}
