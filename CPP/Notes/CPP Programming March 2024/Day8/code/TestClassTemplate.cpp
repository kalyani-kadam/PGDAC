#include<iostream>
using namespace std;
class NonGen{
public:	int no1;
	   int no2; 
	   NonGen(int n1,int n2)
	   {
	   	no1=n1;
	   	no2=n2;
	   }
	   int getNo1(){
	   	return no1;
	   }
	   void setNo1(int n1)
	   {
	   	no1=n1;
	   }
	   void display()
	   {
	   	cout<<"No1="<<no1<<"   No2="<<no2<<endl;
	   }
};
//generic
template<class T>
class MyGen{
	
	public :T no1;
	        T no2;
	        MyGen(T n1,T n2)
	        { 
	        no1=n1;
	        no2=n2;
			}
			//getter
			T getNo1()
			{
				return no1;
			}
			//setter
			void setNo1(T n1)
			{
				no1=n1;
			}
			void display(){
				cout<<"No1="<<no1<<"   No2="<<no2<<endl;
			}
};





template<class T>
void printInfo(const T &value){
	
	if constexpr (is_integral_v<T>)
	cout<<"Integer value "<<endl;
	else
	cout<<"Non-Integer  "<<endl;
	
	
}
template<class...T>
auto sum(T... nos){
	
	return (...+nos);
}

int main567()
{
	int a=10,b=30;
	NonGen ngObj(a,b);//
	ngObj.display();
	 
	cout<<"\n-----Using GenClass------"<<endl;
	MyGen mgObj(a,b);
	mgObj.display();
	mgObj.no1=30;
cout<<"Get No1="<<mgObj.getNo1();
	
	cout<<"\n-----Using GenClass------"<<endl;
    MyGen strObj("Welcome "," IACSD");
	strObj.display();
	cout<<"  Get No1 "<<strObj.getNo1();
	
	//Lab:Use MyGen class for Book and Date
	//Lab:can we use two types in genric <T1,T2>
	
	printInfo(a);
	printInfo(90.34);
	printInfo("Abc");
	
	cout<<"-----fold expression------"<<endl;
	
	auto s=sum(1,2,3,4,5);
	cout<<"Sum="<<s<<endl;
	
	auto dd=sum(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
	cout<<"Sum "<<dd<<endl;
	
	
	
	
	
	
	
	
}
