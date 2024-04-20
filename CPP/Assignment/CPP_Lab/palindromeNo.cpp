#include<iostream>
using namespace std;
int main()
{
    int n = 121,rev = n,rem ,sum=0;
    while (n>0)
    {
        rem = n % 10;
        sum = sum*10 + rem;
        n = n/10;
    }
    // cout<<sum;
    if (sum == rev)
    {
       cout<<"palindrome no";
    }
    else{
        cout<<"not palindrome no";
    }
    return 0;
}
