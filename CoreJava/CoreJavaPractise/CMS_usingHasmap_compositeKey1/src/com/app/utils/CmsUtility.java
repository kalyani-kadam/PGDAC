package com.app.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.CustomerException.CustomerException;
import com.app.cms.Customer;
import com.app.cms.CustomerKey;
import com.app.cms.servicePlan;
import com.app.validationRules.CmsValidation;
public class CmsUtility {
	public static int index = 0;
	public static List<Customer> populatelist() {
		List<Customer> customers = new ArrayList<>(
		Arrays.asList(new Customer("Kalyani","Kadam","kk@123",2000,servicePlan.GOLD),
		new Customer("Kalyani","Kadam","kk@123",2000,servicePlan.GOLD),
		new Customer("Kalyani","Kadam","kk@123",2000,servicePlan.GOLD)));
		
		List<CustomerKey> custkey = new ArrayList<>(
				Arrays.asList(new CustomerKey("kk@gmail.com", LocalDate.parse("2001-01-22")),
						new CustomerKey("mk@gmail.com", LocalDate.parse("2012-01-22"))
				));
		customers.forEach(s -> s.assignCkeys(custkey.get(index++)));
		index = 0;
		return customers;
	}
	
	// add a static method to accept list of customer details & rets a map populated with the same
		
		public static Map<CustomerKey,Customer> populatemap(List<Customer> list){
			Map<CustomerKey,Customer> map = new HashMap<>();
//			list.forEach(s -> map.put(s.getCid(), s));
			for(Customer c:map.values())
				System.out.println(map.put(c.getCkeys().getEmail(), null);
		}
	
	/*
	 * public static Map<CustomerKey,Customer> populateCustomer() {
	 * 
	 * // CustomerKey key1 = new CustomerKey("kk@gmail.com",
	 * LocalDate.parse("2001-01-22")); // CustomerKey key2 = new
	 * CustomerKey("mk@gmail.com", LocalDate.parse("2010-01-22"));
	 * 
	 * Map<CustomerKey,Customer>customers = new HashMap<>();
	 * 
	 * customers.put(new CustomerKey("kk@gmail.com",
	 * LocalDate.parse("2001-01-22")),new
	 * Customer("Kalyani","Kadam","kk@123",2000,servicePlan.GOLD));
	 * customers.put(new CustomerKey("mk@gmail.com",
	 * LocalDate.parse("2012-01-22")),new
	 * Customer("Maya","Kadam","mk@123",1000,servicePlan.SILVER));
	 * System.out.println("data++++++++++++++"); System.out.println(customers); //
	 * for(Customer c:customers.values()) return customers; }
	 */
//		Customer c1 = new Customer("Kalyani","Kadam",)
////		Customer c1 = new Customer("Kalyani","Kadam","kk@gmail.com","kk@123",LocalDate.parse("2001-01-22"),2000,servicePlan.GOLD);
////		Customer c2 = new Customer("maya", "badam", "mk@gmail.com", "mk@123", LocalDate.parse("2090-11-20"), 1000, servicePlan.SILVER);
////		Customer c3 = new Customer("Uma", "Patil", "ap@gmail.com", "up123", LocalDate.parse("1995-09-13"), 5000, servicePlan.DIAMOND);
////		Customer c4 = new Customer("Uma", "S Patil", "up1@gmail.com", "up@1230", LocalDate.parse("1995-09-13"), 5000, servicePlan.DIAMOND);
////		Customer c5 = new Customer("Hari", "K Patil", "hp@gmail.com", "hp@123", LocalDate.parse("1985-08-18"), 10000, servicePlan.PLATINUM);
////		Customer c6 = new Customer("abc", "Agale", "abp@gmail.com", "abp@123", LocalDate.parse("1904-08-18"), 10000, servicePlan.PLATINUM);
//
//		Customer[] cust = {c1,c2,c3,c4,c5,c6};
////		Customer[] cust = {c1,c2,c3};
//		Map<CustomerKey,Customer> cust1 = new HashMap<>();
//		for(Customer c:cust) {
//			System.out.println(cust1.put(c.getEmail(),c));
//		}
//		return cust1;
//		map.put("Kalyani","Kadam",)
//	}
	
	@SuppressWarnings("unused")
	public static void signUP(Map<CustomerKey,Customer> customers,Scanner sc) throws CustomerException {
		System.out.println("Enter FirstName, LastName, Email, Password, DOB, RegistrationAmount, Plan : ");
//		Customer key1 = new Customer(sc.next(),sc.next());

//		public static Customer validateInput(String firstName, String lastName, String email, String password,String dob, double registrationAmount, String plan, Map<CustomerKey,Customer> customers)throws CustomerException{
//		Customer customer = validateInput(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),customer);
		Customer cobj = CmsValidation.validateInput(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),sc.next(), customers);

//		customers.put(cobj.getEmail(), cobj); //for adding elements into map
//		CustomerKey ckobj = null;
//		customers.put(ckobj, cobj);
		customers.put((CustomerKey) customers, cobj);
		System.out.println("Account created...!");
	}
	
	public static void displayDetails(Map<CustomerKey,Customer> customers) {
		System.out.println("all customers details");
		for(Customer c : customers.values())
			System.out.println(c);
	}
	
//	
	public static void signIN(String email,String password,Map<CustomerKey,Customer> customers)throws CustomerException {
		
//		CustomerKey c = new CustomerKey(email, null)
		@SuppressWarnings("unlikely-arg-type")
		Customer hasEmail = customers.get(email);
//		CustomerKey has = customers.get(email);
		System.out.println(hasEmail);
		if(hasEmail == null)
			throw new CustomerException("Invalid email");
		String checkpassword = hasEmail.getPassword();
		if(checkpassword.equals(password)) {
			System.out.println("Login successfully");
		}else {
			System.out.println("Invalid password");
		}
	}
}
