package com.app.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/*a.	ID (unique identifier for each Pen, should be generated automatically)
b.	Brand (Example:  Cello, Parker, Reynolds etc.)
c.	Color
d.	InkColor
e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
f.	Stock (Available quantity)
g.	Stock Update Date (it changed every time when admin update stock or user order executed)
h.	Stock Listing Date (date on which product is added to site for sale)
i.	Price (in INR) 
j.	Discounts (in percentage)*/

public class Pen {
	private static int penID;
	private int ID;
	private Brand brand;
	private Color color;
	private InkColor inkColor;
	private Material material;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalTime stockupdatetime;
	private LocalDate stockListingDate;
	private int price;
	private double discount;
	
	public Pen() {
		
	}
	
	public Pen(Brand brand, Color color, InkColor inkColor, Material material, int stock, int price) {
		super();
		++penID;
		this.ID = penID;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
//		this.stockUpdateDate = stockUpdateDate.now();
		this.stockUpdateDate=LocalDate.of(2023, 01, 22);
//		this.stockListingDate = stockListingDate.now();
		this.stockListingDate=LocalDate.of(2022, 11, 28);
		this.stockupdatetime = stockupdatetime.now();
		this.price = price;
		this.discount = 0;
	}
	
	public Pen(int id) {
		this.ID=id;
	}
	
	public Pen(LocalDate date) {
		this.stockUpdateDate = date;
	}
//	public Pen(int stock) {
//		this.stock=stock;
//	}
	public Pen(Brand brand) {
		this.brand=brand;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public InkColor getInkColor() {
		return inkColor;
	}
	public void setInkColor(InkColor inkColor) {
		this.inkColor = inkColor;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}
	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}
	public LocalDate getStockListingDate() {
		return stockListingDate;
	}
	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Pen [ID=" + ID + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", Stock=" + stock + ", stockUpdateDate=" + stockUpdateDate + ", stockupdatetime=" +stockupdatetime+ ", stockListingDate="
				+ stockListingDate + ", price=" + price + ", discount=" + discount + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Pen) {
			return this.ID== ((Pen)o).ID;
		}
		return false;
	}
}
