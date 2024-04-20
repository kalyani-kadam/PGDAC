/* 2. Write a program to accept two integers x and n and compute x raised to n.*/

#include<iostream>
using namespace std;
int main()
{
    int x,n,j=1;
    cout<<"Enter two no.";
    cin>>x>>n;
    int pow=x;
    while (n!=j)
    {
        pow=pow*x;
        j++;
    }
    cout<<pow;
    return 0;
}
