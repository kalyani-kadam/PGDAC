package com.blogs.dto;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

//firstname , last name,phone no , dob
//@Getter
//@Setter
public class UserRespDTO extends BaseDTO{
		private String firstName;
		private String lastName;
		private LocalDate dob;
		private String phoneNo;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		
}
