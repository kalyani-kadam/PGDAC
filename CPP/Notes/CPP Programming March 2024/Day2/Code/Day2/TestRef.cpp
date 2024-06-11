#include<iostream>
using namespace std;

void changeNumber1(int no)
{
	no=no+500;
	cout<<"inside fun no="<<no<<endl;
}
void changeNumberByRef(int &no)
{
	no=no+500;
	cout<<"inside fun no="<<no<<endl;
}

int main3()
{
	int num=100;
	cout<<num<<"     at loc :"<<&num<<endl;
	
	int &refNum=num;
	cout<<"\n refNum "<<refNum<<"   at loc "<<&refNum<<endl;
	
	cout<<"\n";
	
	changeNumber1(num);
	cout<<"After Fun no="<<num<<endl;//
	
	changeNumberByRef(num);
		cout<<"After Fun no="<<num<<endl;//
	
	return 0;
	
}
