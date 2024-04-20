#include<iostream>
using namespace std;
int main()
{
    int n = 1296,rev = n,rem ,sum=0;
    while (n>0)
    {
        rem = n % 10;
        sum = sum*10 + rem;
        n = n/10;
    }
    cout<<"Reverse: "<<sum;    
    return 0;
}
