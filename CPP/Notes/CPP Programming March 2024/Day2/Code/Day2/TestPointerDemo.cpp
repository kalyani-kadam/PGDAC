#include<iostream>
#include<math.h> //API
using namespace std;

void testPointers()
{
	cout<<"----basics of Pointers-----"<<endl;
	
	int a=30;
	cout<<"a Stored at Address :"<<&a<<endl;
	
	//create pointer
	int *ptrA=&a;
	cout<<"value in ptrA "<<*ptrA<<endl;
		cout<<"\n\n";
		cout<<" address in ptrA "<<ptrA<<endl;
	//change in a
	a=90;
	cout<<"\n\n";
	cout<<"value in ptrA "<<*ptrA<<endl;
    cout<<"ptrA stored at Address "<<&ptrA<<endl;
	
	//change value of a using pointer
	*ptrA=56;
	cout<<"  a="<<a<<endl; 
	
	
	int num=567;
	ptrA=&num;//
	cout<<"\n\n "<<endl;
	
	cout<<"value in ptrA "<<*ptrA<<endl;
    cout<<"ptrA stored at Address "<<ptrA<<endl;

	
	
	
}

void testPointer2()
{
	
const int x=90;
//x is const can not modifies
//pointer to const int x
const int* ptrX=&x;
cout<<"value in ptrX="<<*ptrX <<"     address:"<<ptrX<<endl;
	
  //x=100;//error
  //try to change value of const int using pointer
  //	
  // *ptrX=200;//error :inValid
  
  //can this ptrX point to new variable
  int num2=1;
  ptrX=&num2;//valid
cout<<"value in ptrX="<<*ptrX <<"     address:"<<ptrX<<endl;


//constant pointer

//const pointer value can get change but not address
//pointer is constant

int m=78;
int* const ptrM=&m;

cout<<"value   "<<*ptrM<<"       "<<ptrM<<endl;;
//try to change value using pointer
*ptrM=98;//Valid
cout<<"value   "<<*ptrM<<"       "<<ptrM<<endl;;

//ptrM=&num2;//changing address //error  invalid


//Lab: const pointer to const int



	
}

void testNewDelete()
{
	
	int a=30;
	int *ptrA=new int;//memory get allocated on heap
	*ptrA=380;
	
	cout<<"  ptrA "<<*ptrA<<"     "<<ptrA<<endl;
	
	//ptrA=NULL;
	delete ptrA;
//	cout<<"  ptrA "<<*ptrA<<"     "<<ptrA<<endl;
	
	
}
void testPointerToArray()
{
	
	int arr[]={24,5,67,89,29,11,2};
	
	//pointer to array
	int *ptr=arr;
	
	//cout<<" ptr "<<*ptr<<endl;
	for(int i=0;i<7;i++)
	{
		cout<<*(ptr+i)<<"   ";
	}
	
	
}
int main2()
{
	
	cout<<"---pointers in c++ -------"<<endl;
	
//	testPointers();
	
	//testPointerToArray();
	const int a=10;
	cout<<"a  "<<a<<endl;
//	a=34;
//	testPointer2();
	
	testNewDelete();
	
	
}
