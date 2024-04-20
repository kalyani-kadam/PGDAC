/* 4. Write a program to calculate factorial of a number. 
For e.g. factorial of 5 = 5! = 5 *4*3*2*1 = 120*/
#include<iostream>
using namespace std;
int main()
{
    int n,fact=1;
    cout<<"Enter number:";
    cin>>n;
    for (int i = n; i>=1; i--)
    {
        fact = fact*i;
    }
    cout<<fact;
    return 0;
}
