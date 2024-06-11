#include<iostream>
using namespace std;

class Shape{
	
	public:virtual void area()=0;area()
	   void print(){
	   	cout<<"*******"<<endl;
	   }
};
class Rectangle:public Shape{

public: 
     void area()
     {
     	cout<<"----Rectangle area-----"<<endl;
	 }
	
};
class Circle:public Shape{
	public :void area()
	{
		cout<<"----circle area-----"<<endl;	
	}
};
void showArea(Shape* shp)
{
	shp->area();
}
int main23()
{
	// Shape s;
	// s.area();
	Rectangle rect;
	rect.area();
	
	
	Circle c;
	c.area();
	c.print();
	
	Shape* ptr=&c;
	
	ptr->area();
	return 0;
	
}



