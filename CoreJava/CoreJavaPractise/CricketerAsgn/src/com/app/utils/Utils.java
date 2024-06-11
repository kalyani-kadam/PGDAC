package com.app.utils;

import java.util.List;

import com.app.entity.Cricketer;
import com.app.exception.CricketersException;

public class Utils {
	public static Cricketer addNewCricketer(String name, int age, String email_id, String Phone, int rating) {
		return new Cricketer(name, age, email_id, Phone, rating);
	}
	
	
	public static void modifyRating(String nm,int rating,List<Cricketer> cricketers) throws CricketersException{
		Cricketer c = new Cricketer(nm);
		System.out.println(c);
//		int index = cricketers.get(id).getId();
		int index = cricketers.indexOf(c);
//		System.out.println(index);
		if(index == -1) {
			throw new CricketersException("Cant modify rating!!..Invalid id");
		}
//		System.out.println("Modifying details with id = "+index); 
//		c.setRating(rating);
		cricketers.get(index).setRating(rating);
//		c.setRating(rating);
		System.out.println("Rating modified for id = "+cricketers.get(index).getId());
	}
	
	public static Cricketer serchByName(String nm,List<Cricketer> cricketers) throws CricketersException {
		Cricketer c = new Cricketer(nm);
//		System.out.println(c);
		for(Cricketer cr:cricketers) {
//			System.out.println(cr);
			if(cr != null && cr.equals(c)) {
//				System.out.println(cr);
				return cr;
			}
		}
		throw new CricketersException("invalid name");
	}
	
	public static void displaybyrating(List<Cricketer> cricketers) {
		Cricketer c = new Cricketer();
		
		
	}
}
