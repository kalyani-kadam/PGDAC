package com.app.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.app.entity.Stock;
import com.app.stockExc.StockException;

public class Utils {

	public static Stock addNewStock(String stockId,String stockName,String companyNm,double price,String date,int qty,Map<String,Stock> stocks) throws StockException
	{
		checkForDup(stockId,stocks);
		LocalDate closingDate = LocalDate.parse(date);
		return new Stock(stockId,stockName,companyNm,price,closingDate,qty);
	}
	public static void checkForDup(String stockId,Map<String,Stock> stocks) throws StockException{
//		stocks.get(stockId);
		
		if(stocks.containsKey(stockId)) {
			throw new StockException("Invalid id or duplicate entry!");
		}
//		for(Stock stock:stocks) {
//			if(stock.equals(s)) {
//				return true;
//			}
//		}
//		return false;
	}
	
	public static void stocksByCompany(String companyName,Map<String,Stock> stocks) throws StockException {
//		Stock st = new Stock(companyName);
//		int index = stocks.indexOf(stocks);
		if(stocks.get(companyName) == null) {
			System.out.println("company name not exists");
		}else {
			System.out.println(stocks.get(companyName));
		}
		
//		for (Stock s : stocks.values()) {
//			if(companyName.equals(s.getCompanyName())) {
//				System.out.println(s);
//			}else {
////				throw new StockException("Invalid company name");
//				System.out.println("company name not exists");
//			}
//		}
	}
	
	public static void purchaseStock(String srcid,String destid,int qty,Map<String,Stock> stocks) throws StockException {
//		Stock s = new Stock(srcid);
//		int index = stocks.indexOf(s);
//		int availabeQuantity = stocks.get(index).getQuantity();
		
		transferStock(srcid, destid, qty, stocks);
//		if(qty<=availabeQuantity) {
//			stocks.get(index).setQuantity(qty);
//		}else {
//			throw new StockException("Quantity exceeded");
//		}
	}
	
	
	public static void sellStock(String srcid,String destid,int qty,Map<String,Stock> stocks) throws StockException {
		transferStock(srcid, destid, qty, stocks);
	}
	
	public static Stock findDetails(String id,Map<String, Stock> stocks) throws StockException {
//		Stock s = new Stock(id);
//		int index = stocks.indexOf(s);
		if(stocks.get(id) == null) {
			throw new StockException("Invalid id");
		}
		return stocks.get(id);
	}
	
	public static void transferStock(String srcid,String destid,int qty,Map<String,Stock> stocks) throws StockException {
		Stock src = findDetails(srcid, stocks);
		Stock dest = findDetails(destid, stocks);
		
//		int srcIndex = stocks.indexOf(src);
//		int destIndex = stocks.indexOf(dest);
		int availabeQuantity = stocks.get(srcid).getQuantity();
		
		if(qty<=availabeQuantity) {
//			int srsQty = stocks.get(srcIndex).getQuantity();
			int destQty = stocks.get(destid).getQuantity();
			stocks.get(destid).setQuantity(qty+destQty);
			stocks.get(srcid).setQuantity(availabeQuantity-qty);
			System.out.println("Stock purchased successfully");
		}else {
			throw new StockException("Quantity exceeded");
		}
	}
	
	public static void writeDetails(Map<String,Stock> stocks,String filename) throws IOException{
		System.out.println("in write");
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
			out.writeObject(stocks);
		}
	}
	
	public static Object readDetails(String filename) throws ClassNotFoundException, IOException {
		System.out.println("in read");
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
			return in.readObject();
		}
	}
	
}
