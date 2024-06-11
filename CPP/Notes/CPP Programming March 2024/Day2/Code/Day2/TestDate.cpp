#include<iostream>
#include<math.h> //API
using namespace std;

class Date
{
//data members: to describe class
//access specifiers:private,proteced,public
//by default:private
private:int day,month,year;
//private:inside class only
//outside class these are hidden
	
	
	//to access to read or to assign values of 
	//data member create public functions
public: void displayDate()//read 
    {
    	cout<<"Date :"<<day<<"/"<<month<<"/"<<year<<endl;
	}	
	void assignDate(int d,int m,int y);
};
void Date::assignDate(int d,int m,int y)
{
	cout<<"Date is created "<<endl;
	day=d;
	month=m;
	year=y;
}

int main()
{
	int a;
	//client
	Date obj;//containes day month year
	obj.displayDate();//garbage
	obj.assignDate(12,3,1999);//
	obj.displayDate();//
	
}
//Lab:create class Reactangle with data member height,width
//accept data members using function
//display data members 
//calculate area of Rectangle
//Lab :create class Circle
//Lab :Student 


