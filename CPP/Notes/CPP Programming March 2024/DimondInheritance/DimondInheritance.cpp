#include<iostream>
using namespace std;

class Employee{
	int id;
	string name;
	double salary;
	public:

	      Employee(int id,string name,double salary)
			{
				cout<<"----parameter---employee---"<<endl;
				this->id=id;
				this->name=name;
				this->salary=salary;
			}
			void display()
			{
				cout<<id<<"  "<<name<<"  "<<salary<<endl;
				
			}
			
};
class Manager: virtual public Employee{
	string deptName;
	public:
//	    Manager()
//	    {
//	    		
//		}
	    Manager(int id,string name,double salary,string deptName):Employee(id,name,salary){
	    	cout<<"---para Manager-----"<<endl;
		this->deptName=deptName;
		
	}
	void display()
			{
				Employee::display();
				cout<<"Manager:"<<deptName<<endl;
				
			}
};
class SalesPerson:virtual public Employee{
	private:double foodAll,petrolAll,travelAll;
	public:

	 	 SalesPerson(int id,string name,double salary,double foodAll,double petrolAll,double travelAll):
	Employee(id,name,salary)
	{
		cout<<"---- para salesPerson-------"<<endl;
		this->petrolAll=petrolAll;
		this->foodAll=foodAll;
		this->travelAll=travelAll;
		
		
		
	}
	void display()
			{
				Employee::display();
				cout<<"SalesPerson "<<petrolAll<<"   "<<travelAll<<"   "<<foodAll<<endl;
				
			}
	};
	
class SalesManager:public Manager,public SalesPerson{
	private :int deptno;
	public:
//	   SalesManager()
//	   {
//	   	cout<<"-----SalesMAnager----"<<endl;
//	   }
	    SalesManager(int id,string name,double salary,string deptname,double pa,double fa,double ta,int deptid):
		Manager(id,name,salary,deptname),SalesPerson(id,name,salary,pa,fa,ta),Employee(id,name,salary){
			cout<<"--salesManager----"<<endl;
			this->deptno=deptid;
		}
		void display()
			{
				Manager::display();
				SalesPerson::display();
			cout<<"Sales Person :"<<deptno<<endl;
				
			}
	
};
int main()
{
	SalesManager sm(101,"Abc",9000,"IT",90.23,93.44,45.55,100);
	sm.display();
	}	
	
	