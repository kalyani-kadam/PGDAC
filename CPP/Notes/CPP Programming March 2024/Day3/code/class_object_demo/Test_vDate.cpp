#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class vDate{
	private:int day,month,year;
	public:vDate()
	{
		cout<<"----default vDate----"<<endl;
		day=1;month=1;year=1990;
	}
	vDate(int day,int month,int year)//9,12,2012
	{
		cout<<"----parameter vDate----"<<endl;
		 
		 this->day=day;//  data member=local var
		 this->month=month;
		 this->year=year;
			 
	}
	void printDate()
	 {
	 	cout<<"Date:"<<day<<"/"<<month<<"/"<<year;
	 }
};

int main()
{
	vDate d1;//default
	cout<<"\n\n";
	vDate d2(9,12,2012);//parameter
	d2.printDate();//9 12 2012
	
	
	
	
}







