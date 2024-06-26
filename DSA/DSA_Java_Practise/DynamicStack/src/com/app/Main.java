package com.app;

public class Main {
	public static void main(String[] args) {
		DynamicStack ds = new DynamicStack();
		System.out.println("push");
		ds.push(80);
		ds.push(78);
		ds.push(53);
		ds.display();
		System.out.println("Pop");
		ds.pop();
		ds.display();
	}
}
