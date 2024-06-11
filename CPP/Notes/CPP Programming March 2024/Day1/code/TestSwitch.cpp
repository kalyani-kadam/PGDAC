#include<iostream>
using namespace std;

int main2()
{
	
	cout<<" 1:add 2:subs 3:div 4:multi 5:max 6:min 7:exit "<<endl;
	int ch;
	int no1,no2,no3;
	cout<<"enter no1 no2"<<endl;
	cin>>no1>>no2;
	cout<<"enter choice "<<endl;
	cin>>ch;
	
	switch(ch){
	
	case 1:cout<<"---add----"<<endl;
	        cout<<"add="<<(no1+no2)<<endl;
	   break;
	case 2:cout<<"---subs----"<<endl;
	        cout<<"subs="<<(no1-no2)<<endl;
	   break;	
	case 3:
	   break;
	  
	  default :cout<<"invalid choice"<<endl;
	  break; 	
		
	}
	cout<<"-----end main-----"<<endl;
	
	
	
	
	
	
}

