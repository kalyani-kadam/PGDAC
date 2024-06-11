#include<iostream>
using namespace std;
class Employee{
	private:int empid;
	        string name;
	protected:        double salary;
	public:Employee()
			{
				empid=10;
				name="Ram";
				salary=10000;
			}
			Employee(int empid,string name,double salary)
			{
				this->empid=empid;
				this->name=name;
				this->salary=salary;
			}
		virtual	void calSalary()
			{
				cout<<"Employee Salary="<<salary<<endl;
			}
		virtual	void display()
			{
			cout<<empid<<"   "<<name<<"    "<<salary<<endl;
				
			}
};
//Parent:Employee
//Child:Manager
class Manager:public Employee
{
	//every manager will have empid,name salary inherited from Employee
	private:double incentives;
	        string deptName;
	public:Manager()//Employee defaul constr get invoked implicitly
	       {
	       	this->incentives=5000;
	       	deptName="Abc";
		   }  
		   Manager(int empid,string name,double salary,string deptName,double incentives):Employee(empid,name,salary)     
		   {
		   	this->deptName=deptName;
		   	this->incentives=incentives;
		   }
		    void ManagerTask()
			{
				cout<<"Manager task   "<<endl;
			}
			
			//Manager hilds Employee display
			//same funName and same signature and same return type
			//overriding
			//Manager mgr;mgr.display();--->manager function
			void display()
			{
				Employee::display();//
				cout<<"Manager :"<<incentives<<"    "<<deptName<<endl;
			}

        //ManagerCalSalary
         void calSalary()
         {      	//if salary is private,not accessible outside employee class
         	
         	cout<<"Manager Salary="<<incentives+this->salary<<endl;
		 }


};        
class SalesPerson:public Employee{
	
	double pa,fa,ta;
	public:SalesPerson(){
		pa,fa,ta=1000;
	}
	SalesPerson(int empid,string name,double salary,double pa,double fa,double ta):Employee(empid,name,salary)
	{
		this->pa=pa;
		this->fa=fa;
		this->ta=ta;
	}
	void targets()
	{
	cout<<"SalesPerson Task "<<endl;	
	}

     void display()
     {
     	Employee::display();
     	cout<<"SalesPerson:"<<pa<<"   "<<ta<<"    "<<fa<<endl;
     	
	 }
	 void calSalary()
     {
     	cout<<"SalesPerson Salary="<<(pa+fa+ta+this->salary)<<endl;
	 }	 
	 
};

int main167()
{
	
	Employee emp(202,"Nitesh",30000);
	emp.calSalary();
	emp.display();//empid name salary
	
	cout<<"\n-----Manager---------"<<endl;
	Manager mgr;
	mgr.calSalary();//parent employee
	mgr.ManagerTask();//manager
	mgr.display();//parent  employee id name salary incentives deptName
	//mgr.ManagerDisplay();//manager
	
	cout<<"\n-----Manager---------"<<endl;
	Manager mgr1(304,"Nilay",80000,"IT",20000);
	 //mgr1.salary=20000;
	mgr1.display();//manager display
	mgr1.calSalary();//employee
//	mgr1.ManagerCalSalary();



cout<<"\n-----SalesPerson---------"<<endl;
 SalesPerson sp(506,"Mukesh",40000,5000,2000,3000);
 //employee--->SalesPerson
 sp.display();//
sp.targets();
sp.calSalary();

cout<<"----------collection of Employees-----"<<endl;
//
//Employee arr[3]  arr[0]=emp ,arr[1]=mgr
Employee* iacsd[4];

iacsd[0]=&emp;
iacsd[1]=&mgr;
iacsd[2]=&sp;
iacsd[3]=&mgr1;

for(int i=0;i<4;i++)
{
	iacsd[i]->display();//i=0  1 2 
	iacsd[i]->calSalary();
 
	cout<<"\n-------------------\n"<<endl;
}

int a=10;
double b=a;//long=int
//int c=static_cast<int>b;

//base class pointer can point to derived class obj

Employee* ptr=&mgr;//every manager is employee
//derived class get  ucaseted to parent employee
//implicitly
//UpCasting
//BaseClassObj=DerivedClassObj  ------>UpCasting
//compile time data type ptr:Employee
//run time data type of ptr:Manager
  ptr->display();//rintime as per type assign,method will get invoked from that type
  //run time assign manager obj so manager display method innvoked
 //ptr->ManagerTask();//YES
//to invoke method of Manager
//forcefully convert Employee into Manager

   Manager* mObj=dynamic_cast<Manager*>(ptr);//DownCasting  Parent---casted-->Manager
   mObj->ManagerTask();
   
   //RTTI
   //Run Time Type Identification

}






