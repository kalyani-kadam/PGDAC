#include <bits/stdc++.h>
using namespace std;

int main()
{
	cout<<"------------"<<endl;
	auto x = 4;
	auto y = 3.37;
	auto z = 3.37f;
	auto c = 'a';
	auto ptr = &x;
	auto pptr = &ptr; //pointer to a pointer
	cout << typeid(x).name() << endl
		<< typeid(y).name() << endl
		<< typeid(z).name() << endl
		<< typeid(c).name() << endl
		<< typeid(ptr).name() << endl
		<< typeid(pptr).name() << endl;

	return 0;
}
