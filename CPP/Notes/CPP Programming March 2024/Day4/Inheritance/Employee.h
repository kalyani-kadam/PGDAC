#include<iostream>
using namespace std;
class Employee{
	private :int empid;
	        string name;
	        double salary;
	public:Employee();
	       Employee(int empid,string name,double salary);
	       void calSalary();
	       void displayDetails();
};
