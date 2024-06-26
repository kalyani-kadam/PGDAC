package com.app;

public class LinkedList2 {
	
	private Node head2;

	public Node getHead2() {
		return head2;
	}

	public void setHead2(Node head2) {
		this.head2 = head2;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newNode = new Node(data);
		
		if(newNode == null) {
			return false;
		}
		if(head2 == null) {
			head2 = newNode;
			return true;
		}
		
		Node last = head2;
		
		while(last.getNext() !=  null) {
			last = last.getNext();
		}
		
		last.setNext(newNode);
		return true;
		
	}
	
	public void display() {
		Node temp = head2;
		while(temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println(" null");
		
	}

}
