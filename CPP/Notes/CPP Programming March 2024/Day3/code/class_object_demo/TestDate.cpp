#include<iostream>
using namespace std;

class Date{
	//data members are used as  description
	//acces specifiers
	//private:inside class only,outside class is hidden
	
private:int day,month,year;

//to assign/read values of private data members
//create a public function

public:void display();//declare inside class and implement outside class
        void acceptDate(int d,int m,int y)//declaration and implementation done inside class only
        {
        cout<<"----date get assigned----"<<endl;
		day=d;
		month=m;
		year=y;
		}
      bool isLeapYear()
      {
      	cout<<"---checking leapYear----"<<endl;
      	if(year%4==0)
      	return true;
      	else
      	return false;
	  }
	
};
void Date::display(){
	cout<<"-----display----"<<endl;
	cout<<"Date:"<<day<<"/"<<month<<"/"<<year;
}

int main1()
{
	cout<<"----class Demo----"<<endl;
	//how to use Date class
	//create an object  of Date class
	//class is User Define Data Type (UDT)
	
	//syntax:  ClassName objName;
	
	Date dateObj;//created on stack,mem allocated for day,month,year
	
	dateObj.display();//invoking function of Date
	
	dateObj.acceptDate(8,5,1999);
	
	dateObj.display();//8,5,1999
	
	
	cout<<"\n\n";
	Date dob1;
	dob1.acceptDate(3,3,2003);
	dob1.display();//3,3,2003
	
	
	// 
	cout<<"\n\n";
	
	Date dob2;
	dob2.acceptDate(7,7,2000);
bool leap=dob2.isLeapYear();
if(leap)
cout<<"leap "<<"true"<<endl;	
	else
cout<<"leap "<<"false"<<endl;	
	return 0;
}
