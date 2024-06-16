#include <iostream>
using namespace std;

int main2()
{
	cout << "------Operations-----" << endl;
	int a, b, c;
	cout << "enter no1 no2 " << endl;
	cin >> a;
	cin >> b;

	c = a + b;
	cout << c << endl;
	cout << "c=" << c << endl;
	cout << "add =" << c << endl;
	cout << a << "+" << b << "=" << c << endl;

	// lab:
	// find max between a and b

	if (a > b)
	{
		// true
		cout << "max=" << a << endl;
	}
	cout << "-----------else------" << endl;

	if (a > b)
	{
		cout << "max=" << a << endl;
	}
	else
	{
		cout << "max=" << b << endl;
	}

	cout << "----------if -else if------" << endl;
	if (a > b)
	{
		cout << "max=" << a << endl;
	}
	else if (b > a)
	{
		cout << "max=" << b << endl;
	}
	else
	{
		cout << "a==b" << endl;
	}
	cout << "-----end-----" << endl;
}
