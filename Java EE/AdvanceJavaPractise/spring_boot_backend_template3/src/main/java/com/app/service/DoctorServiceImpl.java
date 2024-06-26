package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.DoctotDTO;
import com.app.entity.Doctor;
import com.app.repository.DoctorRepository;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private ModelMapper mapper;
	@Override
	public Doctor addNewDoctor(Doctor doctor) {
		
		return doctorRepository.save(doctor);
	}
	@Override
	public List<DoctotDTO> getAllDoctors() {
		
		return doctorRepository.findAll()
				.stream()
				.map(doctor -> mapper.map(doctor, DoctotDTO.class))
				.collect(Collectors.toList());
	}

}
