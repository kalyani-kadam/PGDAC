#include<iostream>
using namespace std;

template<class T>
void swapValues(T &a,T &b){
	
	T temp=a;
	a=b;
	b=temp;
	cout<<"inside swap  a= "<<a<<"   b="<<b<<endl;
	
}
template<class T>
T showValue(T value)
{
	return value;
}
int main2()
{
int a=10,b=20;
swapValues(a,b);
cout<<"A="<<a<<"    B="<<b<<endl;	

double d1=90.34,d2=45.45;
swapValues(d1,d2);	
cout<<"D1="<<d1<<"    D2="<<d2<<endl;
char c1='A',c2='Z';	
swapValues(c1,c2);
cout<<" C1="<<c1<<"    C2="<<c2<<endl;
//Lab:Create Date  class 
//and use swapValues for Date type




	
	
	
}
