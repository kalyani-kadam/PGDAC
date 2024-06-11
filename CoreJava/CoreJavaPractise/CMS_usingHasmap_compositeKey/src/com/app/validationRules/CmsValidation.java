package com.app.validationRules;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.app.CustomerException.CustomerException;
import com.app.cms.Customer;
import com.app.cms.CustomerKey;
import com.app.cms.servicePlan;
import com.app.cms.servicePlan.*;

public class CmsValidation {
	public static Customer validateInput(String firstName, String lastName, String email, String password,String dob, double registrationAmount, String plan, Map<CustomerKey,Customer> customers)throws CustomerException{
//		for converting plan type present or not
		LocalDate date= parseDate(dob);
		
//		for checking plan type present or not
		servicePlan seriveceplan = parseAndValidatePlan(plan,registrationAmount);
		
//		for chaecking email and dob duplicate values are present or not
//		checkEmail(email,date);
		
		CustomerKey key1 = new CustomerKey(email,date);
		checkEmail(customers,email,date);
		return new Customer(firstName,lastName,password,registrationAmount,seriveceplan,key1);
		
	}
	
	public static void checkEmail(Map<CustomerKey,Customer> customers,String email,LocalDate dob) throws CustomerException {
//		CustomerKey ck = new CustomerKey(email,dob);
//		boolean index = customers.equals(key1);
//		if(index)
//			throw new CustomerException("Invalid email or dob! All word is done");
//		System.out.println("Validated Customer");
		
//		int index = customers.indexOf(customers);
//		if(index == -1) {
//			throw new CustomerException("Email Id not exist!!");
//		}
////		else {
////			customers.contains()
////		}
//		return customers.get(index);
		CustomerKey key1 = new CustomerKey(email,dob);
		if(customers.containsKey(key1))
			throw new CustomerException("Invalid email or dob!");
		System.out.println("Validated customer!");
	}

	public static LocalDate parseDate(String dob) {
		return LocalDate.parse(dob);
	}
	
	public static servicePlan parseAndValidatePlan(String plan,Double amt) throws CustomerException {
		servicePlan plantype = servicePlan.valueOf(plan.toUpperCase());
		if(amt == plantype.getRegtamt()) {
			return plantype;
		}
		else {
			throw new CustomerException("Plan and charge does not macth!!!");
		}
	}
	
//	public static void checkEmail(String email,LocalDate dob) throws CustomerException{
//		CustomerKey ck = new CustomerKey(email,dob);
//		boolean isPresent = ck.equals(ck);
//		if(isPresent == true)
//			throw new CustomerException("Email or Dob already exists!!");
//		System.out.println("Email and Dob validated!!");
		
//		if(customers.c)
//	}
	
	
	
}
