package com.app.service;

import java.util.List;

import com.app.dto.DoctotDTO;
import com.app.entity.Doctor;

public interface DoctorService {
	Doctor addNewDoctor(Doctor doctor);
	List<DoctotDTO> getAllDoctors();
}
