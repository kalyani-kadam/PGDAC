#include<iostream>
using namespace  std;
//demo:copy constructor
class Box2{
	
	private:int length ,height;
	        int *breadth;
	
	public:Box2()
	{
		//
		breadth=new int;//memory get allocated on heap
	length=height=20;
	*breadth=20;	
	}
	Box2(int length,int breadth,int height)
	{
		this->breadth=new int;//memory get allocated on heap
		this->length=length;
		*this->breadth=breadth;
		this->height=height;
	}
	//write copy constr when any data memer get stored on heap
	//to avoid memory leakge
	//Box2 box2(box1);
	Box2(const Box2 &obj)
	{
		this->breadth=new int;//on heap
		this->length=obj.length;
		this->height=obj.height;
		*breadth=*obj.breadth;
	}
	
	int getLength()
	{
		return this->length;
	}
	int getHeight()
	{
		return this->height;
	}
	int getBreadth()
	{
		return *breadth;
	}
	
	void setBreadth( int b)//90
	{
		*breadth=b;
	}
	
	
	void display()
	{
		cout<<"\n\n length="<<length
			<<"   Breadth="<<*breadth 
			<<"  Height="<<this->height<<endl;
	}

 

	~Box2()
	{
		cout<<"----destroy Box Obj-----"<<endl;
		delete breadth;
		cout<<"memory deleted from heap"<<endl;
	}
};
int main2()
{
Box2 box1(23,45,56);
box1.display();
 
Box2 box2(box1);
box2.display();
 
 cout<<"----change in box1 breadth \n\n "<<endl;
 box1.setBreadth(90);
 box1.display();
 box2.display();
 
return 0;	
}










