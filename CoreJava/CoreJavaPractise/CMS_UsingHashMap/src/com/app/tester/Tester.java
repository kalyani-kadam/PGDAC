package com.app.tester;

import static com.app.utils.CmsUtility.changePassword;
import static com.app.utils.CmsUtility.displayDetails;
import static com.app.utils.CmsUtility.populateCustomer;
import static com.app.utils.CmsUtility.removalByPlanNDob;
import static com.app.utils.CmsUtility.signIn;
import static com.app.utils.CmsUtility.signUp;
import static com.app.utils.CmsUtility.unSubscribeCustomer;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.custom_ordering.CustomerEmailComparator;
import com.app.details.Customer;

public class Tester {

	public static void main(String[] args) {
		
		
		try(Scanner sc=new Scanner(System.in)){
//			System.out.println("Enter max how many customer you want to add: "); //this is not required as list not have fix size
//			Customer[] customers=new Customer[sc.nextInt()];
//			List<Customer> customers=new ArrayList<>();
			
			Map<String,Customer> customers=new HashMap<>();
			boolean exit=false;
			while(!exit) {
				try {
					
					System.out.println("\n0. Exit \n1. SignUp \n2. SignIn \n3. Change password\n4. Un subscribe customer\n"
							+ "5. Display all customers\n6. Order by email \n7. Order by dob n lastname\n8. Removal by plan n specific date\n9. Populate customer"/*8. Validate password"*/);
					System.out.println("====================================\nEnter choice: ");
					switch(sc.nextInt()) {
					
						case 0:
//							System.exit(0);
							System.out.println("Thank you!!!");
							exit = true;
							break;
						case 1:
							try {
								signUp(customers,sc);
								displayDetails(customers);
							}catch(Exception e) {
								System.out.println(e);
//								e.printStackTrace();
							}
							break;
							
						case 2:
//							displayDetails(customers);
							System.out.println("Enter email n password : ");
							System.out.println(signIn(sc.next(), sc.next(), customers));
							break;
							
						case 3:
							//if indexOf return -1 then invalid email otherwise exist 
							System.out.println("Enter email n password : ");
							changePassword(sc.next(),sc.next(),customers,sc);
							break; 
							
						case 4:
							System.out.println("Enter email: ");
//							System.out.println(unSubscribeCustomer(sc.next(),sc.next(),customers));
//							System.out.println(unSubscribeCustomer(sc.next(),customers));
							unSubscribeCustomer(sc.next(),customers);
							break;
							
						case 5:
							displayDetails(customers);
							break;
							
						case 6:
							TreeMap<String,Customer> cust = new TreeMap<>(customers);
//							LinkedList<Customer> custList1 = new LinkedList<>(customers.values());
//							Collections.sort(custList1);	
							System.out.println("=========== Sorted customer as per asc email ============");
							for(Customer c:cust.values()) {
//								System.out.println("hoihoknbj");
								System.out.println(c);
								}
							break;
							
						case 7:
							LinkedList<Customer> custList = new LinkedList<>(customers.values());
							Collections.sort(custList,new CustomerEmailComparator()); 
//							{
//								@Override
//								public int compare(Customer c1,Customer c2) {
//									System.out.println("int anonymous class");
//									int retVal = c1.getDob().compareTo(c2.getDob());
//									if(retVal==0) {
//											return c1.getLastName().compareTo(c2.getLastName());
//									}	
//									else if(retVal > 0) {
//										return c1.getLastName().compareTo(c2.getLastName());
//									}
//									return -1;	
//								} 
//							});
							
							System.out.println("\n=========== Sorted as per dob n lastname ===========");
							for(Customer c: custList)
								System.out.println(c);
							
							break;
							
						case 8:
							System.out.println("Enter plan n Date: ");
							removalByPlanNDob(sc.next(),sc.next(),customers);
							break;
							
						case 9:
							customers=populateCustomer();
							break;
//						case 8:
//							String regex="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})";
//							System.out.println("abcd".matches(regex));
//							break;
						}	
				}catch(Exception e) {
					System.out.println(e);
					//read off all the pending tokens from the Scanner's buffer till new line
					sc.nextLine();
				}
			}
		}
	}
}
