package com.app.dao;

import static comm.app.utils.DBUtils.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Patient;

public class PatientImpl implements PatientDao {

	private Connection cn;
	private PreparedStatement pst1,pst2;

	public PatientImpl() throws SQLException {
		cn = getConnection();
		pst1 = cn.prepareStatement("select * from patient where email=? and password=?");
		pst2 = cn.prepareStatement("select * from patient");
		System.out.println("patient dao created...");
	}

	public Patient signIn(String email, String password) throws SQLException {
		pst1.setString(1, email);
		pst1.setString(2, password);

		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next()) {
				return new Patient(rst.getInt(1), rst.getString(2), rst.getString(3), email, password, rst.getDate(6));
			}
		}
		return null;
	}

	
	public List<Patient> getAllpatient() throws SQLException {
		List<Patient> candidateList = new ArrayList<>();
		try (ResultSet rst = pst2.executeQuery()) {
			while (rst.next())
				candidateList.add(new Patient(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5),rst.getDate(6)));
		}
		return candidateList;
	}
	
	public void cleanUp() throws SQLException {
		System.out.println("user dao cleaned up");
		if (pst1 != null)
			pst1.close();

	}

}
