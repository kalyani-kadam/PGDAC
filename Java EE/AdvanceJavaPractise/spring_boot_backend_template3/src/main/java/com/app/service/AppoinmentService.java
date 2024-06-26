package com.app.service;

import com.app.dto.ApointmentResponseDTO;
import com.app.dto.AppointmentDTO;
import com.app.entity.Appointment;

public interface AppoinmentService {

ApointmentResponseDTO addNewAppoinment(AppointmentDTO appoinment);
}
