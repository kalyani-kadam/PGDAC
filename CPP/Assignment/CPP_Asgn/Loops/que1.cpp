/*1. Write a program that accepts numbers continuously as long as the number is positive and prints the 
sum of the given numbers.*/

#include<iostream>
using namespace std;
int main()
{
    int num,sum=0;
    for (int i = 0; num>0; i++)
    {
        cout<<"Enter no: ";
        cin>>num;
        sum = sum+num;
    }
    cout<<sum;
    return 0;
}
