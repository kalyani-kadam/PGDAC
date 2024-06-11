#include<iostream>
using namespace  std;
//demo:copy constr implemented by compiler
class Box1{
	
	private:int length,breadth,height;
	
	public:Box1()
	{
		//
	length=breadth=height=20;	
	}
	Box1(int length,int breadth,int height)
	{
		this->length=length;
		this->breadth=breadth;
		this->height=height;
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
		return this->breadth;
	}
	
	void setBreadth( int breadth)
	{
		this->breadth=breadth;
	}
	
	
	void display()
	{
		cout<<"\n\n length="<<length
			<<"   Breadth="<<breadth 
			<<"  Height="<<this->height<<endl;
	}

//box1.isSame(box2);   Box1 obj=box2
   bool isSame(const Box1 &obj)
   {
    //how to get box1  height breadth length
   	//box1 ref is stored in this->
   	//this->height means box1.height
   	
   	if(this->height== obj.height  && this->breadth==obj.breadth && this->length==obj.length)
   	return true;
   	else
   	return false;

   	
   }

	~Box1()
	{
		cout<<"----destroy Box Obj-----"<<endl;
	}
};
int main1()
{

Box1 box1;//deafult
box1.display();
box1.setBreadth(90);
box1.display();
Box1 box2(34,45,67);
box2.display();
bool result=box1.isSame(box2);
if(result)
cout<<" box are same"<<endl;
else
cout<<" box are not same "<<endl;

cout<<"---------"<<endl;
Box1 box3(34,45,67);
box3.display();
   if(box2.isSame(box3))
	cout<<" box2==box3 are same"<<endl;
	else
	cout<<" box2!=box3 are not same "<<endl;
	
	
int a=10;
int b=a;
cout<<"\n\n";
Box1 b1(60,70,80);
b1.display();
Box1 b2=b1;//object2=object1
b2.display();//
	
cout<<"\n\n";
Box1 b3(80,90,100);
b3.display();
Box1 b4(b3);//implicitly compiler defines its own copy constructor
b4.display();	
return 0;	
}










