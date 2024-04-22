package com.bookDemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	Scanner sc = new Scanner(System.in);
//     	
//		Book b = new Book(1,"Java","James",true);
//		Book b1 = new Book(1,"Java","James",true);
     	
     	System.out.println("Entere No of books you want to add : ");
     	int n = sc.nextInt();
     	
     	Book []arr = new Book[n];
     	
     	boolean av;
     	for(int i=0; i<arr.length; i++) {
     	System.out.println("Enter bookid : ");
     	int id = sc.nextInt();
     	System.out.println("Enter Title : ");
     	String title = sc.next();
     	System.out.println("Enter Author : ");
     	String auth = sc.next();
     	System.out.println("Enter Availability : ");
//     	boolean available = sc.hasNext();
     	
     	av = sc.nextBoolean();
     	arr[i] = new Book(id,title,auth,av);
     	}
		//b.BookCount;
     	
     	for(int i=0; i<arr.length; i++) {
     		System.out.println(arr[i]);
     	}
     	
//     	
//		System.out.println(b);
//		System.out.println(b1);
		int bc = Book.BookCounter();
		System.out.println("Book count: "+bc);
	}
}
