package com.app.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="patients")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
	

//	//Tip - add helper methods to establish a bi asso.
//		public void addAppointment(Appointment appt)
//		{
//			//add a post ref to the list of posts in category
//			posts.add(post);//parent ---> child
//			post.setChosenCategory(this);//child --> parent		
//		}
//		public void removeBlogPost(BlogPost post)
//		{
//			posts.remove(post);
//			post.setChosenCategory(null);
//		}
	
//	public Patient() {
//		
//	}
//	public Long getPatId() {
//		return patId;
//	}
//	public void setPatId(Long patId) {
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
