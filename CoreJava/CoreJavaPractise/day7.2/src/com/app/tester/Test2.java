package com.app.tester;

import java.util.HashSet;

import com.app.core.Employee;

public class Test2 {

	public static void main(String[] args) {
		//2 emps CAN NOT have the SAME id
		Employee e1=new Employee(101, "Rama Patil", 10000);
		Employee e2=new Employee(101, "Rama Patil", 10000);
		Employee e3=new Employee(101, "Rama Patil", 10000);
		Employee e4=new Employee(10, "Ram Patil", 10000);
		Employee e5=new Employee(57, "Kiran Mujumdar", 15000);
		Employee e6=new Employee(45, "Riya Pant", 13000);
		//Create empty HS of emps
		HashSet<Employee> emps=new HashSet<>();
		System.out.println("Added "+emps.add(e1));//t
		System.out.println("Added "+emps.add(e2));//f
		System.out.println("Added "+emps.add(e3));//f
		System.out.println("Added "+emps.add(e4));//t
		System.out.println("Added "+emps.add(e5));//t
		System.out.println("Added "+emps.add(e6));//t
		System.out.println("size "+emps.size());//4
		for(Employee e : emps)
			System.out.println(e);//no dups !
	


	}

}
