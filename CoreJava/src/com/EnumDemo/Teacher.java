package com.EnumDemo;

public class Teacher {
	private int teacherId;
	private String name;
	private DesignationCodes dcode;
	
	public Teacher(int teacherId,String name,DesignationCodes dcode ) {
		this.teacherId = teacherId;
		this.name = name;
		this.dcode = dcode;	
	}
	
	public String toString() {
		return "TeacherId: "+this.teacherId+"Name: "+this.name+dcode.toString();
	}
}
