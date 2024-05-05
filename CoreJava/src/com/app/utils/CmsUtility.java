package com.app.utils;
import com.app.validationRules.CmsValidations;

import java.util.Arrays;
import java.util.Scanner;

import com.app.CustomerException.CustomerException;
import com.app.details.Customer;
//import com.app.plan_enum.plans;

public class CmsUtility {
	static int counter=0;
		public static void acceptDetails(Customer[] arr) throws CustomerException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter FirstName,  lastName,  email,  password,   registrationAmount,  plan : ");
			Customer cobj = CmsValidations.validateInputs(sc.next(),sc.next(),sc.next(),sc.next(), sc.nextDouble(),sc.next(),arr);
			arr[counter++]=cobj; //for storing objects
			System.out.println("Account created...!");
	    }
		
		public static void displayDetails(Customer[] arr) {
//			Customer[] arr=new Customer[];
			System.out.println("All customer details");
			for(Customer c : arr) {
				if(c != null)
					System.out.println(c);
			}
//			System.out.println(Arrays.toString(arr));
			
//			for(int i=0;i<arr.length;i++) {
//				System.out.println(arr[i].toString());
//			}
		}
		

}
