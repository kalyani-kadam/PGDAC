/*1:Write a program to create an array of integers and perform following operations on that array like 
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
array from user. */
#include<iostream>
using namespace std;
void sum(int *arr);
void avg(int *arr);
void max(int *arr);
void min(int *arr);
int main()
{
    int arr[5];
    cout<<"enter array elements: "<<endl;
    for (int i = 0; i < 5; i++)
    {
        cin>>arr[i];
    }
    sum(arr);
    avg(arr);
    max(arr);
    min(arr);
    return 0;
}
void sum(int *arr){
    int sum =0;
    for (int i = 0; i < 5; i++)
    {
        sum = sum + arr[i];
    }
    cout<<"sum : "<<sum<<endl;
}

void avg(int *arr){
    int sum =0;
    for (int i = 0; i < 5; i++)
    {
        sum = sum + arr[i];
    }
    // cout<<"sum : "<<sum;
    double avg = sum /5;
    cout<<"Average : "<<avg<<endl;
}

void max(int *arr){
    int max=0;
    for (int i = 0; i < 5; i++)
    {
        if (arr[i]>max)
        {
            max = arr[i];
        }
        
    }
    cout<<"Max: "<<max<<endl;
}
void min(int *arr){
    int min=arr[0];
    for (int i = 0; i < 5; i++)
    {
        if (arr[i]<min)
        {
            min = arr[i];
        }
        
    }
    cout<<"Min: "<<min<<endl;
}