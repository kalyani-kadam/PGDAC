#include<iostream>
using namespace std;
namespace MyNamespace{
	
	
	class Box{
	
	private:int l,b,h;
	public:Box(){
		l=b=h=10;
	       }
	       Box(int l,int b,int h)
	       {
	       	this->l=l;
	       	this->b=b;
	       	this->h=h;
	       	
		   }
		   void show()const
		   {
		   	cout<<"  Length="<<l+120<<endl;
		   	cout<<"  Breadth="<<b<<endl;
		   	cout<<"  Height="<<h<<endl;
		   	
		   }  
      //operator overloading  for +
	//box3=box1+box2;  
	   Box operator+(const Box &obj)
	    {
	    //get l,b,h of box1 using this->
		//get l,b,h of box2 using i/p argname   obj
		  int l1=this->l+obj.l;
		  int b1=this->b+obj.b;
		  int h1=this->h+obj.h;
		  
		  
		  Box newObj(l1,b1,h1);
		  return newObj;
		  
		  
		  
		  
		  
		
		}
	
};

Box  createBox(int l,int b,int h)
  {
  	Box obj(l,b,h);
  	return obj;
  }
}
int main56()
{
	MyNamespace::Box box1(10,20,30);
	box1.show();
	cout<<"\n\n";
	MyNamespace::Box box2(100,100,100);
	box2.show();
		cout<<"\n\n";
	MyNamespace::Box box3;
	box3=box1+box2;//for UDT use operator overloading
	box3.show();
	cout<<"\n\n";	
	//LAB :try - substracion,unery operator
   // Box newBox1=createBox(56,67,89);
  // newBox1.show();
}

 




