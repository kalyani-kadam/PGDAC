package com.app;

public class StackPalindrome {
	
	private String reverseString = "";
	
	public void storeStringInStack(String s,Stack stack) {
		for(int i = 0;i<s.length();i++) {
			stack.push(s.charAt(i));
		}
	}
	
	public void storeReverseString(String s ,Stack stack) {
		while(!stack.isEmpty()) {
			reverseString =  reverseString + stack.pop();
		}
		System.out.println(reverseString);
		if(s.equals(reverseString)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
	
	public void storeString(String s,Stack stack) {
		while(stack.size == (stack.size) / 2) {
			
		}
	}
	
}
