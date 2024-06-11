package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.app.utils.*;
import com.app.details.Customer;
import static com.app.utils.CmsUtility.*;

public class Tester {

	public static void main(String[] args) {
		
		
		try(Scanner sc=new Scanner(System.in)){
//			System.out.println("Enter max how many customer you want to add: "); //this is not required as list not have fix size
//			Customer[] carr=new Customer[sc.nextInt()];
			List<Customer> carr=new ArrayList<>();
			boolean exit=false;
			while(!exit) {
				try {
					System.out.println("============CMS Using ArrayList(primary key)===========");
					System.out.println("\n0. Exit \n1. SignUp \n2. SignIn \n3. Change password\n4. Un subscribe customer\n"
							+ "5. Display all customers\n6. Order by email \n7. Order by dob n lastname\n8. Removal by plan n specific date\n9. Populate customer"/*8. Validate password"*/);
					System.out.println("Enter choice: ");
					switch(sc.nextInt()) {
					
						case 0:
//							System.exit(0);
							System.out.println("Thank you!!!");
							exit = true;
							break;
						case 1:
							try {
								signUp(carr,sc);
								displayDetails(carr);
							}catch(Exception e) {
								System.out.println(e);
//								e.printStackTrace();
							}
							break;
							
						case 2:
//							displayDetails(carr);
							System.out.println("Enter email n password : ");
//							System.out.println(signIn(sc.next(), sc.next(), carr));
							signIn(sc.next(), sc.next(), carr);
							break;
							
						case 3:
							//if indexOf return -1 then invalid email otherwise exist 
							System.out.println("Enter email n password : ");
							changePassword(sc.next(),sc.next(),carr,sc);
							break; 
							
						case 4:
							System.out.println("Enter email: ");
//							System.out.println(unSubscribeCustomer(sc.next(),sc.next(),carr));
							System.out.println(unSubscribeCustomer(sc.next(),carr));
							break;
							
						case 5:
							displayDetails(carr);
							break;
							
						case 6:
							Collections.sort(carr);	
							break;
							
						case 7:
							Collections.sort(carr,new Comparator<Customer>() {
								@Override
								public int compare(Customer c1,Customer c2) {
									System.out.println("int anonymous class");
									int retVal = c1.getDob().compareTo(c2.getDob());
									if(retVal == 0) {
											return c1.getLastName().compareTo(c2.getLastName());
									}	
									else if(retVal > 0) {
										return c1.getLastName().compareTo(c2.getLastName());
									}
									return -1;	
								}
							});
							break;
							
						case 8:
							System.out.println("Enter plan n Date: ");
							removalByPlanNDob(sc.next(),sc.next(),carr);
							break;
							
						case 9:
							carr=populateCustomer();
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
