package com.app;

public class Main {

	public static void main(String[] args) {
		BST bst = new BST();
//		bst.insert(133);
//		bst.insert(89);
//		bst.insert(45);
//		bst.insert(10);
//		bst.insert(65);
//		bst.insert(82);
//		bst.insert(800);
//		bst.insert(10);
		
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(4);
		bst.insert(8);
//		System.out.println("Root "+bst.getRoot());
		bst.inOrder(bst.getRoot());
//		bst.display();
		System.out.println();
		
		System.out.println("Min = "+bst.getMin(bst.getRoot()));
		System.out.println("max = "+bst.getMax(bst.getRoot()));
		System.out.println("Second max = "+bst.secondMax());
//		int count = bst.findKthNode(bst.getRoot());
		System.out.println("count = "+bst.getCount(bst.getRoot()));
		System.out.println("Sum = "+bst.getSum(bst.getRoot()));
		System.out.println(bst.isBST(bst.getRoot(),null,null));
	}

}
