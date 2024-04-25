package com.app.fruits;

public class Mango extends Fruit{
	
	
	
	public Mango(String name, String color,double weight,IsFresh fr){
		super(name,color,weight,fr);
	
	}
	
	public String taste(){
		return "sweet";
	}
	
	public void pulp() {
		System.out.println("Name : "+this.name+" Color : "+this.color+" \nCreating Pulp.......");
	}
	
}
