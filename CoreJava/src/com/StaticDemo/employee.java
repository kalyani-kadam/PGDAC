package com.Static;

public class employee {
	private int eid;
	private String ename;
	public static int count;
	employee(){
		count++;
		eid=0;
		ename="NA";
	}
	employee(int eid,String ename){
		count++;
		this.eid = eid;
		this.ename = ename;
	}
	employee(String ename){
		count++;
		this.eid = count;
		this.ename = ename;
	}
	
//	public void printDetails() {
//		System.out.println("Eid: "+eid+" Name: "+ename);
//	}
	
	@Override
	
//	to get values we use getters
	public String toString() {
		return "eid-"+eid+" Name-"+ename;
	}
	int getId() {
		return this.eid;
	}
	String getName() {
		return this.ename;
	}
	
//	to modify values we use setters
	void setId(int eid) {
		this.eid = eid;
	}
	void setName(String ename) {
		this.ename=ename;
	}
	
	//to get how many object are created
	public static int getCount() {
		return count;
	}
}
