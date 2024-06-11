package com.app.core;

public class Employee {
	private String id;
	private String name;
	private double salary;

	public Employee(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	// override equals n hashCode to follow BOTH (Mandatory n Optional) branches of
	// the contract
	/*
	 * IMPORTANT : Equal objects MUST have the same hash codes 
	 * n un - equal objects
	 * SHOULD have different hash codes
	 */
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp's equals");
		if(o instanceof Employee)
			return this.id.equals(((Employee)o).id);
		return false;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in hashCode");
		return id.hashCode(); //for single primary key
//		return id.hashCode() % name.hashCode();  //for composite key i.e. morw than one promary key
//		return 19*(id.hashCode() + name.hashCode());
				//100;
	}

}
