/*8. Write a program to print all prime numbers between 1 to n.*/
#include<iostream>
using namespace std;
int main()
{
    int n1,flag;
    cout<<"Enter number: ";
    cin>>n1;
    if (n1==1)
    {
        cout<<n1;
    }
    for (int i = 2; i <= n1 ; i++)
    {
        flag = 1;
        for (int j = 2; j*j <= i; j++)
        {
            if (i % j == 0)
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
        {
            cout<<i<<" ";
        }
    }
    return 0;
}
