package com.app;

public class Main {

	public static void main(String[] args) {
		DynamicQueue dq = new DynamicQueue();
		System.out.println("Enqueue");
		dq.enqueue(781);
		dq.enqueue(72);
		dq.enqueue(71);
		dq.display();
		System.out.println("Dequeue");
		dq.dequeue();
		System.out.println("after dq");
		dq.display();
		dq.dequeue();
		dq.display();
	}
}