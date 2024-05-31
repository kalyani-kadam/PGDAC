package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.utils.CMSUtils;
import com.app.utils.CMSValidations;

public class CMSApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			boolean exit = false;
			// init D.S
			List<Customer> customerList = new ArrayList<>();// size : 0 , init cap 10
			while (!exit) {
				System.out.println("Options : 1. Customer Sign Up 2. Display all 3. Customer Sign in0. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1: // register new customer
						System.out.println(
								"Enter customer details : firstName,  lastName,  email,  password,	regAmount,  dob,  plan");
						Customer customer = CMSValidations.validateCustomerInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(), sc.next(), sc.next(), customerList);
						//=> all i/ps are valid
						customerList.add(customer);
						System.out.println("customer registered....");
						break;
					case 2 ://display all
						for(Customer c : customerList)
							System.out.println(c);
						break;
						
					case 3 : //login
						System.out.println("Enter email n pwd");
						customer=CMSUtils.authenticateCustomer(sc.next(),sc.next(),customerList);
						System.out.println("Successful login , Your details "+customer);
						break;
					case 4 : //change password
						System.out.println("Enter email n old pwd n new password");
						customer=CMSUtils.authenticateCustomer(sc.next(),sc.next(),customerList);
						//change password
						customer.setPassword(sc.next());
						System.out.println("password changed !");
						break;
					case 5 : System.out.println("Enter email to un subscribe");
					CMSUtils.deleteCustomerDetails(sc.next());
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);// toString
				}
			}
		}

	}

}
