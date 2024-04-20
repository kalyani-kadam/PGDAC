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
	   Box operator-(const Box &obj2)
	    {
	    //get l,b,h of box1 using this->
		//get l,b,h of box2 using i/p argname   obj
		  int l1=this->l-obj2.l;
		  int b1=this->b-obj2.b;
		  int h1=this->h-obj2.h;
		  
		  
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
int main()
{
	MyNamespace::Box box1(10,20,30);
//Box box1=createBox(10,20,30);
//   newBox1.show();
	box1.show();
	cout<<"\n\n";
	MyNamespace::Box box2(100,100,100);
//Box box2=createBox(100,100,100);
//   newBox1.show();
	box2.show();
		cout<<"\n\n operator overloading \n";
	MyNamespace::Box box3;
	box3=box1-box2;//for UDT use operator overloading
	box3.show();
	cout<<"\n\n";	
	//LAB :try - substracion,unery operator
//  	Box newBox1=createBox(56,67,89);
   MyNamespace::Box newBox1=MyNamespace::createBox(100,67,89);
   newBox1.show();
}