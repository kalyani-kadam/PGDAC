#include<iostream>
using namespace std;
//this is demo of constructor
class cDate{

private:int day,month,year;	
public:
	//rule for constr
	//constr name must be same as class name
	//no return type ,not even void
	//types of constr
	//1:default const(no argument or argument less constr)
	//2:parametrised constr
	 cDate()
	 {
	 cout<<"-----default constr cDate-----"<<endl;
	 day=1;month=1;year=1990;
	 	
	 }
	 cDate(int d,int m,int y)
	 {
	 cout<<"-----parameter constr cDate-----"<<endl;
	 day=d;month=m;year=y;	
	 }
	 void printDate()
	 {
	 	cout<<"Date:"<<day<<"/"<<month<<"/"<<year;
	 }
	 void assignDate(int d,int m,int y)
	 {
	 	day=d;month=m;year=y;
	 }
};

int main4()
{
	
	cout<<"---constr demo-----"<<endl;
	
	cDate dob1;//default constr get invoked implicitly
	dob1.printDate();// 1 1 1990
	cout<<"--------------------"<<endl;
	
	cout<<"enter day month year "<<endl;
	int d,m,y;
	cin>>d>>m>>y;
	
	//create object of cDate class and pass paramete
	
	cDate dob3(d,m,y);//parameter 
	dob3.printDate();
		
	
	cout<<"--------------------"<<endl;
	
	
	int a=30;
	
	int b=a;//b=30
	
	cDate d1(3,3,2003);
	cout<<"d1 Date  ";
	d1.printDate();//3 3 2003
	
	cDate d2(d1);//compiler defines its own copyCostr
	cout<<"d2 Date:  ";
	d2.printDate();
	
//	for(int i=1;i<=5;i++)
//	{  int a=10;
//	 	cDate dob2;// 
//     }
	
}



