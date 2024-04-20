
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter no :";
    cin>>n;
    int temp = n,rem ,sum=0;
    while (n>0)
    {
        rem = n % 10;
        sum = sum + (rem*rem*rem);
        n = n/10;
    }
    // cout<<sum;
    if (sum == temp)
    {
        cout<<"ArmStrong no";
    }
    else{
        cout<<"Not armstrong no";
    }
    return 0;
}
