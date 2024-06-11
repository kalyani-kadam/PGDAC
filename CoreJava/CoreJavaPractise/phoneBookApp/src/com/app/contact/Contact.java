package com.app.contact;

import java.time.LocalDate;

public class Contact {
	private int PhoneNumber;
	private String name;
	LocalDate dob;
	private String email;
	public Contact(int phoneNumber, String name, LocalDate dob, String email) {
		super();
		PhoneNumber = phoneNumber;
		this.name = name;
		this.dob = dob;
		this.email = email;
	}
	
	public Contact(String email) {
		this.email=email;
	}
	
	public Contact(String name,LocalDate dob) {
		this.name=name;
		this.dob=dob;
	}
	
	//getter & setters
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDob() {
		return dob;
	}
	@Override
	public String toString() {
		return "Contact [PhoneNumber=" + PhoneNumber + ", name=" + name + ", dob=" + dob + ", Email=" + email + "]";
	}
	
	//if only name as a primary key
//	@Override
	/*
	 * public boolean equals(Object o) { System.out.println(""); if(o instanceof
	 * Contact) { // Contact c = Contact(email); boolean retVal =
	 * this.name.equals(((Contact)o).name); System.out.println("in equals"); //
	 * System.out.println("return value in equals for "+this.name+": "+retVal); //
	 * return this.name.equals(((Contact)o).name); return retVal; } return false; }
	 */
	
	@Override
	public boolean equals(Object o) {
		System.out.println("in equals");
		if(o instanceof Contact) {
			Contact c = (Contact)o;
			return this.name.equals(name) && this.dob.equals(dob);
		}
		return false;
	}
	
	public int hashCode() {
		System.out.println("in hashcode");
//		System.out.println("return value in hashCode: "+100);
//		return 100;
		return this.name.hashCode()+this.dob.hashCode();
	}
}
