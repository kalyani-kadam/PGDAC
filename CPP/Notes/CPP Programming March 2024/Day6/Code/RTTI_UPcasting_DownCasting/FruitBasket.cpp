#include<iostream>
using namespace std;
namespace FruitBasket{

class Fruit{
	private :string name,color;
	         double weight;
	public  :Fruit(){
		    name="no name";color="no color ";weight=0.0;
	       }
	       Fruit(string nm,string col,double wegt){
		    name=nm;color=col;weight=wegt;
	       }
	
	 		virtual void taste()=0;//abstract method
	         void show()
	         {
	         	cout<<"Name "<<name<<"   Color:"<<color<<"   "<<weight<<endl;
			 }
};
class Apple:public Fruit{
	     public :Apple()
	     {
	     	
		 }
		 Apple(string name,string color,double weight):Fruit(name,color,weight){}
		 
        void taste()
        {
        	cout<<"Apple taste : sweet "<<endl;
		}
		void appleJam()
		{
		cout<<"AppleJam Created "<<endl;
		}

};


class Mango:public Fruit{
	public :Mango(){}
	        Mango(string name,string color,double weight):Fruit(name,color,weight)
	        {
			}
		void taste()
        {
        	cout<<"Apple taste : sweet and sour "<<endl;
		}
		void pulp()
		{
			cout<<"Pulp extact of Mango"<<endl;
		}
	};
	class Orange:public Fruit{
		public:Orange(){}
		Orange(string name,string color,double weight):Fruit(name,color,weight)
		{
		}
	   	void taste()
        {
        	cout<<"Apple taste :   sour "<<endl;
		}
		void juice(){
			cout<<"Orange Juice Created"<<endl;
		}
	};
	
	 
}


int main1()
{
	cout<<"1 Add Mango  2: add Apple 3: Add Orange 4: Show All 5:exit";

int ch,index=0;
string name,color;
double weight;

//store all fruits in array
FruitBasket::Fruit*  shop[5];
 
typedef FruitBasket::Mango Mango;
Mango* m ;
typedef FruitBasket::Orange Orange;
Orange* o;
typedef FruitBasket::Apple Apple;
Apple* ap;
do{
	cout<<"\n Enter Choice :";
	cin>>ch;
	switch(ch){
		case 1:
		     if(index<5){
			  
		      cout<<"for Mango Enter Name color weight ";
		      cin>>name>>color>>weight;
		        
		       m=new Mango(name,color,weight);
		       shop[index]=m;//upcasting
		       index++;//1
		       cout<<" MAngo Is Added "<<endl;
		      }
		      else
		      {
		      cout<<"Basket Is Full "<<endl;	
			  }
		
		 break;
		case 2:
		 if(index<5){
			  
		      cout<<"for Apple Enter Name color weight ";
		      cin>>name>>color>>weight;
		        
		      ap=new Apple(name,color,weight);
		       shop[index]=ap;//upcasting
		       index++;//1
		      }
		      else
		      {
		      cout<<"Basket Is Full "<<endl;	
			  }
		
		
		     break;
		case 3:
		   if(index<5){
			  
		      cout<<"for Orange Enter Name color weight ";
		      cin>>name>>color>>weight;
		        
		       o=new Orange(name,color,weight);
		       shop[index]=o;//upcasting
		       index++;//1
		      }
		      else
		      {
		      cout<<"Basket Is Full "<<endl;	
			  }
		
		     break;
		case 4:cout<<"\n-------------------\n"<<endl;
		for(int i=0;i<index;i++)
		{
			shop[i]->show();
			shop[i]->taste();
			cout<<"\n";
			//can Base class access behaviour of Derived:NO
		 
			//to avoid run time error related to type casting
			//use RTTI
		if(typeid(*shop[i])==typeid(Mango))	{
			Mango *mangoObj=dynamic_cast<Mango*>(shop[i]);
			mangoObj->pulp();
			//DownCasting
		}
		if(typeid(*shop[i])==typeid(Orange))
          {
          	Orange *orangeObj=dynamic_cast<Orange*>(shop[i]);
          	orangeObj->juice();
	      }	 
			if(typeid(*shop[i])==typeid(Apple))
          {
          	Apple *appleObj=dynamic_cast<Apple*>(shop[i]);
          	appleObj->appleJam();
	      }	 	
			
			
		}
		     break;
		default:cout<<"invalid choice"<<endl;
		break;
		
	}
	
	
	
	
}while(ch!=5)	;
	
	
	
	
	
	
	
}






	


