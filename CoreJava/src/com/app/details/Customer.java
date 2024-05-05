package com.app.details;

import com.app.plan_enum.plans;

//1.Customer should be assigned system generated (auto increment) customer id : int
//Store - first name, last name, email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//Unique ID - email

public class Customer {
	
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
	private double registrationAmount;
	private plans plan;
	
	public Customer(String firstName, String lastName, String email, String password,  double registrationAmount, plans plan ) {
		cid_cnt++;
		this.cid = cid_cnt;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.plan = plan;
	}
	
	public Customer(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "\nCustomer Id: "+this.cid_cnt+"\nfirstName:"+this.firstName+"\nlastName : "+this.lastName+"\nEmail : "+this.email+"\nPassword : "+this.password+
				"\nregistrationAmount :"+this.registrationAmount+" \nPlan :"+this.plan;
	}

	
	public String getEmail() {
		return this.email;
	}
	@Override
	public boolean equals(Object o) {
		System.out.println("in customers equals");
		if (o instanceof Customer) {
			System.out.println("in equals if ");
//			return this.email == ((Customer) o).email;
			return this.getEmail() == ((Customer)o).email;
		}
		return false;
	}
}
