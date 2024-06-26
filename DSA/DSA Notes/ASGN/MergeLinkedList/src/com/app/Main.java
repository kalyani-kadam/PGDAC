package com.app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList1 LL1 = new  LinkedList1();
		
		System.out.println("----------------LinkedList1-------------------");
		LL1.insert(10);
		LL1.insert(20);
		LL1.insert(50);
		LL1.insert(60);
		LL1.insert(30);
		
		LL1.display();
		System.out.println();
		
		LinkedList2 LL2 = new  LinkedList2();
//		LL2.insert(100);
//		LL2.insert(200);
//		LL2.insert(300);
		//LL1.setLinkedList(LL2);
//		System.out.println(val);
		//LL1.insertLL2();
		
		System.out.println("----------------LinkedList2-----------------");
		LL2.display();
		
		System.out.println("\n============Combine===========");
		LL1.combine(LL2);
		LL1.display();
	}

}
