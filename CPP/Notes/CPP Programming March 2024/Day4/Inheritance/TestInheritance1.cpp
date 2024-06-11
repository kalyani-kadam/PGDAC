#include<iostream>
using namespace std;
class BaseClass{
	private :int privateNo;//inside class only
	protected:int protectedNo;//inside child class only
	public :int publicNo;//everywhere
	       BaseClass()
	       {
	       	cout<<"---default BaseClass----"<<endl;
	       	
	       	privateNo=1;
	       	publicNo=100;
		   }
	    void publicMethodBaseClass()
	    {
	    	cout<<"PrivateNo "<<privateNo<<endl;
	    	cout<<"PublicNo "<<publicNo<<endl;
		}
};

//create a new class based on existing class
class DerivedClass :public BaseClass
{
	public:int no1;
	    DerivedClass()
	    {
	    	cout<<"----default DerivedClass----"<<endl;
	    	no1=99;
		}
	   void display()
	   {
	   	//public data member of parent class
	   	//this->privateNo=90;//private are not accessible by child
	   this->protectedNo=304;
	   	cout<<" Parent DataMember "<<this->publicNo;//BaseClass
	   	cout<<"no1 "<<no1<<endl;
	   }
};


int main1()
{
	
	BaseClass baseObj;
 	baseObj.publicMethodBaseClass();
 	
cout<<"-----------------"<<endl;
DerivedClass derivedObj;
derivedObj.display();
derivedObj.publicMethodBaseClass();//inherits parent function


}



