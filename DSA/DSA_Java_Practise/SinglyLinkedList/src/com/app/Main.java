package com.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		System.out.println("in main");
		linkedlist list = new linkedlist();
		Scanner sc = new Scanner(System.in);
//		list.insert(10);
//		list.insert(40);
//		list.insert(90);
		
		for(int i=0;i<4;i++) {
			System.out.println("Enter data to add: ");
			list.insert(sc.nextInt());
		}
//		boolean isInserted = list.insert(10);
//		System.out.println(isInserted);
//		boolean isInserted1 = list.insert(90);
//		System.out.println(isInserted1);
		
//		boolean isInserted2 = list.insert(100);
//		System.out.println(isInserted);
		
		list.display();
//		list.findMax();
		System.out.println();
		list.findMaxNode();
		list.findMinNode();
		list.findSum();
	}

}