#include<iostream>
using namespace std;
class Employee{
	public:Employee()
	{
		cout<<"Employee Constructor "<<endl;
	}
};
class Manager:virtual public Employee{
	public:Manager(){
			cout<<"Manager Constructor "<<endl;
         	}
};
class SalesPerson:virtual public Employee{
public:

          SalesPerson(){
			cout<<"SalesPerson Constructor "<<endl;
         	}	
};
class SalesManager:public Manager,public SalesPerson{
public:SalesManager()
{
	cout<<"Sales Manager construtor "<<endl;
}
  };
 int main()
 {
 	//Employee e;
 	//Manager m;
 	//SalesPerson sp;
 	
 	SalesManager salesMgr;
 	
 	
 	
 	return 0;
 	
 	
 	
 }
