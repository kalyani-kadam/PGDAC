package com.app;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<String> qs = new Queue<>(4);
//		Queue<Integer> qi = new Queue<>(4);
//		System.out.println(qs.enQueue("jnkc"));
//		System.out.println(qs.enQueue("kjhkj"));
//		System.out.println(qs.enQueue("u3e"));
//		System.out.println(qs.deQueue());
//		System.out.println(qs.deQueue());
//		System.out.println(qs.deQueue());
//		
//		System.out.println(qi.enQueue(890));
//		System.out.println(qi.enQueue(433));
//		System.out.println(qi.enQueue(323));
//		System.out.println(qi.deQueue());
		
		que q= new que(3);
		System.out.println(q.insert(682));
		System.out.println(q.insert(12));
		System.out.println(q.insert(13));
		System.out.println(q.insert(321));
//		q.display();
		System.out.println(q.delete());
//		q.display();
//		System.out.println(q);
		
		System.out.println("-------circular que=----");
		cycleque c = new cycleque(3);
		System.out.println(c.insert(81));
		System.out.println(c.insert(62));
		System.out.println(c.insert(12));
		System.out.println(c.insert(892));
		System.out.println(c.delete());
	}

}