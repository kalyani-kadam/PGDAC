package com.app.details;

import java.time.LocalDate;

import com.app.plan_enum.plans;

//1.Customer should be assigned system generated (auto increment) customer id : int
//Store - first name, last name, email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//Unique ID - email

public class Customer implements Comparable<Customer> {
//public class Customer {
//	static int cid_cnt;
//	{
//		cid_cnt = 1000;
//	}
	private static int cid_cnt=0;
	private int cid;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDate dob;
	private double registrationAmount;
	private plans plan;
	
	public Customer(String firstName, String lastName, String email, String password,LocalDate dob,  double registrationAmount, plans plan ) {
		++cid_cnt;
		this.cid = cid_cnt;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob=dob;
		this.registrationAmount = registrationAmount;
		this.plan = plan;
	}
	
	public Customer(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "\nCustomer Id: "+this.cid+"\nfirstName:"+this.firstName+"\nlastName : "+this.lastName
				+"\nEmail : "+this.email+"\nPassword : "+this.password+"\nDOB:"+this.dob
				+"\nregistrationAmount :"+this.registrationAmount+" \nPlan :"+this.plan;
	}

	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String setPassword(String password) {
		this.password=password;
		return password;
	}
	
	public plans getPlan() {
		return plan;
	}

	@Override
	public int compareTo(Customer anotherAccount)   //customers compareTo
	{
		System.out.println("in compareTo");				
		return this.email.compareTo(anotherAccount.email);	 //string class compareTo
	}
	
	@Override
	public boolean equals(Object o) {
//		System.out.println("in customers equals");
		if (o instanceof Customer) {
//			System.out.println("in equals if ");
			Customer c=(Customer)o;
//			return this.email.equals(c.email);  		   //here invoker is this.email and receiver is c.email
			return this.email.equals(((Customer)o).email); //shortcut for above 2 line code is this line code
			
//			return this.getEmail() == ((Customer)o).email;  //using getter
		}
		return false;
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
