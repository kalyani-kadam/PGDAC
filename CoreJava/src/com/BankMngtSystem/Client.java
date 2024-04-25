package com.BankMngtSystem;

import java.util.Scanner;

//import com.customexceptiondemo.AccountException;

public class Client {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many account you want to create: ");
		int s=sc.nextInt();
		int counter=0;
		BankAccount[] b = new BankAccount[s];
		BankUtility bu=new BankUtility();
		
		while(true) {
			System.out.println("\n**********MENU***********");
			System.out.println("\n0.Exit\n1.Accept Customer details\n2.Display Details\n3.Deposit money\n4.Withdraw money\n5.Check Balance");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.exit(0); //for existing from pragram 
			case 1:
				if(counter < s) {
					counter++;
					bu.acceptCustomerDetails(b);
				}else {
					System.out.println("Size limit reached!");
				}
				break;
			case 2:
				bu.displayCustomerDetails(b);
				break;
			case 3:
				System.out.println("Enter account no: ");
				int acno = sc.nextInt();
				
				for(int i=0;i<b.length;i++) {
					if(b[i].getAccountNumber() == acno) {
						System.out.println("Enter amount to be deposited: ");
						double amt=sc.nextDouble();
						double bal = bu.Deposit(amt);
						b[i].setBalance(bal);
						System.out.println(+amt+" has been deposited!\n"+"After deposit balance = "+b[i].getBalance());
						System.out.println("Money Depositted successful!!!");
					}
					else {
						System.out.println("Enter valid details!");
					}
				}
				break;
				
			case 4:
				System.out.println("Enter account no: ");
				int accno = sc.nextInt();
				
				for(int i=0;i<b.length;i++) {
					if(b[i].getAccountNumber() == accno) {
						System.out.println("Enter amount to be withdrawl: ");
						double amount=sc.nextDouble();
						
						try 
						{
							
							double bal = bu.Withdraw(amount);
							b[i].setBalance(bal);
							System.out.println(+amount+" has been withdraw!\n"+"After withdraw balance = "+b[i].getBalance()+"Rs/-");
							System.out.println("Money withdrawl successful!!!");
						}
						catch (BankException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
//						double bal = bu.Withdraw(amount);
//						b[i].setBalance(bal);
						
					}
					else {
						System.out.println("Enter valid details!");
					}
				}
				break;
			case 5:
				System.out.println("Enter account no: ");
				int accnum = sc.nextInt();
				
				for(int i=0;i<b.length;i++) {
					if(b[i].getAccountNumber() == accnum) {
						System.out.println("Customer having account no : "+b[i].getAccountNumber()+" has balance : " +b[i].getBalance()+"Rs/-");
					}
					else {
						System.out.println("Enter valid details!");
					}
				}	
				break;
			default:
				System.out.println("Invalid choice!!");
			}
		}	
	}
}
