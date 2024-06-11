package com.app.tester;

import java.util.Scanner;
import com.app.utils.*;
import com.app.details.Customer;
import com.app.utils.CmsUtility;

public class Tester {

	public static void main(String[] args) {
		
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter max how many customer you want to add: ");
			Customer[] carr=new Customer[sc.nextInt()];
			int counter=0;
			while(true) {
				try {
					System.out.println("\n0.Exit \n1.Add customer \n2.Display customer \n");
					switch(sc.nextInt()) {
					
						case 0:System.exit(0);
						case 1:
							try {
								CmsUtility.acceptDetails(carr);
							}catch(Exception e) {
								System.out.println(e);
//								e.printStackTrace();
							}
							break;
							
						case 2:
							CmsUtility.displayDetails(carr);
	//						for(Customer c:carr) {
	//							System.out.println("in for ");
	//							if(c != null)
	//								System.out.println("in if");
	//								System.out.println(c.toString());
	//						}
							break;
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
