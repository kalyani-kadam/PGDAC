package com.app;

public class LinearSearchArray {
//	private int[] arr;
//	private int key;
//	
//	public LinearSearchArray(int[] arr, int key) {
//		super();
////		this.arr = arr;
//		this.key = key;
//	}
//	
//	public int getKey() {
//		return key;
//	}
//	public void setKey(int key) {
//		this.key = key;
//	}
	
//	public void insert(int []arr,int element,int size) {
//		for(int i=0;i<size-1;i++) {
//			arr[i] = element;
//		}
//	}
	
	public int search(int arr[],int key,int size) {
		for(int i=0;i<size-1;i++) {
			if(arr[i] == key) {
				System.out.println("Element fount at index "+i);
				return i;
			}
		}
		System.out.println("Element not found");
		return -1;
	}
}
