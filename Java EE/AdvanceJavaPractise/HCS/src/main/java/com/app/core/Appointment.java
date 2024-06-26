package com.app.core;

import java.sql.Date;
import java.sql.Time;

public class Appointment {
	private int apptid;
	private int pid;
	private int did;
	private Date date;
	private Time time;
	public Appointment(int apptid, Date date, Time time, int pid, int did) {
		super();
		this.apptid = apptid;
		this.date = date;
		this.time = time;
		this.pid = pid;
		this.did = did;
	}

	public Appointment(Date date, Time time, int pid, int did) {
		super();
		this.date = date;
		this.time = time;
		this.pid = pid;
		this.did = did;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getApptid() {
		return apptid;
	}
	public void setApptid(int apptid) {
		this.apptid = apptid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Appointment [apptid=" + apptid + ", pid=" + pid + ", did=" + did + ", date=" + date + ", time=" + time
				+ "]";
	}
}
