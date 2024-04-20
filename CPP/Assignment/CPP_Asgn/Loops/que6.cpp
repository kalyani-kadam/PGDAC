/* 6. Accept two numbers and calculate GCD of them.*/

#include<iostream>
using namespace std;
int main()
{
    int n1,n2,max;
    cout<<"Enter 2 number's:";
    cin>>n1>>n2;
    for (int i = 1; i<=n2; i++)
    {
        if (n1 % i == 0 && n2 % i == 0)
        {
            max=i;
        }
    }
    cout<<max;
    return 0;
}
