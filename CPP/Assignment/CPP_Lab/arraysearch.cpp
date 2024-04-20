#include<iostream>
using namespace std;

int main()
{
    int arr[5],target,flag=0;
    cout<<"enter array elements: "<<endl;
    for (int i = 0; i < 5; i++)
    {
        cin>>arr[i];
    }
    cout<<"array elements are: "<<endl;
    for (int i = 0; i < 5; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<"\nenter array element to search: "<<endl;
    cin>>target;
    for (int i = 0; i < 5; i++)
    {
        if (target == arr[i])
        {
           flag = 1;
        }
    }
    if(flag == 1)
        cout<<"target is found\n";
    else
        cout<<"target not found\n";
    return 0;
}