/*5. Write a program to accept a decimal number and convert it to binary.*/

#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter number: ";
    cin>>n;
    int arr[32];
    int i= 0;
    while (n>0)
    {
        arr[i] = n%2;
        n = n/2;
        i++;
    }
    for (int j = i-1; j >= 0; j--)
    {
        cout<<arr[j];
    }
    
    return 0; 
}