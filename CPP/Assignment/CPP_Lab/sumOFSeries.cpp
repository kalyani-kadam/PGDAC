#include<iostream>
using namespace std;
int main()
{
    int sum =0,n;
    cout<<"Enter no: ";
    cin>>n;
    for (int i = 1; i <= n; i++)
    {
        sum = sum + i;
    }
    cout<<sum;
    return 0;
}
