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
	public  synchronized  void updateBalance(double amt) throws Exception {
		System.out.println("Updating bal : " + currentThread().getName());
		balance = balance + amt;
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(20);//simulating think time !
		balance = balance - amt;
		System.out.println("Updations over by " + currentThread().getName());
	}

	// chk balance
	public synchronized  double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());
		Thread.sleep(37);
		return balance;

	}

}
