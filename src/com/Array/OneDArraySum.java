package com.Array;

import java.util.Scanner;

public class OneDArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr;
		arr = new int[4]; 
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter array " +i+ " elements: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Array element at "+i+ " position is: " +arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Sum of array elements is: " +sum);
	}

}
