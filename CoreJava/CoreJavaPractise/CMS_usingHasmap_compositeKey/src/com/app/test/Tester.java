package com.app.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.app.utils.CmsUtility.*;
import com.app.cms.Customer;
import com.app.cms.CustomerKey;
import com.app.cms.servicePlan;
import com.app.validationRules.CmsValidation;

@SuppressWarnings("unused")
public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
//			Customer key1 = new Customer("kk@gmail.com","2001-01-22"); 
//			Map<CustomerKey,Customer> customers = new HashMap<>();
			Map<CustomerKey,Customer> customers = populateCustomer();
			
//			customers.put(new CustomerKey("kk@gmail.com", "2001-01-22"),"Kalyani","Kadam","kk@123",2000,servicePlan.GOLD);
			while(true) {
				try {
					System.out.println("\n============ CMS Using Hashmap(Composite key) ===========");
//					System.out.println("\n0. Exit \n1. SignUp \n2. SignIn \n3. Change password\n4. Un subscribe customer\n"
//							+ "5. Display all customers\n6. Order by email \n7. Order by dob n lastname\n8. Removal by plan n specific date\n9. Populate customer"/*8. Validate password"*/);
					System.out.println("\n0. Exit \n1. SignUP\n2. SignIN\n3. Display all customers\n");
					System.out.println("===================================\n");
					System.out.println("Enter choice: ");
					
					switch(sc.nextInt()) {
					case 0:
						System.out.println("Thank you!!!");
						System.exit(0);
						
					case 1:
						signUP(customers,sc);
						break;
						
					case 2:
						System.out.println("Enter email n dob n password: ");
//						signIN("kk@gmail.com", "kk@123", customers);
						signIN(sc.next(), sc.next(),sc.next(), customers);
//						System.out.print(signIN(sc.next(), sc.next(), customers));
						break;
					case 3:
						displayDetails(customers);
						break;
//					case 4:
//						customers = CmsValidation.validateInput(populateCustomer());
//						break;
					
					}
				}catch(Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}
				
			}
		}

	}

}
