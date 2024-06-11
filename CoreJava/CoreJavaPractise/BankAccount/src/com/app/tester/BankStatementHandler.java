package com.app.tester;

import static com.app.utils.IOUtils.readDetails;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.OptionalDouble;

import com.app.bank.BankStatement;
import static com.app.utils.BankStatementValidations.*;
public class BankStatementHandler {

	public static void main(String[] args) {
		String filename="Jan2023.txt";
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try
		{
		List<BankStatement>lst=readDetails(filename);
		double sumOfAllDeposits = calculateSumOfAllDeposites(lst);
	    double maxDepositAmount= calculateMaxDepositAmount(lst);
	    double shoppingExpenses = calculateShoppingExpenses(lst);
		LocalDate date= calculateDateOnWhichMaxAmountWithdrawn(lst);
		String d1=date.format(d);
		System.out.println("Sum Of All Deposits: "+sumOfAllDeposits);
		System.out.println("Max Deposit Amount: "+maxDepositAmount);
		System.out.println("Shopping Expenses: "+shoppingExpenses);
		System.out.println("Date on which max amount withdrawn: "+d1);

		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
