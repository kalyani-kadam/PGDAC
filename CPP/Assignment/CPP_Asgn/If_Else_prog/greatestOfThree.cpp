/*8. Write a program to accept 3 numbers and compute minimum and maximum from them.*/
#include<iostream>
using namespace std;
int main(){
    int num1,num2,num3;
    cout<<"Enter 3 numbers: ";
    cin>>num1>>num2>>num3;
    cout<<"Max: ";
    if (num1>num2)
    {
        if (num1>num3)
        {
            cout<<num1;
        }
        else
        {
            cout<<num3;
        }  
    }
    else if (num2>num3)
    {
        cout<<num2;
    }
    else
    {
        cout<<num3;
    }
    cout<<" Min: ";
    if (num1<num2)
    {
        if (num1<num3)
        {
            cout<<num1;
        }
        else
        {
            cout<<num3;
        }  
    }
    else if (num2<num3)
    {
        cout<<num2;
    }
    else
    {
        cout<<num3;
    }
    return 0;
}