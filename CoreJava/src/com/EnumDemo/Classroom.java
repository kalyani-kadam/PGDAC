package com.EnumDemo;

public class Classroom {
	private int roomId;
	private String name;
	private Teacher teachr;
	
	public Classroom(int roomId,String name,Teacher teachr) {
		this.roomId=roomId;
		this.name = name;
		this.teachr=teachr;
		
	}
	public String toString() {
		return "Roomd Id: "+this.roomId+" Name: "+this.name +teachr.toString();
	}
}
