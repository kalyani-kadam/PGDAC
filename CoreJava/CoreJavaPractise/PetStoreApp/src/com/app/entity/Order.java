package com.app.entity;

import java.util.Objects;

//Order (orderId, petId, quantity, status)

public class Order {
	private static int cnt;
	private int orderId;
	private int petId;
	private int qty;
	private Status status;
	
	public Order(int petId, int qty, Status status) {
		super();
		++cnt;
		this.orderId = cnt;
		this.petId = petId;
		this.qty = qty;
		this.status = status;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int orderid2) {
		this.orderId = orderid2;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Order.cnt = cnt;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", qty=" + qty + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(orderId);
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Order other = (Order) obj;
//		return orderId == other.orderId;
		
		if(obj instanceof Order) {
			Order o = (Order) obj;
			return this.orderId==o.orderId;
		}
		return false;
	}
	
}
