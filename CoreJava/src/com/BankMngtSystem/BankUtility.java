package com.BankMngtSystem;

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
					System.out.println("Enter Account number: ");
					no=sc.nextInt();
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
			
			ba[i] = new BankAccount(no,name,balance); // object creation
		}
	}
	
	public void displayCustomerDetails(BankAccount[] ba) {
		for(int i=0;i<ba.length;i++) {
			System.out.println(ba[i]);
		}
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
