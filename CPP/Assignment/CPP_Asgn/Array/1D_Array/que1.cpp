/*1. Write a program to accept n numbers in an array and display the largest and smallest number. Using 
these values, calculate the range of elements in the array.*/

#include<iostream>
using namespace std;
int main()
{
    // int arr[n];
    int n;
    cout<<"Enter numbers: ";
    cin>>n;
    int arr[n];
    cout<<"Enter array "<<n<<" elements: ";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    int max =arr[0],min = arr[0];
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    cout<<"Max: "<<max<<""<<endl<<"";
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < min)
        {
            min = arr[i];
        }
    }
    cout<<"Min: "<<min<<""<<endl<<"";
    return 0; 
}