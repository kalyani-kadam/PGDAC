#include<iostream>
#include<math.h> //API
using namespace std;


int main8()
{
	cout<<"---type casting------"<<endl;
	int a=20;
	long l=a;//implicitly  by compiler
	cout<<" long ="<<l<<endl;
	
	short s;
	s=(short)l;//by programmer
	cout<<"short: "<<s<<endl;
	
	//static cast
	
	int x=23;
	
	float f=x;//by compiler
	//explicitly done y programmer
	
	float f2=static_cast<float>(x);
	
	cout<<"f2  ="<<f2<<endl;
	
	
	
	
}
