package com.app.entity;

import java.util.Objects;

//Pet ( petId, name, category, unitPrice, stocks)
//Category is an enum with values like (CAT, DOG, RABBIT, FISH)

public class Pet {
	private static int cnt=0;
	private int id;
	private String name;
	private Category category;
	private double unitPrice;
	private int stocks;
	
	public Pet(String name, Category category, double unitPrice, int stocks) {
		super();
		++cnt;
		this.id = cnt;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}
	
	public Pet(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice + ", stocks="
				+ stocks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return id == other.id;
	}

	
}
