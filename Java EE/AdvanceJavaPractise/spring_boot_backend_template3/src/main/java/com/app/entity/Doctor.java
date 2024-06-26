package com.app.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "doctors")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long docId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
	private String speciality;
	
	@OneToMany(mappedBy = "did",
			cascade = CascadeType.ALL ,fetch = FetchType.EAGER )
	//@JsonIgnore //this field will be ignored during both ser n de-ser.
	private List<Appointment> appointments=new ArrayList<>();
	
	//Tip - add helper methods to establish a bi asso.
			public void addAppointment(Appointment doctor)
			{
				//add a post ref to the list of posts in category
				appointments.add(doctor);//parent ---> child
				doctor.setDid(this);//child --> parent		
			}
			public void removeBlogPost(Appointment doctor)
			{
				appointments.remove(doctor);
				doctor.setDid(null);
			}
	
//	public Doctor(Long docId, String firstName, String lastName, String email, String password, Date dob,String speciality) {
//		super();
//		this.docId = docId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.password = password;
//		this.dob = dob;
//		this.speciality= speciality;
//	}
//	
//	
//	public Doctor(Long docId, String firstName, String lastName) {
//		super();
//		this.docId = docId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//
//
//	public Long getDocId() {
//		return docId;
//	}
//	public void setDocId(Long docId) {
//		this.docId = docId;
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
//	
//	public String getSpeciality() {
//		return speciality;
//	}
//
//
//	public void setSpeciality(String speciality) {
//		this.speciality = speciality;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Doctor [docId=" + docId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
//				+ ", password=" + password + ", dob=" + dob + ", speciality=" + speciality + "]";
//	}


	
	
}
