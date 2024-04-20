/* 5. Write a program to calculate factors of a given number.*/

#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter number:";
    cin>>n;
    for (int i = 1; i <= n/2; i++)
    {
        if (n%i == 0)
        {
            cout<<i<<" ";
        }
    }
    return 0;
}
