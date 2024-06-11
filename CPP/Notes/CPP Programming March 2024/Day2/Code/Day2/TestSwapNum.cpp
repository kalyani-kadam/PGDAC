#include<iostream>
using namespace std;

void swapByValue(int a,int b)//bydefault :by value
{
	int temp=a;//10
	a=b;//20
	b=temp;//10
	cout<<"inside swapByValue     a="<<a<<"     b="<<b<<endl;
	//a=20  b=10
}


void swapByRef(int &a,int &b)//bydefault :by value
{
	int temp=a;//10
	a=b;//20
	b=temp;//10
	cout<<"inside swapByValue     a="<<a<<"     b="<<b<<endl;
	//a=20  b=10
}


void swapByAddress(int* a,int* b )
{
	int temp=*a;
	*a=*b;
	*b=temp;
   cout<<"inside swapByAddress     a="<<*a<<"     b="<<*b<<endl;

}





int main4()
{
	int a=10,b=20;
	cout<<"b4 swapbyValue  a="<<a<<"     b="<<b<<endl;//10 20
	swapByValue(a,b);//byVal
	cout<<"after swapbyValue  a="<<a<<"     b="<<b<<endl;//10  20
    cout<<"\n\n"<<endl;

    cout<<"b4 swapbyRef  a="<<a<<"     b="<<b<<endl;//10 20
	swapByRef(a,b);//byRef
	cout<<"after swapbyRef  a="<<a<<"     b="<<b<<endl;//10  20
  
    a=10;
    b=20;
    
    cout<<"\n\n"<<endl;
  
     cout<<"b4 swapbyAddress  a="<<a<<"     b="<<b<<endl;//10 20
     swapByAddress(&a,&b);//BYAddress using pointers
	cout<<"after swapbyAddress  a="<<a<<"     b="<<b<<endl;//10  20
  
	return 0;
}
