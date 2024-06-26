package com.product;

import com.product.*;

public class Node {
	private Product data;
	private Node next;
	
	public Node(Product data) {
		super();
		this.data = data;
		next = null;
	}
	public Product getData() {
		return data;
	}
	public void setData(Product data) {
		this.data = data;
	}
	public Node getnext() {
		return next;
	}
	public void setnext(Node product) {
		this.next = product;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}
