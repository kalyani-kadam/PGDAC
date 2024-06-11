#include<iostream>
using namespace std;

class Date{
	private:int day,month,year;
	public:Date()
	{
		cout<<"---default Date----"<<endl;
		day=1;month=1;year=1990;
	}
	Date(int d,int m,int y )
	{
		cout<<"---parameter Date----"<<endl;
		day=d;month=m;year=y;
	}
	void showDate()
	{
		cout<<"Date:"<<day<<"/"<<month<<"/"<<year<<endl;
	}
	
	
};

class Product{
	int prdid;
	string name;//
	double price;
	//expiry Date ,manfactureDate
	//
	//has-a relatioship
	//containment:one class object used as data member of another class
	
	Date expDate;//has-a relaionship -----reuse

public : Product()
    {
	prdid=1;
	name="no name";
	price=10.00;
	expDate=Date();//default 
	}	
	Product(int prdid,string name,double price,int i,int j,int k)
	{
		this->prdid=prdid;
		this->name=name;
		this->price=price;
		this->expDate=Date(i,j,k);//parameter
	}
	void displayPrd()
	{
		cout<<"------Product Details--------"<<endl;
		cout<<"PrdId  "<<prdid<<endl;
		cout<<"Name  "<<name<<endl;
		cout<<"Price  "<<price<<endl;
		expDate.showDate();
	
	}
};
int main()
{
 
 cout<<"prdid name price day month year ";
 int prdid;
 string name;
 double price;
 int d,m,y;
 
 cin>>prdid>>name>>price>>d>>m>>y;
 
 Product prd1(prdid,name,price,d,m,y);
 
 prd1.displayPrd();
 	return 0;
}








