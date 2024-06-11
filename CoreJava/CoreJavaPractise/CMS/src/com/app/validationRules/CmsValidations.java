package com.app.validationRules;

import com.app.CustomerException.CustomerException;
import com.app.details.Customer;
import com.app.plan_enum.plans;

public class CmsValidations {

	public static Customer validateInputs(String firstName, String lastName, String email, String password,  double registrationAmount, String plan, Customer arr[] ) throws CustomerException {

		//public Customer(String firstName, String lastName, String email, String password,  double registrationAmount, plans plan )
		checkDupEmail(email,arr);
		//return AcType.valueOf(acType.toUpperCase());
		plans servicePlan = parseAndAVlidatePlan(plan);
		return new Customer(firstName,lastName,email,password, registrationAmount,servicePlan);
	}

	public static plans parseAndAVlidatePlan(String plan) {
		return plans.valueOf(plan.toUpperCase());
	}
	
//	1 no dup customers (2 customers can't have the same email id)
//	(i.e if the customer tries to register using existing email , raise custom exception)

	public static void checkDupEmail(String email, Customer[] arr) throws CustomerException {
//		Customer obj = new Customer(email);
		for(Customer c : arr) {
//			if(c != null && c.equals(obj)) { //this will give wrong o/p as we are checking object not content for checking content getter of email is required 
			if(c!=null && c.getEmail().equals(email)) {
//				System.out.println("in cms validation");
				throw new CustomerException("Duplicate Entry..! Email already Exists!!");
			}
		}
	}
}
