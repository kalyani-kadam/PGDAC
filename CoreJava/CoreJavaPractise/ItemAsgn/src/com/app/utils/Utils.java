package com.app.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.app.entity.Item;

public class Utils {
	public static Item addNewItem(String code,String desc, double price, String sdate,Map<String,Item>item) {
		LocalDate shipmentDate = LocalDate.parse(sdate);
		return new Item(code,desc,price,shipmentDate);
	}
	
	public static void displayDetails(Map<String,Item> items) {
		for(Item i : items.values()) {
			System.out.println(i);
		}
	}
	
	public static void writeDetails( List<Item> items, String fileName) throws IOException {
		// Java App --> OOS --> FOS (bin file)
		try (ObjectOutputStream out = 
				new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(items);// serialization
		} // JVM : out.close --fos.close --close the file handle
	}
	
	public static Object readDetails(String fileName) throws IOException, ClassNotFoundException{
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
			return in.readObject();
		}
	}
	 
}