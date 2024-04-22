package com.InheritanceDemo;

public class Vehicle {
	private String brand;
	
	public Vehicle() {
		this.brand = "NA";
	}
	public Vehicle(String brand) {
		this.brand =brand;
	}
	public String toString() {
		return "Brand - "+this.brand;
	}
	String getBrand() {
		return this.brand;
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
//	public void startEngine() {
//		System.out.println("Vehicle engine started");
//	}
}
