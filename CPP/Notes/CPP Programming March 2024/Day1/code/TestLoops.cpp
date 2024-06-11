#include<iostream>
using namespace std;


int main()
{
	int a=1;
	//print a=1   to 10 
	while(a<=10)
	{	
	cout<<"a ="<<a<<endl;
	a++;
     }
	cout<<"after loop  a="<<a<<endl;
	
	int no=1;
	cout<<"even numers between 1 to 20"<<endl;
	
	while(no<=20)
	{
		if(no%2==0){
		 
		cout<<no<<" ";
	    }
		no++;
	}
	
	cout<<" accept positive number and make additions  "<<endl;
	int num=0;
	int sum=0;
	while(num>=0)
	{
	cout<<"enter number :"<<endl;
	cin>>num;
	sum=sum+num;	
	}
	
	cout<<"Sum ="<<sum<<endl;
	
	cout<<"------do while-----"<<endl;
	int x=0;
	int total=0;
	do{
		total=total+x;
		cout<<"enter num "<<endl;
		cin>>x;
		
	}while(x>=0);
	cout<<"total="<<total<<endl;
	
	
	
}
