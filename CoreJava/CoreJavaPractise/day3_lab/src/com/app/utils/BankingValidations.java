package com.app.utils;

import java.time.LocalDate;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
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

	// add public static method to validate all i/ps
	public static BankAccount validateInputs(int acctNo, String fName, String lastName, String acType, String dob,
			String creationDate, double balance) 
					throws BankingException {
		AcType type = AcType.valueOf(acType.toUpperCase());
		LocalDate birthDate = LocalDate.parse(dob);
		LocalDate crDate = LocalDate.parse(creationDate);
		validateBalance(balance);
		//=> all i/ps are valid
		return new BankAccount(acctNo, fName, lastName, 
				type, birthDate, crDate, balance);
	}
}
