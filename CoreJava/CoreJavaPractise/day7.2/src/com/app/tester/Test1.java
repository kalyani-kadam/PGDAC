package com.app.tester;

import java.util.HashSet;

import com.app.core.Employee;

public class Test1 {

	public static void main(String[] args) {
		//2 emps CAN NOT have the SAME id
		Employee e1=new Employee(101, "Rama Patil", 10000);
		Employee e2=new Employee(101, "Rama Patil", 10000);
		Employee e3=new Employee(101, "Rama Patil", 10000);
		//Create empty HS of emps
		HashSet<Employee> emps=new HashSet<>();
		System.out.println("Added "+emps.add(e1));//t
		System.out.println("Added "+emps.add(e2));//t
		System.out.println("Added "+emps.add(e3));//t
		System.out.println("size "+emps.size());//3
		for(Employee e : emps)
			System.out.println(e);//dups !
		System.out.println(e1.equals(e2));//t
		System.out.println(e1.hashCode()+" "+e2.hashCode());//different



	}

}
