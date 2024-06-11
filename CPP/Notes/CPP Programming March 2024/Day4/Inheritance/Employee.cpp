#include<iostream>
#include "Employee.h" 
using namespace std;

//implemetaion of all methods from Employee.h

Employee::Employee(){
	cout<<"---default---Employee----"<<endl;
	this->empid=101;
	name="Ram";
	salary=10000;
}
Employee::Employee(int empid,string name,double salary)
{
	this->empid=empid;
	this->name=name;
	this->salary=salary;
	cout<<"------parameter Employee-----"<<endl;
}
void Employee::calSalary(){
	
	cout<<"Salary Of Employee "<<salary;
}

void Employee::displayDetails(){
	cout<<"----employe displayDetails----"<<endl;
	cout<<"\n"<<empid<<"  "<<name<<"  "<<salary<<endl;
}








