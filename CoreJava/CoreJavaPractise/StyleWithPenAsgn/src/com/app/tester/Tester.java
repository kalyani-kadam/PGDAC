package com.app.tester;

import static com.app.utils.PenUtil.*;
import static com.app.validations.ValidationRules.validateInputs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.entity.Pen;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			List<Pen> pens = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				try {

					System.out.println("0.Exit\n1. Add new Pen\r\n" + "2. Update stock of a Pen\r\n"
							+ "3. Set discount of 20% for all the pens which are not at all sold in last 3 months\r\n"
							+ "4. Remove Pens which arenever sold once listed in 9 months\r\n"
							+ "5. Display available pens details\n");

					System.out.println("Choose an option");
					int ch = sc.nextInt();
					switch (ch) {
					case 0:
						System.out.println("Thank you!!!");
						exit = true;
						break;

					case 1:
						System.out.println("Enter pen details: brand, color, inkColor, material, Stock, price ");
						Pen pen = validateInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(),
								pens);
						pens.add(pen);
						System.out.println("Pen details added with Id=" + pen.getID());
						break;
//					cello red black metal 10 5 10
//					reynolds black black alloysteel 20 10 2
					
					case 2:
						System.out.println("Enter pen id & stock quantity for updating stock");
						UpdateStock(sc.nextInt(), sc.nextInt(), pens);
						break;

					case 3:
						setDiscount(pens);
						break;

					case 4:
						removePen(pens);
						break;

					case 5:
						for (Pen p : pens) {
							if (p != null)
								System.out.println(p);
							else {
								System.out.println("Pen not added yet!! Or all pens are removed!!");
							}
						}
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
