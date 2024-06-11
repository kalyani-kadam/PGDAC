package com.app.cms;

import java.time.LocalDate;
import com.app.cms.CustomerKey;

@SuppressWarnings("unused")
public class Customer {
	private static int cid_cnt=0;
	private int cid;
	private String firstName;
	private String lastName;
	private String password;
	private double registrationAmount;
	private servicePlan plan;
	
	private CustomerKey ckeys;
//	private CustomerKey dob;
	
	
	public Customer(String firstName, String lastName, String password, double registrationAmount, servicePlan plan) {
		super();
		cid_cnt++;
		this.cid = cid_cnt;
		this.firstName = firstName;
		this.lastName = lastName;
//		this.email = email;
		this.password = password;
//		this.dob = dob;
		this.registrationAmount = registrationAmount;
		this.plan = plan;
	}

	
//	public Customer(String email,LocalDate dob) {
//		this.email=email;
//		this.dob=dob;
//	}
	
	public static int getCid_cnt() {
		return cid_cnt;
	}

	public static void setCid_cnt(int cid_cnt) {
		Customer.cid_cnt = cid_cnt;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

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

//	public CustomerKey getEmail() {
//		return email;
//	}

//	public void setEmail(CustomerKey email) {
//		this.email = email;
//	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public CustomerKey getDob() {
//		return dob;
//	}
//
//	public void setDob(CustomerKey dob) {
//		this.dob = dob;
//	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public servicePlan getPlan() {
		return plan;
	}

	public CustomerKey getCkeys() {
		return ckeys;
	}


	public void setCkeys(CustomerKey ckeys) {
		this.ckeys = ckeys;
	}


	public void setPlan(servicePlan plan) {
		this.plan = plan;
	}
	
	public void assignCkeys(CustomerKey c) {
		ckeys = c;
	}
	/*
	 * @Override public String toString() { return "Customer [cid=" + cid +
	 * ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email +
	 * ", password=" + password + ", dob=" + dob + ", registrationAmount=" +
	 * registrationAmount + ", plan=" + plan + "]"; }
	 */
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName 
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", plan="
				+ plan + " Email=" + ckeys+"]";
	}
	
//	customers can't have same email n dob.

//	@Override
//	public boolean equals(Object o) {
//		if(o instanceof Customer) {
//			Customer c = (Customer)o;
//			return this.email.equals(c.email) && this.dob.equals(c.dob);
//		}
//		return false;
//	}
	
}
