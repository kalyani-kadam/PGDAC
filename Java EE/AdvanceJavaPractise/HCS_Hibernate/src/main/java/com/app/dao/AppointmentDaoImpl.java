package com.app.dao;

import static comm.app.utils.DBUtils.getConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Appointment;
import com.app.core.Doctor;

public class AppointmentDaoImpl implements AppointmentDao {
private Connection cn;
private PreparedStatement pst1,pst2,pst3,pst4;

public AppointmentDaoImpl() throws SQLException {
	cn = getConnection();
	pst1 = cn.prepareStatement("insert into appointment values(default,?,?,?,?)");
	pst2 = cn.prepareStatement("select * from appointment where pid=?");
	pst3 = cn.prepareStatement("select * from appointment");
	pst4 = cn.prepareStatement("delete from appointment where id=?");
	System.out.println("appointment dao created...");
}

	@Override
	public int addAppointment(Appointment newAppt) throws SQLException {
		pst1.setDate(1, (Date) newAppt.getDate());
		pst1.setTime(2, newAppt.getTime());
		pst1.setInt(3, newAppt.getPid());
		pst1.setInt(4, newAppt.getDid());
		System.out.println("in addApp");
		if(pst1.executeUpdate()==1) {
			return 1;
		}
		return -1;
	}
//	int apptid, Date date, Time time, int pid, int did
	public List<Appointment> getAllAppoinmentById(int id) throws SQLException{
		pst2.setInt(1, id);
		List<Appointment> aList = new ArrayList<>();
		System.out.println("app list - "+aList);
		try (ResultSet rst = pst2.executeQuery()) {
			while (rst.next())
				aList.add(new Appointment(rst.getInt(1), rst.getDate(2), rst.getTime(3), rst.getInt(4),rst.getInt(5)));
		}
		return aList;
	}
	
	public List<Appointment> getAllAppoinment() throws SQLException{
		
		List<Appointment> aList = new ArrayList<>();
		System.out.println("app list - "+aList);
		try (ResultSet rst = pst3.executeQuery()) {
			while (rst.next())
				aList.add(new Appointment(rst.getInt(1), rst.getDate(2), rst.getTime(3), rst.getInt(4),rst.getInt(5)));
		}
		return aList;
	}

	@Override
	public String deleteAppt(int id) throws SQLException {
		pst4.setInt(1, id);
		if(pst4.executeUpdate()==1)
			return "Appointment deleted successfully";
		return "Appointment deletion failed";
	}

	
}
