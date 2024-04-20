/*2. Write a program to accept an array of n elements and a number say key. Check whether key is present 
in the array or not.*/

#include<iostream>
using namespace std;
int main()
{
    // int arr[n];
    int n,key,flag=0;
    cout<<"Enter number and key element: ";
    cin>>n>>key;
    int arr[n];
    cout<<"Enter array "<<n<<" elements: ";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    for (int i = 0; i < n ; i++)
    {
        if (arr[i] == key)
        {
            flag = 1;
            cout<<"Key is present";
        } 
    }
    if (flag == 0)
    {
        cout<<"Key is not present"; 
    }    
    return 0; 
}