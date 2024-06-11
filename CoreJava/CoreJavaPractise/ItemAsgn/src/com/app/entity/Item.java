package com.app.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Item implements Serializable{
//	Item Code ( String) : primary key
//	Description : String
//	Price : double
//	Shipment Date : Date
	
//	private static String cnt;
	private String itemCode;
	private String description;
	private double price;
	private LocalDate shipmentDate;
	public Item(String itemCode,String description, double price, LocalDate shipmentDate) {
		super();
		this.itemCode = itemCode;
		this.description = description;
		this.price = price;
		this.shipmentDate = shipmentDate;
	}

	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(itemCode);
	}

	@Override
	public boolean equals(Object o) {		
		if(o instanceof Item) {
			Item c = (Item)o;
			return this.itemCode.equals(c.itemCode);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", description=" + description + ", price=" + price + ", shipmentDate="
				+ shipmentDate + "]";
	}
	
}