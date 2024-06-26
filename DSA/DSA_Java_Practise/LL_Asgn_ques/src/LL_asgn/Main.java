package LL_asgn;

public class Main {

	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.insert(2);
		ll.insert(8);
		ll.insert(17);
		ll.insert(27);
		ll.insert(27);
		ll.insert(72);
		ll.insert(88);
		ll.insert(88);
		ll.insert(98);
		ll.display();
		
		int data = ll.findMiddle();
		System.out.println("middle = "+data);
		
		ll.findDuplicate();
		ll.display();
		
		ll.findLength();
		
//		ll.reverse();
//		ll.display();
		
		ll.findThirdNode();
//		ll.findThird();
		
		ll.removeNthNode(30); //invalid position so node will not be removed
		ll.display();
		
		ll.findMiddle();
//		ll.addAtMiddle(90); 
		
		ll.display();
		int d = ll.findMiddle();
		System.out.println(d);
		
		ll.addNodeAtMiddle(789);
		ll.display();
		
		int m = ll.findMiddle();
		System.out.println(m);
		
		ll.addAtMiddle(647);
		ll.display();
		int midd = ll.findMiddle();
		System.out.println(midd);
//		int mid = ll.findMiddleNode();
//		System.out.println(mid);
		
		ll.sortList();
		ll.display();
	}

}
