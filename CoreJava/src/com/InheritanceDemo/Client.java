package com.InheritanceDemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
//		System.out.println("********default constructor*********");
//		Vehicle v= new Vehicle();
//		System.out.println(v);
//		Car c = new Car();
//		System.out.println(c);
//		System.out.println("*********parameterised constructor******");
//		Car c1 = new Car("Ford",4);
//		System.out.println(c1);
//		Vehicle v1= new Vehicle("Tata");
//		System.out.println(v1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many car you want to add: ");
		int how = sc.nextInt();
		Vehicle[] arr = new Vehicle[how];
		do {
			System.out.println("******************************");
			System.out.println("1.Accept details\n2.Display Details");
			System.out.println("******************************");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			if(choice!=1 | choice!=2) {
				System.out.println("Invalid choice");
			}
			switch(choice) {
			case 1:
				System.out.println("********** Accept *************");
				vehicleUtilityClass.acceptVehicleDetails(arr);
				
			case 2:
				System.out.println("*********** Display ***********");
				vehicleUtilityClass.displayVehicleDetails(arr);
				System.out.println("******************************");
			default:
				return;
			}
		}while(true);
	}

}
