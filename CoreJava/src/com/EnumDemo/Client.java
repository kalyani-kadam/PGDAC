package com.EnumDemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many classroom you want to add: ");
		int s = sc.nextInt();
		Classroom[] c=new Classroom[s];
		int no=0;
		while(no<=s) {
//			no++;
			System.out.println("Enter 1.Accept Classroom details 2.Display Details");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				no++;
				ClassroomArrayUtility.acceptClassroomDetails(c);
				break;
			case 2:
				ClassroomArrayUtility.displayClassroomDetails(c);
				break;
			default:
				return;
			}
		}
		
	}

}
