package com.app;

public class Node {
	private int data;
	private Node next;
	
	public Node(int data) {
		super();
		this.data = data;
		next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getnext() {
		return next;
	}
	public void setnext(Node next) {
		this.next = next;
	}
	
	
}
