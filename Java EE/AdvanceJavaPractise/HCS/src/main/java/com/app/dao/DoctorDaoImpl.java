package com.app.dao;

import static comm.app.utils.DBUtils.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Doctor;

public class DoctorDaoImpl implements DoctorDao {
	private Connection cn;
	private PreparedStatement pst1,pst2;

	public DoctorDaoImpl() throws SQLException {
		cn = getConnection();
		pst1 = cn.prepareStatement("select * from doctor");
		pst2 = cn.prepareStatement("select * from doctor where CONCAT(first_name, ' ', last_name) = ?");
		System.out.println("doctor dao created...");
	}

//	int docId, String firstName, String lastName, String email, String password, Date dob
	@Override
	
	public List<Doctor> getAllDoctors() throws SQLException {
		List<Doctor> dList = new ArrayList<>();
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				dList.add(new Doctor(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5),rst.getDate(6)));
		}
		return dList;
	}

	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
	}

	public Doctor getDoctorByName(String docName)throws SQLException {
		pst2.setString(1, docName);
//		pst2.setString(, docName);
		try (ResultSet rs = pst2.executeQuery()) {
            if (rs.next()) {
                // Doctor constructor accepts these parameters
                return new Doctor(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        }
		return null;
	}
}
