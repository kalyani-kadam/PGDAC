#include<iostream>
using namespace std;

int main1()
{
//	cout<<"Enter char "<<endl;
//	char ch;
	//cin>>ch;
	//cout<<"Char="<<ch;
	//
//	cout<<"Enter Char "<<endl;
//	cin.get(ch);
//	cout<<"Char  ";
//	cout.put(ch);
//	cout.put('M');
	//cout<<"Char "<<ch;
	//getline
//	char name[10];
//	cout<<"Enter Name:";
//	cin.getline(name,10);
//	cout<<"--Name " <<endl;
//	cout.write(name,5);
	
	int no=100;
	cout<<no<<endl;
	cout<<"-----using width------"<<endl;
	//Adjusting the width of the next value to displayed to 10 columns.
	cout.width(10);
 	cout<<no;
 	//fill demo
 	char ch='O';
 	cout<<endl;
//	//Calling the fill function to fill the white spaces in a value with a character our of choice.
 cout.fill('*');
//	//Setting the width of this value to 10
 	cout.width(10);
//	
//	//Printing the first value
 	cout<<ch <<"\n";// o/p is *********O
 	cout.width(5);
cout<<no;
	//lab:peek()
	
	
		
	//Printing the first value
	cout<<ch <<"\n";// o/p is ****O
	
	
	
	//peek() demo
	//First char value
	char d1;	
	cout<<"Please enter a character to be read by the peek() function : ";

	//Calling the peek() function to return the next character from input stream, without removing it from the stream
	d1 = cin.peek();
	//Printing the first char value
	cout<<"The value in d is : " << d1 <<"\n";
	
	
	//setf() demo
	//A floating-point value
float d = 12.3458998f;
	
	//Printing the floating-point value
//	cout<< "The floating value in variable d : " << d <<"\n";
	//Calling setf() function to set the flags to display a fixed number of digits after decimal in a floating-point value.
	cout.setf(ios::fixed, ios::floatfield);

	//Defining the number of digits to be displayed after the decimal in a floating number.
	cout.precision(3);

	//Printing the floating-point value after calling the setf() and precision() function
	cout<< "The floating value in variable d, after calling the precision() function : " << d;
	

	
	
	
	
	
	return 0;
}
