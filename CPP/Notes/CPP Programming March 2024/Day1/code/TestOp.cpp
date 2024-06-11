#include<iostream>
using namespace std;
int main1()
{

int a=10,b=39;
int c=(a>b)?a:b;
cout<<"max="<<c<<endl;

int x=1;
cout<<"x="<<x<<endl;
x=x+1;
cout<<"x="<<x<<endl;
x++;
cout<<"x="<<x<<endl;
int y=x++;
cout<<"y "<<y<<"x  "<<x<<endl;

int z=1;
int k=++z;
cout<<"k ="<<k<<"    z="<<z<<endl;


	return 0;
}
