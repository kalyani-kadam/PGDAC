package com.InheritanceDemo;

import java.util.Scanner;

public class vehicleUtilityClass {
	
	public static void acceptVehicleDetails(Vehicle[] varr){
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<varr.length;i++) {
//			System.out.println("enter brand: ");
//			String brand = sc.next();
			
//			varr[i] = new Car(brand,nod);
			System.out.println("Enter which vehicle you want to add: \n1.Car\n2.MOtorcycle");
			System.out.println("enter choice ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter brand: ");
				String brand = sc.next();
				System.out.println("Enter no of doors: ");
				int nod = sc.nextInt();
				varr[i] = new Car(brand,nod);
				break;
			case 2:
				System.out.println("enter brand: ");
				String brand1 = sc.next();
				System.out.println("Enter type of engine: ");
				String engine=sc.next();
				varr[i] = new Motorcycle(brand1,engine);
			}
			
		}
	}
	public static void displayVehicleDetails(Vehicle[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
		}
	}
}
