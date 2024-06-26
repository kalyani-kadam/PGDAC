package com.app;
import java.util.Arrays;
public class que<T> {
	private int f,r;
//	private int[] arr;
	private T[]arr;
	private int size;	
	public que(int size) {
		super();
		this.size= size;
		f = -1;
		r = -1;
		arr =(T[]) new Object[size];
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
//	public int[] getArr() {
//		return arr;
//	}
	public T[] getArr() {
		return arr;
	}
//	public void setArr(int[] arr) {
//		this.arr = arr;
//	}
	public void setArr(T[] arr) {
		this.arr = arr;
	}
	public boolean isempty() {
		return f==-1 && r==-1 || f>r;
	}
	public boolean isfull() {
		return r==size-1;
	}
	public boolean insert(T data) {
		if(isfull()) {
			return false;
		}
		arr[++r] = data;
		return true;
	}
	public T delete() {
		if(isempty()) {
			return null;
		}
		return arr[++f];
		 
	}
}
