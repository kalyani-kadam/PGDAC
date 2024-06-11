package com.app.custom_exceptions;

@SuppressWarnings("serial")
public class CMSException extends Exception {
	public CMSException(String errMesg) {
		super(errMesg);
	}
}
