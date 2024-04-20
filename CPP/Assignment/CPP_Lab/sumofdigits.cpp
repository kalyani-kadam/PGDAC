#include<iostream>
using namespace std;
int main()
{
    int num,sum=0,rem;
    cout<<"enter number: ";
    cin>>num;
    while(num>0){
        rem = num % 10;
        sum = sum + rem;
        num /=10;
    }
    cout<<"sum of digits : "<<sum;
    return 0;
}
