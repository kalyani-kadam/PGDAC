package sll;

public class NodeDll {
	private int data;
	private NodeDll prev,next;
	public NodeDll(int data) {
		super();
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public NodeDll getPrev() {
		return prev;
	}
	public void setPrev(NodeDll prev) {
		this.prev = prev;
	}
	public NodeDll getNext() {
		return next;
	}
	public void setNext(NodeDll next) {
		this.next = next;
	}
	
}
