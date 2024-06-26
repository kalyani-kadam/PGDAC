package com.app.core;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="patient")
@Getter
@Setter
@ToString
@NoArgsConstructor
//@AllArgsConstructor
public class Patient {
	@Column(length = 50, unique = true)
	private int patientId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
//	public Patient(int patId, String firstName, String lastName, String email, String password, Date dob) {
//		super();
//		this.patId = patId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.password = password;
//		this.dob = dob;
//	}
//	public int getpatId() {
//		return patId;
//	}
//	public void setpatId(int patId) {
//		this.patId = patId;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public Date getDob() {
//		return dob;
//	}
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
//	@Override
//	public String toString() {
//		return "Patient [patId=" + patId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
//				+ ", password=" + password + ", dob=" + dob + "]";
//	}
	
	
}
