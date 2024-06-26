package com.app;

public class DynamicStack {
//	private int top=0;
	private Node head;
	
	public boolean push(int data) {
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		if(head == null) {
			head = newNode;
//			top++;
			return true;
		}
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
//		top++;
		return true;
	}
	
	public boolean pop() {
//		return 
		Node temp = head;
		if(temp == null) {
			return false;
		}
		while(temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
//		top--;
		return true;
		
	}
	
	public void display() {
		Node temp = head;
		if(temp == null) {
			return;
		}
		while(temp != null) {
			System.out.println(temp.getData()+" ");
			temp = temp.getNext();
		}
	}
}
