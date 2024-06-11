package com.app.bank;

import java.time.LocalDate;

public class BankStatement {
	private LocalDate transactionDate;
	private String narration;
	private double withdrawalAmount;
	private double depositeAmount;
	
	public BankStatement() {
		// TODO Auto-generated constructor stub
	}

	public BankStatement(LocalDate transactionDate, String narration, double withdrawalAmount, double depositeAmount) {
		
		this.transactionDate = transactionDate;
		this.narration = narration;
		this.withdrawalAmount = withdrawalAmount;
		this.depositeAmount = depositeAmount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}

	public void setWithdrawalAmount(double withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	public double getDepositeAmount() {
		return depositeAmount;
	}

	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}

	@Override
	public String toString() {
		return "BankStatement [transactionDate=" + transactionDate + ", narration=" + narration + ", withdrawalAmount="
				+ withdrawalAmount + ", depositeAmount=" + depositeAmount + "]";
	}
	
	
	
	
	
}
