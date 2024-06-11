package com.app.cms;

import java.time.LocalDate;

public class CustomerKey {
	private String email;
	private LocalDate dob;
	
	
	public CustomerKey(String email, LocalDate dob) {
//		super();
		this.email = email;
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(dob, email);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CustomerKey other = (CustomerKey) obj;
//		return Objects.equals(dob, other.dob) && Objects.equals(email, other.email);
//	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof CustomerKey) {//CustomerKey
			CustomerKey c = (CustomerKey)o;
			return this.email.equals(c.getEmail()) && this.dob.equals(c.getDob());
		}
		return false;
	}
	
	public int hashcode() {
		return this.email.hashCode() + this.dob.hashCode();
	}
	
	public String toString() {
		return "Email: "+this.email+" Dob: "+this.dob;
	}
}
