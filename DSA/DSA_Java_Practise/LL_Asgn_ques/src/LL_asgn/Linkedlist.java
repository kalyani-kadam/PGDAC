package LL_asgn;

public class Linkedlist {
	private Node head;

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}

		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}

		last.setNext(newNode);
		return true;
	}

	public int findMiddle() {
		Node ref1 = head;
		Node ref2 = head;
		int cnt = 0;
		while (ref1 != null && ref1.getNext() != null) {
			cnt++;
			ref1 = ref1.getNext().getNext(); // fast pointer
			ref2 = ref2.getNext(); // slow pointer
		}
//		int len = cnt % 2 == 0 ? cnt/2 : (cnt+1)/2;
//		Node temp = head;
//		for(int i=0;i<len;i++) {
//			temp = temp.getNext();
//		}

		return ref2.getData();
	}

	/*
	 * public int findMiddleNode() { Node temp = head; Node next = head; int cnt =
	 * 1; while(temp != null) { temp = temp.getNext(); cnt++; } for(int
	 * i=0;i<cnt/2;i++) { next = next.getNext(); } return next.getData(); }
	 */

//4. How are duplicate nodes removed in an unsorted linked list? 
//6. How to remove duplicates from a sorted linked list? 
	public void findDuplicate() {
		Node temp = head;
		Node temp2 = null;

		while (temp != null && temp.getNext() != null) {
			temp2 = temp;
			while (temp2.getNext() != null) {
				if (temp.getData() == temp2.getNext().getData()) {
					temp2.setNext(temp2.getNext().getNext());
				} else {
					temp2 = temp2.getNext();
				}
			}
			temp = temp.getNext();
		}
	}

//	5.How do you find the length of a singly linked list? 
	public void findLength() {
		Node temp = head;
		int count = 0;

		while (temp != null) {
			temp = temp.getNext();
			count++;
		}
		System.out.println(count);
	}

//	3.How do you reverse a singly linked list without recursion? 
//	7.How do you reverse a linked list?

	public void reverse() {
		Node n1 = head;
		Node n2 = head.getNext();

		while (n2 != null) {
			Node n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}
		head.setNext(null);
		head = n1;
	}

//	8.How do you find the third node from the end in a singly linked list? 
	//here to find node from last we have to manage links 
	// in loop we have to give condition as temp.getNext().getNext().getNext()
	// by using this condition we can easlily get the access to last element and we
	// can check null condition

	public void findThirdNode() {
		Node temp = head;
		while (temp.getNext().getNext().getNext() != null) {
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}

	public void findThird() {
		Node temp = head;
		Node temp2 = head.getNext();
		while (temp != null && temp.getNext().getNext() != null) {

			if (temp2 == null) {
				break;
			}
			temp2 = temp2.getNext();

			temp.getNext();
		}
		System.out.println("third = " + temp.getData());
	}

//	9.How to remove Nth Node from the end of a linked list? 

	public void removeNthNode(int position) {
		Node temp = head;
		Node prev = head;
		int count = 0;
		while (temp != null) {
			temp = temp.getNext();
			count++;
		}
		int pos = count - position; // here we get position from end

		// below we are trying to delete element by position
		for (int i = 0; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return;
			}
		}
		Node del = prev.getNext();
		prev.setNext(del.getNext());
	}

//	11.How to add an element at the middle of the linked list? 

	public void addAtMiddle(int data) {
		// this fun will add element at one position ahead of middle
		Node newNode = new Node(data);
		Node temp = head;
		Node temp2 = head;

		while (temp != null && temp.getNext() != null) {
			temp = temp.getNext().getNext();
			temp2 = temp2.getNext();
		}
		newNode.setNext(temp2.getNext());
		temp2.setNext(newNode);
	}

	public void addNodeAtMiddle(int data) {
		// this function will add element at middle itself
		Node newNode = new Node(data);
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}

		int len = (count % 2 == 0) ? count / 2 : (count + 1) / 2;
		temp = head;
		while (len-- > 1) {
			temp = temp.getNext();
		}
		System.out.println("middle = " + temp.getData());
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
	}

//	12.How do you sort a linked list in Java?
	public void sortList() {
		System.out.println("sorted Linked list");
		Node temp = head;
		Node temp2 = null;
		while (temp != null && temp.getNext() != null) {
			temp2 = temp.getNext();
//			System.out.println("temp2 "+temp2);
//			System.out.println("data 1 = " + temp.getData() + " data 2=" + temp2.getData());

			while (temp2 != null) {
				if (temp.getData() > temp2.getData()) {
					swap(temp,temp2);
					
//					System.out.println("in while data 1 = " + temp.getData() + " data 2=" + temp2.getData());
//					Node n1 = temp.getNext();
//					Node n2 = temp2.getNext();
//					temp.setNext(n2);
//					temp2.setNext(n1);
//					System.out.println(temp2.getNext());
				}
				temp2 = temp2.getNext();
			}
			temp = temp.getNext();
//			System.out.println("temp "+temp);
		}
	}
	
	public void swap(Node temp,Node temp2) {
		int temp3 = temp2.getData();
//		temp2.getData() = temp.getData();
		temp2.setData(temp.getData());
//		temp.getData() = temp3;
		temp.setData(temp3);
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println("null");
	}
}
