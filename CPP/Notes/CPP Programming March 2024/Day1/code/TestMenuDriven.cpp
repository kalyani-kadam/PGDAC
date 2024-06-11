#include<iostream>
using namespace std;


int main5()
{
	//
	cout<<"1:pen 10rs 2: color box 30Rs  3: notebook 50 4 :exit"<<endl;
	
	int ch,qty;
	int total=0;
	do{
	cout<<"enter choice:"<<endl;
	cin>>ch;	
    switch(ch)
	{
	case 1:cout<<"Enter Qty pen"<<endl;
	       cin>>qty;
	       total+=qty*10;
	     break;		 		
	case 2:cout<<"Enter Qty colour box "<<endl;
	       cin>>qty;
	       total+=qty*30;
	
	     break;		
	case 3:cout<<"Enter Qty NB "<<endl;
	       cin>>qty;
	       total+=qty*50;
	
	     break;	
	case 4:cout<<"Total Amount="<<total<<endl;
	
	     break;	
	default:cout<<"invalid choice:"<<endl;
	break;	
    }
	}while(ch!=4);
	cout<<"----Thank You  ----- Total="<<total<<endl;
	
	
	
	
	
	
}
