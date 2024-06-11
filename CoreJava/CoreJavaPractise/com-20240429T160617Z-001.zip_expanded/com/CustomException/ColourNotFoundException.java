package com.CustomException;

@SuppressWarnings("serial")
public class ColourNotFoundException extends Exception{
	public ColourNotFoundException(String msg)
	{
		super(msg);
	}
}
