#include<iostream>
using namespace std;

void add()
{
	int a,b,c;//local variable 
	cout<<"Enter No1 No2 "<<endl;
	cin>>a;
	cin>>b;
	c=a+b;
	cout<<"Add="<<c<<endl;
	
}

void maxmin(int a,int b)
{
	if(a>b)
	cout<<"Max="<<a<<endl;
	else
	cout<<"Max="<<b<<endl;
}
bool chkPrime(int no)
{
bool flg=false;//no=9
for(int i=2;i<no;i++)//2 3
{	if(no%i==0)
	{
	flg=false;
	break;	
	}
	else
	{
	flg=true;	
	}	
}
return flg;
	
}

int readNumber()
{
	cout<<"Enter Number" <<endl;
	int x;
	cin>>x;
 	return x;
	
}


int main12()
{
	cout<<"---function demo----"<<endl;
	//function need to be called explicitly
	add();//invoking function
    add();
	maxmin(12,46);
	cout<<"\n\n";
	cout<<"Enter no "<<endl;
	int no;
	cin>>no;
	bool isPrime=chkPrime(no);
	if(isPrime)
	cout<<"Prime "<<endl;
    else
	   cout<<"Not Prime "<<endl;
	
	cout<<"----end main-----";
	
	return 0;
}
