#include<iostream>
using namespace std;

int main51()
{
 
for(int  i=1;i<=10;i++)
{
cout<<i<<" ";


}
cout<<"\n -----------------"<<endl;

for(int i=1;i<=100;i++)
{
	cout<<i<<" ";
	if(i==5)
	break;
}
cout<<"------------"<<endl;


for(int i=1;i<=10;i++)
{

	if(i==5)
	continue;
	cout<<i<<" ";
}

	
//prime number

	
	cout<<"enter number  "<<endl;
	int num;
	cin>>num;
	int flg=0;
	bool status=false;
	for(int i=2;i<num;i++)
	{
		//i=2
		if(num%i==0)
		{
			status=false;
			//flg=0;
	//	cout<<"not prime" <<endl;	
		break;
		}
		else
		{
			status=true;
		//	flg=1;
		//	cout<<"prime "<<endl;
		}
	}
	
	
//	if(flg==0)
//	cout<<"not prime"<<endl;
//	else
//	cout<<"prime "<<endl;
	
	if(status)
	{
	cout<<"prime "<<endl;	
	}
	else
	{
		cout<<"not prime "<<endl;
	}

//lab: print prime numbers between 1 to 50

//modify: accept fromNO and toNO and display prime numbers  


	
	
	
}
