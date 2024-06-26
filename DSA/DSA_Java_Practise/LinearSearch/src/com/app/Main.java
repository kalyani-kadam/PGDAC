package com.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinearSearchArray lsa = new LinearSearchArray();
		System.out.println("Enter array size");
		int s = sc.nextInt();
		int arr[] = new int[s];
		
		for(int i=0;i<s;i++) {
			System.out.println("Enter array element");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		lsa.search(arr, sc.nextInt(), s);
	}

}
