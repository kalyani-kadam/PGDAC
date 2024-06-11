package com.app.entity;

import java.time.LocalDate;
import java.util.Objects;

//Application captures following details for each employee whether FTE or PTE:
//    Name, Date of joining, Phone Number, Aadhaar number  
//For FTE, monthly salary is also captured.
//For PTE, hourly payment amount is also captured.

public class Employee {
	private static int cnt;
	private int empId;
	private String name;
	private LocalDate dateofjoining;
	private String phoneNumber;
	private String aadhaarNumber; 
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(LocalDate dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee(String name, LocalDate dateofjoining, String phoneNumber, String aadhaarNumber, double salary) {
		
		super();
		this.empId = ++cnt;
		this.name = name;
		this.dateofjoining = dateofjoining;
		this.phoneNumber = phoneNumber;
		this.aadhaarNumber = aadhaarNumber;
		this.salary = salary;
	}
	
	public Employee(int id) {
		this.empId = id;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dateofjoining=" + dateofjoining + ", phoneNumber="
				+ phoneNumber + ", aadhaarNumber=" + aadhaarNumber + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}

	
	
	
}
