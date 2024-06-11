package com.BankMngtSystem;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//import com.customexceptiondemo.AccountException;

public class BankUtility {
	int no;
	String name;
	double balance;
	public void acceptCustomerDetails(BankAccount[] ba) throws Exception{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<ba.length;i++) {
			
			try {
//					System.out.println("Enter Account number: ");
//					no=sc.nextInt();
					System.out.println("Enter Account holders name: ");
					name=sc.next();
					System.out.println("Enter balance: ");
					balance=sc.nextDouble();
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Invalid input");
			}
			catch(Exception ex)
			{
				System.out.println("Some other error occured");
			}
//			ba[i] = new BankAccount(no,name,balance);
			
			ba[i] = new BankAccount(name,balance);
//			try {
//				ba[i] = new BankAccount(no,name,balance);
//			} catch (BankException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} // object creation
		}
	}
	
	public void displayCustomerDetails(BankAccount[] ba) {
		System.out.println("\n=======Account details========");
		for(int i=0;i<ba.length;i++) {
			System.out.println(ba[i]);
		}
		
//		System.out.println(Arrays.toString(ba));
	}
	
	public double Deposit(double amt) {
		return this.balance+=amt;
	}
	
	public double Withdraw(double amt) throws BankException {
		if(amt>this.balance)
		{
			throw new BankException("Insufficient balance!!!");
		}
		return this.balance-=amt;
	}	
}