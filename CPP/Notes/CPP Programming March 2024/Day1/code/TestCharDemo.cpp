#include<iostream>
using namespace std;

int main6()
{
	cout<<"-----chr demo----"<<endl;
	char c1='a',c2='Z';
	int a=c1;
	cout<<"c1 ="<<c1<<"    a="<<a<<endl;
	
	int b=c2;
	cout<<"c2 ="<<c2<<"    b="<<b<<endl;
	//lab:print A to Z
	
	for(int i=65;i<=90;i++)
	{
	//	char c=i;
	  // cout<<c<<"  ";	
	cout<<(char)i<<" ";	
	}
	//lab:accept lowercase char and convert to upper case
	
	
	
	return 0;
}
