package com.app.fruits;

public abstract class Fruit {
	protected IsFresh fresh;
	protected String name,color;
	protected double weight;
	
	public Fruit(String name,String color,double weight,IsFresh fr) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.fresh=fr;
	}
	
	public abstract String taste();
	
	
	public IsFresh isFresh() {
		return fresh;
	}
	public void setFresh(IsFresh fresh) {
		this.fresh = fresh;
	}
	
	public String toString() {
		return "Name: "+this.name+" Color: "+this.color+ " Weight: "+this.weight+" Fresh: "+this.fresh;
	}
}
