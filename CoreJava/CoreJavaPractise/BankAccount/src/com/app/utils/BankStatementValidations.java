package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.bank.BankStatement;

public class BankStatementValidations {
	
	public static double calculateSumOfAllDeposites(List<BankStatement>lst)
	{
		double sum1=lst.stream().mapToDouble(p -> p.getDepositeAmount()).sum();
		return sum1;
	}
	public static double calculateMaxDepositAmount(List<BankStatement>lst)
	{
		double amount=lst.stream().mapToDouble(p -> p.getDepositeAmount()).max().orElse(0.0);
		return amount;
	}
	public static double calculateShoppingExpenses(List<BankStatement>lst)
	{
		double s=lst.stream()
				.filter(p->p.getNarration()
				.equals("Shopping"))
				.mapToDouble(p->p.getWithdrawalAmount())
				.sum();
		return s;
	}
	public static LocalDate calculateDateOnWhichMaxAmountWithdrawn(List<BankStatement>lst)
	{
		LocalDate d = lst.stream()
			    .max((o1, o2) -> Double.compare(o1.getWithdrawalAmount(), o2.getWithdrawalAmount()))
			    .map(p-> p.getTransactionDate())
			    .orElse(null);

        return d;
	}

}
