#include<iostream>
using namespace std;

void displayNumber(int a)// local to  displayNumber a=100
{
	cout<<"Number Is "<<a<<endl;
}
void changeNumber(int a)//int a=100
{
	a=a+500;
	cout<<"Incremented Value="<<a<<endl;//600
	
}


int main2()
{
	int no=100;//local to main function
	displayNumber(no);
     cout<<"After Display   no="<<no<<endl;
     
     changeNumber(no);//parameter get passes as by value
     cout<<"After ChangeNumber  no "<<no<<endl;
	return 0;
}




