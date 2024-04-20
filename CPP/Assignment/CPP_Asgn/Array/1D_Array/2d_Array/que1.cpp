/*1. Write a program to accept, display and print the sum of elements of each row and sum of elements of 
each column of a matrix.*/

#include<iostream>
using namespace std;
int main()
{
    int i=0,j=0,r,c;
    cout<<"Enter no. of row & column: ";
    cin>>r>>c;
    int arr[r][c];
    // int arr[2][2]={{1,5},{5,8}};
    cout<<"Enter array elements: ";
    for ( i = 0; i < r; i++)
    {
        for ( j = 0; j < c; j++)
        {
            cin>>arr[i][j];
        }  
    }
    cout<<"Array elements are: "<<endl;
    for ( i = 0; i < r; i++)
    {
        for ( j = 0; j < c; j++)
        {
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;  
    }
    cout<<endl<<"Row sum...."<<endl;
    for ( i = 0; i < r; i++)
    {
        int rsum = 0;
        for ( j = 0; j < c; j++)
        {
            rsum = rsum + arr[i][j];
        }
        cout<<"Sum of Row "<<i<<": "<<rsum<<""<<endl<<"";
    }
    cout<<endl<<"Column sum...."<<endl;
    for ( i = 0; i < r; i++)
    {
        int csum = 0;
        for ( j = 0; j < c; j++)
        {
            csum = csum + arr[j][i];
        }
        cout<<"Sum of column "<<i<<": "<<csum<<"\n";
    }
    return 0;
}
