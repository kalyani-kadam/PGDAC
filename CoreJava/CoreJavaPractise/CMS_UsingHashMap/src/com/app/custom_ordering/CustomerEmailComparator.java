package com.app.custom_ordering;

import java.util.Comparator;

import com.app.details.Customer;

public class CustomerEmailComparator implements Comparator<Customer> {
	public int compare(Customer c1,Customer c2) {
		System.out.println("int anonymous class");
		int retVal = c1.getDob().compareTo(c2.getDob());
		if(retVal==0) {
				return c1.getLastName().compareTo(c2.getLastName());
		}	
		else if(retVal > 0) {
			return c1.getLastName().compareTo(c2.getLastName());
		}
		return -1;	
	}
}
