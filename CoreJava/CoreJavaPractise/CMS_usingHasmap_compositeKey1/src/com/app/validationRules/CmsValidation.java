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
		LocalDate date= parseDate(dob);
		servicePlan seriveceplan = parseAndValidatePlan(plan,registrationAmount);
//		Customer key1 = new Customer(email,date);
		
		return new Customer(firstName,lastName,email,password,date,registrationAmount,seriveceplan);
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
	
	
	
}
