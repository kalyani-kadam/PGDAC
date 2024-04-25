package com.app.fruits;

public class Orange extends Fruit{
	public Orange(String name, String color,double weight,IsFresh fr){
		super(name,color,weight,fr);
	}
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	public void juice() {
		System.out.println("Name: "+this.name+" Weight: "+this.weight+"\nExtracting Juice....");
	}
	
}
