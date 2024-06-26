package com.app.pojos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department extends BaseEntity {
	@Column(length = 30,unique = true)
	private String name;
	@Column(length = 30)
	private String location;
	// Department 1--->* Employee
	@OneToMany(mappedBy = "dept",cascade=CascadeType.ALL,orphanRemoval = true
			/*fetch=FetchType.EAGER*/)
	private List<Employee> employees = new ArrayList<>();

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	//helper method : to add emp
	public void addEmployee(Employee e)
	{
		this.employees.add(e);//can navigate from parent --> child
		e.setDept(this);//can navigate from child --> parent
	}
	//helper method : to remove emp
	public void removeEmployee(Employee e)
	{
		this.employees.remove(e);
		e.setDept(null);
	}

	// Never add any association fields in toString
	// (o.w will cause recursion in a bi dir asso)
	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location + "]";
	}

}
