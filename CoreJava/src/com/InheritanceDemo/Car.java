package com.InheritanceDemo;

public class Car extends Vehicle{
	private int noOfDoors;
	public Car() {
		this.noOfDoors=0;
	}
	public Car(String brand,int noOfDoors) {
		super.setBrand(brand); //for updating brand of car
		this.noOfDoors = noOfDoors;
	}
	public String toString() {
		return "Brand: "+super.getBrand()+" No of Doors: "+this.noOfDoors;
	}
}
