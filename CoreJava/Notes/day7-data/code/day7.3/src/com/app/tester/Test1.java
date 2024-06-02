package com.app.tester;

import java.util.HashSet;

import com.app.core.Employee;

public class Test1 {

	public static void main(String[] args) {
		//Given : BBBB AaBB AaAa BBAa : 
		//these strings have the same hash code (EXTREMELY RARE !)
		//Business condition - 2 emps CAN NOT have the SAME id
		Employee e1=new Employee("rnd-001", "a1 b1", 10000);
		Employee e2=new Employee("rnd-012", "a2 b2", 10000);
		Employee e3=new Employee("rnd-001", "a3 b3", 10000);
		Employee e4=new Employee("BBBB", "a4 b4", 10000);
		Employee e5=new Employee("AaBB", "a5 b5", 10000);
		Employee e6=new Employee("AaAa", "a6 b6", 10000);
		Employee e7=new Employee("BBAa", "a7 b7", 10000);
		
		//Create empty HS of emps
		HashSet<Employee> emps=new HashSet<>();
		System.out.println("Added "+emps.add(e1));//t , hc : 1, eq : 0
		System.out.println("Added "+emps.add(e2));//t , hc : 1 , eq : 0
		System.out.println("Added "+emps.add(e3));//f , hc :1 , eq : 1
		System.out.println("Added "+emps.add(e4));//t , hc : 1 , eq : 0
		System.out.println("Added "+emps.add(e5));//t , hc : 1 , eq : 1
		System.out.println("Added "+emps.add(e6));//t , hc : 1 , eq : 2
		System.out.println("Added "+emps.add(e7));//t , hc : 1 , eq : 3
	
		
		System.out.println("size "+emps.size());//6
		for(Employee e : emps)
			System.out.println(e);//no dups
		
		//just for confirmation
				System.out.println("BBBB".hashCode()+" "+"AaBB".hashCode());
		


	}

}
