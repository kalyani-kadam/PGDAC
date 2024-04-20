/*3. Write a program to accept an integer array and an integer say num and counts the occurrences of the 
num in the array.*/

#include<iostream>
using namespace std;
int main()
{
    // int arr[n];
    int n,num,count=0;
    cout<<"Enter number and num: ";
    cin>>n>>num;
    int arr[n];
    cout<<"Enter array "<<n<<" elements: ";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    for (int i = 0; i < n ; i++)
    {
        if (arr[i] == num)
        {
            count++;
        } 
    }
    cout<<"Count: "<<count<<"";    
    return 0; 
}