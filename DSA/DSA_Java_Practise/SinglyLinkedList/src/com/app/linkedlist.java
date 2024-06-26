package com.app;

import java.util.Stack;

public class linkedlist {
	private Node head;

	public linkedlist() {
		head = null;
	}

	public boolean insert(int data) {
//		System.out.println("in insert");
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		}
		Node temp = head;
		while (temp.getnext() != null) {
			temp = temp.getnext();
			if (temp.getData() == data) {
				return false;
			}
		}
		temp.setnext(newNode);
//		System.out.println(temp.getData());
		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.getnext();
			if(temp != null) {
				System.out.print("->");
			}
		}
	}

	
	public void findMaxNode(){
//		int max = 0;
		Node temp = head;
		int max = head.getData();
		while(temp != null) {
			if(temp.getnext() == null) {
				break;
			}
			if(max > temp.getnext().getData() ) {
				temp = temp.getnext();
			}else {
				max = temp.getnext().getData();
				temp = temp.getnext();
			}
		}
		System.out.println("Max node = "+max);
	}
	
	public void findMinNode() {
		
		Node temp =head;
		int min =head.getData();
		while(temp!=null) {
			if(temp.getnext() == null) {
				break;
			}
			if(min < temp.getnext().getData()) {
				temp = temp.getnext(); 
			}else {
				min = temp.getnext().getData();
				temp = temp.getnext();
			}
//			temp = temp.getnext();
		}
		System.out.println("Min node = "+min);
	}
	
	public void findSum() {
		Node temp = head;
		int sum = head.getData();
			
			while(temp.getnext() != null) {
				sum += temp.getnext().getData();
				temp = temp.getnext();
//				if(temp == null) {
//					break;
//				}//not needed as we are checking this condition in while
			}
			System.out.println("Sum = "+sum);
	}
}
