package com.app.service;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.ApointmentResponseDTO;
import com.app.dto.AppointmentDTO;
import com.app.entity.Appointment;
import com.app.entity.Doctor;
import com.app.entity.Patient;
import com.app.entity.TimeSlot;
import com.app.repository.AppoinmentRepository;
import com.app.repository.DoctorRepository;
import com.app.repository.PatientRepository;

@Service
@Transactional
public class AppoinmentServiceImpl implements AppoinmentService {

	@Autowired
	private AppoinmentRepository appointmentRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private ModelMapper maper;
	
	@Autowired
	private TimeSlotService timeSlotService;

//	List<Time> time= new ArrayList<>();
	@Override
	public ApointmentResponseDTO addNewAppoinment(AppointmentDTO dto) {
//		if (appoinment.isApptStatus() == false) 
//			appoinment.setApptStatus(true);
//			return appointmentRepository.save(appoinment);
		Patient patient = patientRepository.findById(dto.getPatientid())
				.orElseThrow(()->new ResourceNotFoundException("Invalid patient id!!!"));
		Doctor doctor = doctorRepository.findById(dto.getDoctorId())
				.orElseThrow(()->new ResourceNotFoundException("Invalid doctor id!!!"));
		TimeSlot timeslot = timeSlotService.addNewTimeSlot(dto.getTime(), dto.getDate());
//				.orElseThrow(()->new ResourceNotFoundException("Time slot already occupied"));
//		if(timeslot) {
			Appointment appoinment = maper.map(dto, Appointment.class);
			//*<--->1 appointment<--->patient 
			appoinment.setPid(patient);
//			//*<--->1 appointment<--->doctor
			appoinment.setDid(doctor);
			appoinment.setTimeslot(timeslot);
//		}else {
//			throw new ResourceNotFoundException("Time slot already occupied");
//		}
		//*<--->1 appointment<--->patient 
//		appoinment.setPid(patient);
//		//*<--->1 appointment<--->doctor
//		appoinment.setDid(doctor);
		return new ApointmentResponseDTO("New Appoinment added successfully with id-"+appoinment.getApptid());
	}
}
