package com.app;

import java.util.Scanner;

public class Main {
	
//	1.Check whether given string is palindrome or not using Stack.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String inputStr = sc.nextLine();
		Stack<String> s = new Stack<>(inputStr.length()); 
		
		StackPalindrome sp = new StackPalindrome();
		
		sp.storeStringInStack(inputStr,s);
		
		sp.storeReverseString(inputStr, s);
//		System.out.println(s.peek());
		
	}
}
