package com.app.dao;

import java.sql.SQLException;

import com.app.core.Patient;

public interface PatientDao {
	Patient signIn(String email,String password) throws SQLException;
}
