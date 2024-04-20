package com.Static;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e;
		e=new employee(1,"Kalyani");
		
//		e.printDetails(); 				  //Eid: 1 Name: Kalyani
//		System.out.println(e.toString()); //com.Static.employee@2d363fb3
//		System.out.println(e);  		  //com.Static.employee@2d363fb3
		
//		using override 
//		System.out.println(e.toString()); //eid-1 name-Kalyani
		System.out.println("For object e");
		e.getId();
		e.getName();
		System.out.println(e);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id =sc.nextInt();
		System.out.println("Enter name: ");
		String name=sc.next();
		employee e1=new employee(id,name);
		System.out.println(e1);
		
		System.out.println("After update");
		e1.setId(9);
		e1.setName("Rutu");
		System.out.println(e1);
		
		System.out.println("Auto increment id");//for this eid start from 1
		System.out.println("Enter name: ");
		String ename=sc.next();
		employee e2 = new employee(ename);
		System.out.println(e2); 
		
		System.out.println("there are total "+ employee.getCount() +" object created");
//		employee.getCount();
	}	
}