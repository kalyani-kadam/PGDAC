package com.app.utils;

import static com.app.validationRules.CmsValidations.validateInputs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.app.CustomerException.CustomerException;
import com.app.details.Customer;
import com.app.plan_enum.plans;

public class CmsUtility {
	public static void signUp(Map<String,Customer> customers,Scanner sc) throws CustomerException {
		System.out.println("Enter FirstName, LastName, Email, Password, DOB, RegistrationAmount, Plan : ");
		Customer cobj = validateInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),sc.next(), customers);
		customers.put(cobj.getEmail(), cobj); //for adding elements into map
		System.out.println("Account created...!");
	}

	public static void displayDetails(Map<String,Customer> customers) {
		System.out.println("All customer details");
		for (Customer c : customers.values()) {
			System.out.println(c);
		}
	}
	
	public static Customer signIn(String email,String password,Map<String,Customer> customers) throws CustomerException{
//		Customer c = new Customer(email);
//		
//		boolean hasEmail=customers.containsKey(c);
		
		Customer hasEmail = customers.get(email);
		if(hasEmail == null ) {
			throw new CustomerException("Invalid email!!");
		}
		String checkpassword = hasEmail.getPassword();
		
//		String checkpassword = customers.get(hasEmail).getPassword();  //java.lang.NullPointerException
//		String checkpassword = ((Customer) customers).getPassword();  //java.lang.ClassCastException: class java.util.HashMap cannot be cast to class com.app.details.Customer (java.util.HashMap is in module java.base of loader 'bootstrap'; com.app.details.Customer is in unnamed module of loader 'app')

		if(checkpassword.equals(password)){
			System.out.println("Login successfully!!");
//			String customerdata= c.toString();
//			System.out.println(customerdata);
			return hasEmail;
		}
		else {
			throw new CustomerException("Invalid password...!");
		}
	}
	
	public static void changePassword(String email,String password,Map<String,Customer> customers,Scanner sc)throws CustomerException{

//		Customer c =new Customer(email);  //overloaded constructor is not required in map
		boolean hasEmail = customers.containsKey(email);
		System.out.println("Enter new password: ");
//		Customer c = new Customer(cs.next());
//		String newPassword=customers.get(index).setPassword(sc.next());
		String newPassword=customers.get(hasEmail).setPassword(sc.next());
		System.out.println("Password updated succesfully!!");
	}
	
		@SuppressWarnings("unlikely-arg-type")
		public static void unSubscribeCustomer(String email,Map<String,Customer> customers) throws CustomerException {
//		int index = signIn(email,password,customers);  //using this method also we can able to get unsubscribed customer details
//		removal by Pk --YES,remove(index) Or remove(Object)
			
//		Customer getRemoverData = customers.get(email);
//		System.out.println("Removing details of : "+getRemoverData);
		System.out.println("Removing details of : "+customers.get(email));
		if(customers.get(email) == null)
			throw new CustomerException("Invalid email!!...Un Subscription failed!!!");
		customers.remove(email);
		
	}
	
	public static Map<String,Customer> populateCustomer() {
		Customer c1 = new Customer("Kalyani","Kadam","kk@gmail.com","kk@123",LocalDate.parse("2001-01-22"),2000,plans.GOLD);
		Customer c2 = new Customer("maya", "badam", "mk@gmail.com", "mk@123", LocalDate.parse("2090-11-20"), 1000, plans.SILVER);
		Customer c3 = new Customer("Uma", "Patil", "ap@gmail.com", "up123", LocalDate.parse("1995-09-13"), 5000, plans.DIAMOND);
		Customer c4 = new Customer("Uma", "S Patil", "up1@gmail.com", "up@1230", LocalDate.parse("1995-09-13"), 5000, plans.DIAMOND);
		Customer c5 = new Customer("Hari", "K Patil", "hp@gmail.com", "hp@123", LocalDate.parse("1985-08-18"), 10000, plans.PLATINUM);
		Customer c6 = new Customer("abc", "Agale", "abp@gmail.com", "abp@123", LocalDate.parse("1904-08-18"), 10000, plans.PLATINUM);

		Customer[] cust = {c1,c2,c3,c4,c5,c6};
//		Customer[] cust = {c1,c2,c3};
		Map<String, Customer> cust1 = new HashMap<>();
		for(Customer c:cust) {
			System.out.println(cust1.put(c.getEmail(),c));
		}
		
		return cust1;
	}
	
//	Remove all customer details from specified plan born after specified date.
//	i/p : plan n date
	
	
	  public static void removalByPlanNDob(String plan,String dob,Map<String,Customer> customers) throws CustomerException { 
		  LocalDate date = LocalDate.parse(dob) ; 
		  plans serviceplan = plans.valueOf(plan.toUpperCase());
		  System.out.println(date);
		  System.out.println(serviceplan);
			Iterator<Customer> custItr = customers.values().iterator();
			
			while(custItr.hasNext()){
				Customer c = custItr.next();
				if(c.getPlan() == serviceplan && c.getDob().isAfter(date)) {
					System.out.println("Removed customer -->\n"+c);
					custItr.remove();
//					System.out.println(c);
//					System.out.println("Removed Customer : "+c.toString());
				}
			}
	  }
//		  Customer removedcust = custList.remove(custList);
//		  System.out.println(removedcust);
//		  Customer removed  = customers.get(serviceplan);
//				   Customer  customers.get(date);
//
//		  if(customers.containsKey(serviceplan) == false) {
//			  System.out.println(customers.containsKey(serviceplan));
//			  if(customers.containsKey(date) == false) {
//				  System.out.println(customers.containsKey(date));
//				  throw new CustomerException("Invalid plan / Dob!!! Removal failed");
//			  }
//		  }	  
		  
//		  if(customers.get(serviceplan) == null) {
//			  System.out.println(customers.containsKey(serviceplan));
//			  if(customers.get(date) == null) {
//				  System.out.println(customers.containsKey(date));
//				  throw new CustomerException("Invalid plan / Dob!!! Removal failed");
//			  }
//		  }
//
//		  customers.remove(customers);
			
			
//			  Customer removedcust = custList.remove(custList);
//			  System.out.println(removedcust);
//			  System.out.println("Account removed");
//		  }
//		  else {
//			  throw new CustomerException("Invalid plan/Dob!!! Removal failed");
//		  }
//		  if(removedcust == null) {
//			  throw new CustomerException("customer not exist!!!");
//		  }
//		  System.out.println(removedcust);
//		  boolean removalCust = ((Customer) custList).getPlan() == serviceplan && custList.getDob().isAfter(date);
		  
		  
//		  Iterator<Customer> custItr = custList.iterator();
//		  List<String,Customer> list = new LinkedList<>(custList.values());
//		  List<Customer> list = new LinkedList<>(custList.values());
//		  for(Customer c : list) {
//			  if(c.getPlan() == serviceplan && c.getDob().isAfter(date)) {
//				  System.out.println("Removed customer: "+c);
//				  	System.out.println(custList.remove(c));
//			  }
//		  }
//		  while(list.hasNext()){ 
//		  Customer c = list.next(); 
//		  if(c.getPlan() == serviceplan && c.getDob().isAfter(date)) {
//		  System.out.println("Removed customer -->\n"+c); list.remove(); 
//		  System.out.println(c); //
//		  System.out.println("Removed Customer : "+c.toString()); 
//		} 
//	  } 
//	}
	 
}