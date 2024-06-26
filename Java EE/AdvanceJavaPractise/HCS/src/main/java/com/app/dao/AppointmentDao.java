package com.app.dao;


import java.sql.SQLException;
import java.util.List;

import com.app.core.Appointment;
import com.app.core.Doctor;

public interface AppointmentDao {

	int addAppointment(Appointment newAppt) throws SQLException;
	List<Appointment> getAllAppoinment() throws SQLException;
	List<Appointment> getAllAppoinmentById(int id) throws SQLException;
	String deleteAppt(int id)throws SQLException;
}
