package com.app.fruits;

import java.util.Scanner;

public class FruitUtility {
	static int i;
	public void acceptDetails(Fruit[] arr,IsFresh fr) {
		
		Scanner sc = new Scanner (System.in);
		
//		public void getData() {
//			System.out.println("Enter name : ");
//			String name = sc.next();
//			System.out.println("Enter color: ");
//			String color = sc.next();
//			System.out.println("Enter weight: ");
//			double weight=sc.nextDouble();
//		}
		
		
//		while(i<arr.length) {
			
		System.out.println("\n********** Accept Details ***************");
		System.out.println("\n1.Mango\n2.Orange\n3.Apple\n");
		System.out.println("Enter which fruit you want to add: ");
		int ch=sc.nextInt();
		
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter color: ");
		String color = sc.next();
		System.out.println("Enter weight: ");
		double weight=sc.nextDouble();
		
			switch(ch) {
			case 1:
				arr[i] = new Mango(name,color,weight,fr);
				i++;
				break;
			case 2:
				arr[i] = new Orange(name,color,weight,fr);
				i++;
				break;
			case 3:
				arr[i] = new Apple(name,color,weight,fr);
				i++;
				break;
			}
//		}
	}
//	}
	
	public void displayDetails(Fruit[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
