package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name, String color,double weight,IsFresh fr){
		super(name,color,weight,fr);
	
	}
	
	public String taste() {
		return "Sweet nd sour";
	}
	
	public void jam() {
		System.out.println("Name : "+this.name+"\n Making jam....");
	}

}
