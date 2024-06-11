package com.app.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
import static com.app.utils.BankingValidations.*;

public class BankingApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// start up : init phase
			boolean exit = false;
			// init D.S -- array
			System.out.println("Enter max no of bank accounts");
			BankAccount[] accounts = new BankAccount[sc.nextInt()];// 100
			int counter = 0;
			while (!exit) {
				// clnt servicing phase
				System.out.println("Options : 1. Create A/C \n" + "2. Display All Accounts \n" + "0. Exit " +  "3. Display a/c summary \n"
);
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						// boundary condition checking
						if (counter < accounts.length) {
							System.out.println("Enter a/c details -  acctNo,  firstName,"

									+ " lastName,  acType,  dob, creationDate, balance");
							BankAccount acct = validateInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
									sc.next(), sc.nextDouble(),accounts);
							accounts[counter++] = acct;
							System.out.println("A/c created !");

						} else
							System.out.println("Bank capacity full !!!!");

						break;
					case 2: // display all account details
						System.out.println("All account details -");
						for (BankAccount a : accounts) //a=accounts[0],.....
							if (a != null)
								System.out.println(a);

						break;
					case 3:
						try {
							System.out.println("Enter acctNo : ");
							int acctNo=sc.nextInt();
//							int result = searchAccount(acctNo, accounts);
							BankAccount account = searchAccount(acctNo, accounts);
//							for(BankAccount b :accounts) {
//								if(acctNo==result)
//									System.out.println(b);
//							}
							System.out.println(account);
//							System.out.println(searchAccount(acctNo,accounts));
						}catch(Exception e) {
							System.out.println(e);
						}
						break;
						
					case 4:
						try {
							System.out.println("Enter acctNo : ");
							int acctNo=sc.nextInt();
							System.out.println("Enter amount to withdraw:");
							double amount=sc.nextDouble();
							BankAccount account = searchAccount(acctNo, accounts);
//							account = searchAccount(acctNo, accounts);
//							System.out.println("Updated balance: "+accounts.withdraw(amount));
							System.out.println("Updated balance: "+account.withdraw(amount));
						}catch(Exception e) {
							System.out.println(e);
						}
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					//read off all the pending tokens from the Scanner's buffer till new line
					sc.nextLine();
				}

			}
		} // JVM : sc.close()

		System.out.println("main over...");

	}

}