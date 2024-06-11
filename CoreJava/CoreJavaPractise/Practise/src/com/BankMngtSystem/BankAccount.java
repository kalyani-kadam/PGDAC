package com.BankMngtSystem;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private static int counter=0; 
	
//	static{
//		counter=0;
//	}
	
//	public BankAccount(int accountNumber,String accountHolderName,double balance) throws Exception{
////			accountNumber++;
//			this.accountNumber=accountNumber;
//			if(isDigit(accountHolderName) == true) {
//				throw new BankException("Please enter character only!!");
//			}else {
//				counter++;
//				this.accountHolderName=accountHolderName;
//			}	
//			this.balance = balance;
//		}
	
	public BankAccount(String accountHolderName,double balance) throws Exception{
//		accountNumber++;
//		this.accountNumber=accountNumber;
		this.accountNumber=++counter;
		if(isDigit(accountHolderName) == true) {
			throw new BankException("Please enter character only!!");
		}else {
//			counter++;
			this.accountHolderName=accountHolderName;
		}
//		counter++;
		this.balance = balance;
	}
		

	public boolean isDigit(String accountHolderName) {
		if (accountHolderName == null) {
	        return false;
	    }
	    try {
	        int i = Integer.parseInt(accountHolderName);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
		return true;
	}

//		public double checkBalance() {
//			return this.balance;
//		}
//		public static boolean Character.isDigit(accountHolderName) {
//			return true;
//		}
		public String toString() {
			return "Account number: "+accountNumber+" Account holder name: "+this.accountHolderName+" Balance: "+this.balance;
		}
		
//		Getters an setters
		
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountHolderName() {
			return accountHolderName;
		}
		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
}