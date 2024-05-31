package com.app.utils;

import com.app.custom_exceptions.BankingException;

public class BankingValidations {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

//add public static method to validate for min bal
	public static void validateBalance(double balance) throws BankingException {
		if (balance < MIN_BALANCE)
			throw new BankingException("Insufficient Balance !!!!!");
		System.out.println("valid balance....");
	}
}
