#include<iostream>
#include "Employee.h"
using namespace std;

class Manager:public Employee
{
	private:int deptno;
	        double incentives;
	public:Manager()
	{
		cout<<"----default Manager----"<<endl;
		deptno=10;
		incentives=5000;
	}
	Manager(int id,string name,double salary,int deptno,double incentives):Employee(id,name,salary)
	{
		cout<<"-----parameter constr  MAnager-----"<<endl;
		//can we access private data member of parent class:NO
		
		//can we access   private data members inside class:YES
		this->deptno=deptno;//valid
		this->incentives=incentives;
	}
	void managerTask()
	{
		cout<<"Manager Specific task:"<<endl;
	}
};


int main()
{
	Employee emp1(101,"Nisha",50000);
	emp1.calSalary();
	emp1.displayDetails();
	cout<<"\n---------------\n\n";
	
	Manager mgr;//default constr of Employee---->default of Manager
	mgr.managerTask();//Manager class function
	mgr.calSalary();//Employee Class
	cout<<"\n---------------\n\n";
	
	Manager mgr1(506,"Nitesh",80000,20,25000);//
	mgr1.calSalary();
	mgr1.managerTask();
	mgr1.displayDetails();
	
}

