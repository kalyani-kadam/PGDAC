#include <iostream>
using namespace std;

int main1()
{
    cout << "Welcome To C++" << endl;
    int no1 = 100;
    cout << "no1 =" << endl; //
    cout << no1 << endl;
    cout << "Enter No1:" << endl;
    cin >> no1;
    cout << "No1=" << no1 << endl;
    cout << "size of int  " << sizeof(no1) << endl;
    cout << "size of char  " << sizeof(char) << endl;
    cout << "size of double  " << sizeof(double) << endl;
    return 0;
}