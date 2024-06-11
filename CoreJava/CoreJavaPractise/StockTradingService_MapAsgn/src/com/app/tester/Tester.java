package com.app.tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.entity.Stock;
import static com.app.utils.Utils.*;;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Map<String,Stock> stocks = new HashMap<>();
			boolean exit = false;
			while(!exit) {
				try {
					System.out.println("\n0.Exit\n"
							+ "1.Add New stock in the market\n"
							+ "2.View Available stocks by Company\n"
							+ "3.Purchase stocks\n"
							+ "4.Sell Stocks\n"
							+ "5.Save n Exit\n"
							+ "6.Display all stocks\n");
					
					System.out.println("Enter option");
					switch(sc.nextInt()) {
					
					case 0:
						System.out.println("Thank u");
						exit = true;
						break;
					case 1:
						System.out.println("Enter stock id, stock name, company name, price, closing date, quantity\r\n"
								+ "");
						Stock stock = addNewStock(sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.nextInt(),stocks);
						stocks.put(stock.getStockId(),stock);
						System.out.println("New stock added");
						break;
//						1 pen cello 2000 2023-01-02 192
//						2 pencil natraj 4000 2003-11-22 392
					case 2:
						System.out.println("Enter company name");
						stocksByCompany(sc.next(),stocks);
						break;
						
					case 3:
						System.out.println("Enter src stockId n dest stockId n quantity");
						purchaseStock(sc.next(),sc.next(),sc.nextInt(),stocks);
						break;
						
					case 4:
						System.out.println("Enter src stockId n dest stockId n quantity");
						sellStock(sc.next(),sc.next(),sc.nextInt(),stocks);
						break;
						
					case 5:
						System.out.println("Enter file name for writing");
						writeDetails(stocks,sc.next());
						System.out.println("Enter file name for reading");
						Object o = readDetails(sc.next());
						System.out.println(o);
						break;
						
					case 6:
//						stocks.values().forEach(s -> System.out.println(s));
//						stocks.forEach(s -> System.out.println(s));
						for(Stock s:stocks.values()) {
							System.out.println(s);
						}
						break;
					}
				}catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
