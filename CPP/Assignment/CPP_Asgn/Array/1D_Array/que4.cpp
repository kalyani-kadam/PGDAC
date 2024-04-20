/*4. Write a program to accept n numbers from the user and store them in an array. Then sort the array in descending order and display it.*/

#include<iostream>
using namespace std;
int main()
{
    // int arr[n];
    int n,t=0;
    cout<<"Enter number: ";
    cin>>n;
    int arr[n];
    cout<<"Enter "<<n<<" array elements: ";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = i+1; j < n; j++)
        {
            if (arr[i] < arr[j])
            {
                t  = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
            
        }       
    }
    cout<<"Array elements in desceding order:";
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0; 
}