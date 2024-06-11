package com.app.utils;

import com.app.validationRules.CmsValidations;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import com.app.CustomerException.CustomerException;
import com.app.details.Customer;
import com.app.plan_enum.plans;
import com.app.plan_enum.*;
import static com.app.validationRules.CmsValidations.validateInputs;

public class CmsUtility {
//	Scanner sc = new Scanner(System.in);
	public static void signUp(List<Customer> customers,Scanner sc) throws CustomerException {
//		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FirstName, LastName, Email, Password, DOB, RegistrationAmount, Plan : ");
//			Customer cobj = CmsValidations.validateInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(), sc.nextDouble(),sc.next(),arr);
		Customer cobj = validateInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),sc.next(), customers);
		customers.add(cobj);     //for adding objects into Customer list 
		System.out.println("Account created...!");
	}

	public static void displayDetails(List<Customer> customers) {
		System.out.println("\n================= All customer details ==============");
		for (Customer c : customers) {
//			if(c != null) //this is not required in List
			System.out.println(c);
		}
	}
	
	public static void signIn(String email,String dob,String password,List<Customer> customers) throws CustomerException{
		LocalDate date = LocalDate.parse(dob);
		Customer c= new Customer(email,date);
		int index = customers.indexOf(c);
		
		if(index == -1 ) {
			throw new CustomerException("Invalid email / dob!!");
		}
		String checkpassword = customers.get(index).getPassword();

		if(checkpassword.equals(password)){
			System.out.println("Login successfully!!");
			System.out.println("Your details are: ");
			Customer cust = customers.get(index);
			System.out.println(cust);
		}
		else {
			throw new CustomerException("Invalid password...!");
		}
//		return index;
	}
	
	public static void changePassword(String email,String dob,String password,List<Customer> customers,Scanner sc)throws CustomerException{
		LocalDate date = LocalDate.parse(dob);
		Customer c= new Customer(email,date);
		int index = customers.indexOf(c);
		System.out.println("Enter new password: ");
		String newPassword=customers.get(index).setPassword(sc.next());
		System.out.println("Password updated succesfully!!");
	}
	
//	public static String unSubscribeCustomer(String email,String password,List<Customer> customers) throws CustomerException {
		public static String unSubscribeCustomer(String email,String dob,List<Customer> customers) throws CustomerException {
//		int index = signIn(email,password,customers);  //using this method also we can able to get unsubscribed customer details
//		removal by Pk --YES,remove(index) Or remove(Object)
			
		LocalDate date = LocalDate.parse(dob);
		Customer c= new Customer(email,date);
		int index = customers.indexOf(c);
//		System.out.println("unsubcsribe");
		if(index == -1)
			throw new CustomerException("Invalid email!!...Un Subscription failed!!!");
		return "Removed details of:"+customers.remove(index).getFirstName();
//		return customers.remove(index);
		
	}
	
	public static List<Customer> populateCustomer() {
		Customer c1 = new Customer("Kalyani","Kadam","kk@gmail.com","kk@123",LocalDate.parse("2001-01-22"),2000,plans.GOLD);
		Customer c2 = new Customer("maya", "kadam", "mk@gmail.com", "mk@123", LocalDate.parse("1990-11-20"), 1000, plans.SILVER);
		Customer c3 = new Customer("Uma", "Patil", "up@gmail.com", "up@123", LocalDate.parse("1995-09-13"), 5000, plans.DIAMOND);
		Customer c4 = new Customer("Parth", "Patil", "pp@gmail.com", "pp@123", LocalDate.parse("1995-09-13"), 5000, plans.DIAMOND);

		Customer[] cust = {c1,c2,c3,c4};
		List<Customer> cust1 = new ArrayList<>();
		for(Customer c:cust) {
			cust1.add(c);
			
//			cust1.add(c2);
//			cust1.add(c3);
		}
		
		return cust1;
	}
	
//	Remove all customer details from specified plan born after specified date.
//	i/p : plan n date
	
	public static void removalByPlanNDob(String plan,String dob,List<Customer> custList) throws CustomerException {
		LocalDate date = LocalDate.parse(dob) ;
		plans serviceplan = plans.valueOf(plan.toUpperCase());
		
		Iterator<Customer> custItr = custList.iterator();
		
		while(custItr.hasNext()){
			Customer c = custItr.next();
			if(c.getPlan() == serviceplan && c.getDob().isAfter(date)) {
				System.out.println("\nRemoved customer -->\n"+c);
				custItr.remove();
//				System.out.println(c);
//				System.out.println("Removed Customer : "+c.toString());
			}else {
				System.out.println("Invalid Customers");
			}
		}
	}
}
	