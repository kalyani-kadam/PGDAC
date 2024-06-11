package com.app.core;

public class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	//override equals to replace ref equality by content equality(UID)
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp's equals");
		if(o instanceof Employee)
			return this.id==((Employee)o).id;
		return false;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in hashCode");
		return id;
				//100;
	}
	
}
