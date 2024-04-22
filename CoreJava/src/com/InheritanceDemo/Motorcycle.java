package com.InheritanceDemo;

public class Motorcycle extends Vehicle{
	private String engine;
	
	public Motorcycle(String brand,String engine) {
//		super.setBrand(); 
		super.setBrand(brand);
		this.engine = engine;
	}
	public String toString() {
		return "Brand: "+super.getBrand()+" Engine: "+this.engine;
	}
}
