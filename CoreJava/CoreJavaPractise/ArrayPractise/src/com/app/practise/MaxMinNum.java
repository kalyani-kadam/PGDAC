package com.app.practise;

import java.util.Scanner;

//Write a program to accept n numbers in an array and display the largest and smallest number. Using 
//these values, calculate the range of elements in the array.

public class MaxMinNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Max = "+max);
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			}
		System.out.println("Min = "+min);
	}

}
