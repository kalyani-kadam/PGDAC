package com.app.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import com.app.entity.Stock;
import com.app.stockExc.StockException;

public class Utils {

	public static Stock addNewStock(String stockId, String stockName, String companyNm, double price, String date,
			int qty, List<Stock> stocks) throws StockException {
		checkForDup(stockId, stocks);
		LocalDate closingDate = LocalDate.parse(date);
		checkDate(closingDate);
		return new Stock(stockId, stockName, companyNm, price, closingDate, qty);

	}

	public static void checkDate(LocalDate date) throws StockException {
		if (date.isBefore(LocalDate.now())) {
			throw new StockException("invalid date");
		}
	}

	public static void checkForDup(String stockId, List<Stock> stocks) throws StockException {
		Stock s = new Stock(stockId);
		if (stocks.contains(s)) {
			throw new StockException("Invalid id or duplicate entry!");
		}

//		for(Stock stock:stocks) {
//			if(stock.equals(s)) {
//				return true;
//			}
//		}
//		return false;
	}

	public static boolean stocksByCompany(String companyName, List<Stock> stocks) throws StockException {
//		Stock st = new Stock(companyName);
//		int index = stocks.indexOf(stocks);
		for (Stock s : stocks) {
			if (companyName.equals(s.getCompanyName())) {
				System.out.println(s);
				return true;
			}
//			else {
//				throw new StockException("Invalid company name");
//				System.out.println("company name not exists");
//			}
		}
		return false;

	}

	public static void purchaseStock(String stockId, int qty, List<Stock> stocks) throws StockException {
//		Stock src = findDetails(stockId, stocks);
		Stock src = new Stock(stockId);
		int index = stocks.indexOf(src);
		if (index == -1) {
			throw new StockException("Invalid id");
		}
		int quantity = stocks.get(index).getQuantity();
		if (qty <= quantity) {
			stocks.get(index).setQuantity(qty + quantity);
			System.out.println("Stock updated successfully");
		} else {
			throw new StockException("Quantity exceeded");
		}
	}

	public static void sellStock(String stockId, int qty, List<Stock> stocks) throws StockException {
//		Stock src = findDetails(stockId, stocks);
		Stock src = new Stock(stockId);
		int index = stocks.indexOf(src);
		if (index == -1) {
			throw new StockException("Invalid id");
		}
		int quantity = stocks.get(index).getQuantity();
		if (qty <= quantity) {
			stocks.get(index).setQuantity(quantity - qty);
			System.out.println("Stock updated successfully");
		} else {
			throw new StockException("Quantity exceeded");
		}
	}

	public static void purchaseStock(String srcid, String destid, int qty, List<Stock> stocks) throws StockException {
		transferStock(srcid, destid, qty, stocks);
	}

	public static void sellStock(String srcid, String destid, int qty, List<Stock> stocks) throws StockException {
		transferStock(srcid, destid, qty, stocks);
	}

	public static Stock findDetails(String id, List<Stock> stocks) throws StockException {
		Stock s = new Stock(id);
		int index = stocks.indexOf(s);
		if (index == -1) {
			throw new StockException("Invalid id");
		}
		return stocks.get(index);
	}

	public static void transferStock(String srcid, String destid, int qty, List<Stock> stocks) throws StockException {
		Stock src = findDetails(srcid, stocks);
		Stock dest = findDetails(destid, stocks);

		int srcIndex = stocks.indexOf(src);
		int destIndex = stocks.indexOf(dest);
		int availabeQuantity = stocks.get(srcIndex).getQuantity();

		if (qty <= availabeQuantity) {
//			int srsQty = stocks.get(srcIndex).getQuantity();
			int destQty = stocks.get(destIndex).getQuantity();
			stocks.get(destIndex).setQuantity(qty + destQty);
			stocks.get(srcIndex).setQuantity(availabeQuantity - qty);
			System.out.println("Stock purchased successfully");
		} else {
			throw new StockException("Quantity exceeded");
		}
	}

	public static boolean searchByname(String name, List<Stock> stocks) throws StockException {
//		Stock  = new Stock();
//		stocks.forEach();

		for (Stock s : stocks) {
			if (s.getStockName().equals(name)) {
				System.out.println(s);
				return true;
			}
//			else {
//				throw new StockException("Invalid name or stock not exist");
//				System.out.println("Invalid name or stock not exist");
//			}
		}
		return false;
	}

	public static void writeDetails(List<Stock> stocks, String filename) throws IOException {
		System.out.println("in write");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(stocks);
		}
	}

	public static Object readDetails(String filename) throws ClassNotFoundException, IOException {
		System.out.println("in read");
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			return in.readObject();
		}
	}

	public static void writedetailsintxt(Stream<Stock> stocks, String filename)
			throws StockException, IOException, FileNotFoundException {
//		System.out.println("in write");
		try (PrintWriter pw = (new PrintWriter(new FileWriter(filename)))) {
			stocks.forEach(s -> pw.println(s));
		}
	}

	public static void readDetailsintxt(String fname1) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(fname1))) {
//		String line = null;
			br.lines().forEach(s -> System.out.println(s));
//		while((line = br.readLine()) != null ) {
//			System.out.println(line);
//		}		
		}
	}
}
