package com.blogs.custom_exceptions;

public class ResorceNotFoundException extends RuntimeException{
	public ResorceNotFoundException(String msg) {
		super(msg);
	}
	
}
