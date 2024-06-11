package com.app.validationRules;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.app.CustomerException.CustomerException;
import com.app.details.Customer;
import com.app.plan_enum.plans;

public class CmsValidations {

	public static Customer validateInputs(String firstName, String lastName, String email, String password,String dob, double registrationAmount, String plan, List<Customer> customers ) throws CustomerException {

		LocalDate birthdate=validateDate(dob);
		validateEmail(email);
		checkDupEmailDob(email,dob,customers);  //here duplicacy is checked for email & dob
		
//		plans servicePlan = parseAndVlidatePlan(plan); //here plans is validating
//		validatecharge(servicePlan,registrationAmount); //here plans charge is validating
		plans plantype=parseAndValidatePlanAndCharges(plan,registrationAmount); //here plantype and charge both are validating
		
		validatePassword(password);	
		parseAndValidateDob(birthdate);		
//		return new Customer(firstName,lastName,email,password, registrationAmount,servicePlan);
		return new Customer(firstName,lastName,email,password, birthdate,registrationAmount,plantype);
	}
	
	//for converting string date to LocalDate
	public static LocalDate validateDate(String dob) {
		return LocalDate.parse(dob);
	}
	
//	1. no dup customers (2 customers can't have the same email id n dob)
//	(i.e if the customer tries to register using existing email n dob , raise custom exception)
	
	public static void checkDupEmailDob(String email,String dob,List<Customer> customers)throws CustomerException{
		LocalDate date = LocalDate.parse(dob); //for converting dob to LocalDate
		Customer cust = new Customer(email,date);
		if(customers.contains(cust)) {
			throw new CustomerException("Duplicate entry !!! Email n Dob already exists!!");
		}
	}
	
//	2. Validate plan
//	plan must be of supported types
	public static plans parseAndVlidatePlan(String plan) {
		return plans.valueOf(plan.toUpperCase());
	}
	
	
//	3. reg amount must match with the plan
	public static void validatecharge(plans type, double registrationAmount) throws CustomerException {
		if (registrationAmount == type.getPlanAmt())
			throw new CustomerException("Insufficient charge! Minimum charge for "+type+" !!!");
		System.out.println("valid balance....");
	}

	//combination of above 2 methods i.e. parseANdValidate and validateCharge
	public static plans parseAndValidatePlanAndCharges(String plan,double registrationAmt)throws CustomerException {
		plans type = plans.valueOf(plan.toUpperCase());
		if(registrationAmt==type.getPlanAmt()) {
			return type;
		}
		throw new CustomerException("Registration amount doesn't match with the plans charge");
	}
	
//	4. email must contain @ and it should end with either .com | .org | .net
	public static Customer checkEmail(String email,List<Customer> customers)throws CustomerException {
		int index = customers.indexOf(customers);
		if(index == -1) {
			throw new CustomerException("Email Id not exist!!");
		}
//		else {
//			customers.contains()
//		}
		return customers.get(index);
	}
	public static void validateEmail(String email)throws CustomerException {
		String regex = "^(?=.*[a-z0-9])(?=.*[@])(?=.*[a-z]).*(\\.com|\\.org|\\.net)$";
//		String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.(com|org|net)\\b";

		if(!(email.matches(regex))) {
			throw new CustomerException("Invalid email");
		}
	}
	public static void validatePassword(String password)throws CustomerException {
		String regex ="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})";
		if(!(password.matches(regex))) {
			throw new CustomerException("Invalid password");
		}
		System.out.println("password validated");
	}
	
	public static void parseAndValidateDob(LocalDate dob)throws CustomerException{
		Period age = Period.between(dob,LocalDate.now());
		int agediff = age.getYears();
		//return agediff;
		if(agediff<21)
			throw new CustomerException("Invalid age");
		System.out.println("Valid age");
	}
	
}
