package com.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.app.core.Doctor;

public interface DoctorDao {

	List<Doctor> getAllDoctors() throws SQLException;
	Doctor getDoctorByName(String docname) throws SQLException;
}
