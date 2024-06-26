package com.app;

public class Stack<String> {
	String[] arr;
	int size,top;
	
	public Stack(int size) {
		this.size = size;
		top = -1;
		arr = (String[]) new Object[size];
	}

	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean push(String data) {
		if(isFull() == true) {
			return false;
		}
		arr[++top] = data;
		return true;
	}
	
	public String pop() {
		if(isEmpty() == true) {
			return null;
		}
		return arr[top--];
	}

	public String peek() {
		if(isEmpty()) {
			return null;
		}
		return arr[top];
	}
}
