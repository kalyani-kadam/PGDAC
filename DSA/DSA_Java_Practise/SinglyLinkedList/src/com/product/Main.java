package com.product;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList products = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element u wanna to add: ");
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			System.out.println("Enter id,name,quantity,price");
			Product p = new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble());
			System.out.println("Data given suuccessfully");
			products.insertData(p);
		}
		products.displayData();
	}
}