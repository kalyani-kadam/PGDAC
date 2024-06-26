package com.app;

public class DynamicQueue {
//	private static int front=-1,rear=-1;
	private Node head;
	
	public boolean enqueue(int data) {
		Node newNode = new Node(data); 
		if(newNode == null) {
			return false;
		}
		if(head == null) {
			head = newNode;
//			rear++;
//			front++;
			return true;
		}
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}
	
	public boolean dequeue() {
		Node temp = head;
		if(head == null) {
			return false;
		}
		while(head == temp) {
			System.out.println(temp.getData());
			//System.out.println(temp.getNext().getData());
			head=temp.getNext();
			//head.setNext(temp.getNext());
			System.out.println("After moving header "+head.getData());
//			front++;
//			System.out.println(front);
			return true;
		}
		return false;
	}
	
	public void display() {
		Node temp =  head;		
		while(temp != null) {
			System.out.println(temp.getData() + " ");
			temp = temp.getNext();
		}
	}
	
}
