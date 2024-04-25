package com.BankMngtSystem;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(int accountNumber,String accountHolderName,double balance) throws Exception{
//			accountNumber++;
			this.accountNumber=accountNumber;
			if(isDigit(accountHolderName)) {
				throw new BankException("Please enter character only!!");
				//break;
			}
			this.accountHolderName=accountHolderName;
			this.balance = balance;
		}
		
//		public double checkBalance() {
//			return this.balance;
//		}
		public static boolean isDigit(String accountHolderName) {
			return true;
		}
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
