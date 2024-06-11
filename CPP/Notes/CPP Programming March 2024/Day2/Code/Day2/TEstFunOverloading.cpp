#include<iostream>
#include<math.h> //API
using namespace std;

void add1(int i,int j)
{
	cout<<"add(i,j)="<<i+j<<endl;
}
void add2(double i,double j)
{
	cout<<"add(d1,d2)="<<i+j<<endl;
}

void add3(int i,int j,int k)
{
	cout<<"add(i,j,k)="<<i+j+k<<endl;
}
void add4(double i,int j)
{
	cout<<"add(d,j)="<<i+j<<endl;
}
void add5(int i,double j)
{
	cout<<"add(i,d)="<<i+j<<endl;
}

void sum(int i,int j)
{
	cout<<"sum(i,j)="<<i+j<<endl;
}

void sum(double i,double j)
{
	cout<<"sum(d1,d2)="<<i+j<<endl;
}

void sum(double i,int j)
{
	
	cout<<"sum(d,j)="<<i+j<<endl;
}
double sum(int i,double j)
{
	cout<<"sum(i,d)="<<i+j<<endl;
}
int sum(int i,int j,int k)
{
	cout<<"sum(i,j,k)="<<i+j+k<<endl;
}

inline int getMax(int i,int j)
{
	return(i>j?i:j);
}
int main6()
{
	
	cout<<"---function Overloading----"<<endl;
	add1(12,34);
	add2(12.34,34.56);
	add3(1,2,3);
	add4(45.67,56);
	add5(4,22.45);
	
		cout<<"---using function Overloading----"<<endl;

	sum(12,34);
	sum(1,2,3);
	
	sum(11.34,2);
	
	sum(23,23.56);
	sum(23.45,7.89);
	
//	sum(12,3,4,5,6);//error

cout<<"---using inline function Overloading----"<<endl;

int m=getMax(23,56);//
cout<<"Max="<<m<<endl;

int d=max(23,3);
cout<<" max  ="<<d<<endl;
 int sqt= sqrt(16);//
cout<<" sqrt ="<<sqt<<endl;
}





