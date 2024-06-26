package com.app;
import com.app.LinkedList2.*;

public class LinkedList1 {
	
	private Node head1;
	LinkedList2 LL2 = new  LinkedList2();
	
	public Node getHead1() {
		return head1;
	}

	public void setHead1(Node head1) {
		this.head1 = head1;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newNode = new Node(data);
		
		if(newNode == null) {
			return false;
		}
		if(head1 == null) {
			head1 = newNode;
			return true;
		}
		
		Node last = head1;
		
		while(last.getNext() !=  null) {
			last = last.getNext();
		}
		
		last.setNext(newNode);
		return true;
		
	}
	
	public void display() {
		Node temp = head1;
		while(temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println("null");
		
	}
	
	public boolean setLinkedList(LinkedList2 obj) {
		LL2 = obj;
		return true;
	}
	
	public void insertLL2() {
		LL2.insert(1000);
		LL2.insert(2000);
		LL2.insert(3000);
		LL2.display();
		//combine();
	}
	
	public boolean combine(LinkedList2 LL2) {
		
		if(head1 == null) {
			if(LL2.getHead2() == null) {
				return false;
			}else {
				LL2.display();
			}
		}else {
			if(LL2.getHead2() == null) {
				display();
			}	
		}
		System.out.println("After null");
		
		Node temp1 = head1;
		Node temp2 = LL2.getHead2();
		Node  firstNext, secondNext;

		int pos =1;
		
//		while(temp1.getNext() != null && temp2.getNext() != null) {
//			System.out.println("in while");
//			if(pos % 2 == 0) {
//				System.out.println("in if");
//				temp1.setNext(temp2);
//				temp2.setNext(temp1.getNext());
//				LL2.setHead2(temp2); 
//				//display();
//				//return true;
//			}
//			System.out.println("after if");
//			pos++;
//			System.out.println(pos);
//			temp1 = temp1.getNext();
//			temp2 = temp2.getNext();
//			
//			
//		}
//		
//		display();
//		
//		System.out.println("after while");
//		
		//return true;
		
		while(temp1 !=  null  && temp2 != null) {
			firstNext = temp1.getNext(); /// Save next pointers
			secondNext = temp2.getNext();
			
			temp2.setNext(firstNext); // Make second's next as first's next
			temp1.setNext(temp2); // Insert second between first and firstNext
			
			// Move pointers one step forward
			temp1 = firstNext;
			temp2 = secondNext;
			
		}
        // Update head of list2 in case second list has more elements left
		LL2.setHead2(temp2);
		return true;
	}

}
