package com.app.contact;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;


public class tester {
	public static void main(String[] args) {
//		int phoneNumber, String name, LocalDate dob, String email
		Contact c1=new Contact(802098,"Kalyani",LocalDate.parse("2001-01-01"),"kk@gmail.com");
		Contact c2=new Contact(802098,"Kalyani",LocalDate.parse("2000-02-12"),"kk@gmail.com");
		Contact c3=new Contact(802098,"Kalyani",LocalDate.parse("2001-01-01"),"kk@gmail.com");
		Contact c4=new Contact(802098,"Hari",LocalDate.parse("2000-01-01"),"kk@gmail.com");
		Contact c5=new Contact(802098,"Maya",LocalDate.parse("2010-10-11"),"kk@gmail.com");
		Contact c6=new Contact(802098,"Shlok",LocalDate.parse("2071-11-16"),"kk@gmail.com");
		Contact c7=new Contact(802098,"sai",LocalDate.parse("2015-12-19"),"kk@gmail.com");
		Contact c8=new Contact(802098,"Kalyani",LocalDate.parse("2000-12-12"),"kk@gmail.com");
		//create empty hashset
		HashSet<Contact> sh = new HashSet<>(); 
		
		System.out.println("c1:added: "+sh.add(c1)); //t without overriding equals and hashcode
		System.out.println("======================");
		System.out.println("c2:added: "+sh.add(c2)); //f
		System.out.println("======================");
		System.out.println("c3:added: "+sh.add(c3)); //f
		System.out.println("======================");
		System.out.println("c4:added: "+sh.add(c4)); //t
		System.out.println("======================");
		System.out.println("c5:added: "+sh.add(c5)); //t
		System.out.println("======================");
		System.out.println("c6:added: "+sh.add(c6)); //t
		System.out.println("======================");
		System.out.println("c7:added: "+sh.add(c7)); //t
		System.out.println("======================");
		System.out.println("c8:added: "+sh.add(c8)); //t
		System.out.println("======================");
		System.out.println("size: "+sh.size()); //5
		System.out.println("======================");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
//		System.out.println(c1.equals(c2)); //t
//		System.out.println(c1.equals(c4)); //t
		
//		after overriding equals and hashcode with constant return value duplicate element not added
		
//		System.out.println("Hashcode: "+c1.hashCode());
//		System.out.println("Hashcode: "+c2.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c5.hashCode());
		System.out.println(c6.hashCode());
		System.out.println(c7.hashCode());
		System.out.println(c8.hashCode());
		System.out.println("");
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter mobile no: ");
		 * int mobile=sc.nextInt(); System.out.println("Enter name: "); String
		 * name=sc.next(); System.out.println("enter dob: "); LocalDate date =
		 * LocalDate.parse(sc.next()); System.out.println("enter email: "); String
		 * email=sc.next(); // Contact c = new
		 * Contact(sc.nextInt(),sc.next(),sc.next(),sc.next()); Contact c = new
		 * Contact(mobile,name,date,email); sh.add(c); System.out.println(c);
		 * System.out.println(c.hashCode());
		 */
	}
}
