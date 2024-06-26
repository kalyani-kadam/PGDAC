package com.blogs.custom_exceptions;

public class InvalidCredentialsException extends RuntimeException {
public InvalidCredentialsException(String msg) {
	super(msg);
}
}
