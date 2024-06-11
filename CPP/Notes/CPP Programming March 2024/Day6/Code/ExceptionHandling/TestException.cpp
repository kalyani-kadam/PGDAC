#include<iostream>
using namespace std;

int division(int i,int j)
{
	if(j==0)
	throw 10;
	else
	return i/j;
}
int main13()
{
//	int a="abc";//compile time error
try{
 
    int a=10;
	cout<<"A ="<<a<<endl;
	int b;
	cout<<"Enter B ";
	cin>>b;//abcxyz
	cout<<" B="<<b;
	
	if(b==0)
	throw 10;
	
	if(b==1)
	throw 12;
	
	if(b<0)
	cout<<" num is 0";
//	throw "Invalid";
	else
	int c=a/b;//when b=0 throw exception

	cout<<"c="<<c<<endl;
	int arr[2];
	//arr[4]=90;
	
	cout<<"---div="<<c<<endl;
	cout<<"-----------main end--------"<<endl;
}
catch(int no)
{
	if(no==10)
	cout<<"Division Related Excption"<<endl;
	if(no==1)
	cout<<"Exception  no==1"<<endl;
}
catch(double d)
{
	
}
catch(const char *ch)
{
	cout<<"Exception:"<<ch<<endl;
}
catch(...){
	cout<<"Exception occur"<<endl;
}
	return 0;
	
}
