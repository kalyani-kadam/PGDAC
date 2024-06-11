#include<iostream>
using namespace std;
class Point
{
	
	private:int x,y;
	
	public:void print()
	{
		cout<<"----display point-----"<<endl;
		cout<<"X-cord="<<x<<"  Y-cord="<<y<<endl;
	}
	void createPoint(int a,int b)
	{
		x=a;
		y=b;
		cout<<"---point created----"<<endl;
	}
	void assignPoint()
	{
		x=10;
		y=10;
		cout<<"---point created----"<<endl;
	}
	
};


int main2()
{
	Point p1;
	p1.print();//garbage
	
	//assign value to x,y cord
	cout<<"Enter X Y "<<endl;
	int x,y;
	cin>>x>>y;//45 30
	
	p1.createPoint(x,y);//45,30
	p1.print();//
	
	
	
	//create one more obj of Point
	
	Point p2;//

	p2.print();
	p2.createPoint(80,90);
	
	
	
	
	
	
}
