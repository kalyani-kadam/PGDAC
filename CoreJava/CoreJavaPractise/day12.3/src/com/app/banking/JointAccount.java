package com.app.banking;

import static java.lang.Thread.*;

public class JointAccount {
	private double balance;

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	// update balance
	public void updateBalance(double amt) throws Exception {
		System.out.println("---------update balance----------------");
		System.out.println("Updating bal : " + currentThread().getName());
		System.out.println("before updating balance "+balance);
		balance = balance + amt;
		System.out.println("after deposit balance "+balance);
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(20);//simulating think time !
		balance = balance - amt;
		System.out.println("after withdraw balance "+balance);
		System.out.println("Updations over by " + currentThread().getName());
	}
	
	public void deposit(double amt) throws Exception {
		System.out.println("---------update balance----------------");
		System.out.println("Updating bal : " + currentThread().getName());
		System.out.println("before updating balance "+balance);
		balance = balance + amt;
		System.out.println("after deposit balance "+balance);
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(20);//simulating think time !
		System.out.println("Updations over by " + currentThread().getName());
	}

	public synchronized void withdraw(double amt) throws Exception {
		System.out.println("---------update balance----------------");
		System.out.println("Updating bal : " + currentThread().getName());
		System.out.println("before updating balance "+balance);
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(20);//simulating think time !
		balance = balance - amt;
		System.out.println("after withdraw balance "+balance);
		System.out.println("Updations over by " + currentThread().getName());
	}
	// chk balance
	public synchronized double checkBalance() throws Exception {
		System.out.println("---------check balance----------------");
		System.out.println("Checking balance : by "+ currentThread().getName());
		System.out.println("balance in checkbalance "+balance);
		Thread.sleep(37);
		return balance;

	}

}
