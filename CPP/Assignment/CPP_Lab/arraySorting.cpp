#include<iostream>
using namespace std;

int* Asceding_sort(int arr[],int size){
    int temp;
    for (int i = 0; i < size; i++)
    {
        for (int j = i+1; j<size; j++)
        {
        
            if (arr[i]>arr[j])
            {
                temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
    // cout<<"Sorted array elements: ";
    // for ( int i = 0; i < 5; i++)
    // {
    //     cout<<arr[i]<<" ";
    // }
    
}

int* Desceding_sort(int arr[],int size){
    int temp;
    for (int i = 0; i < size; i++)
    {
        for (int j = i+1; j<size; j++)
        {
        
            if (arr[i]<arr[j])
            {
                temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
    // cout<<"Sorted array elements: ";
    // for ( int i = 0; i < 5; i++)
    // {
    //     cout<<arr[i]<<" ";
    // }
    
}

int main()
{
    int size;
    cout<<"enter array size: ";
    cin>>size;
    //int arr[size];
    int* ptr = new int(size);
    // int* ptr1 = new int(size);
    int *asc;
    int *desc;
    cout<<"enter array elements: ";
    for (int i = 0; i < size; i++)
    {
        cin>>ptr[i];
    }
    asc = Asceding_sort(ptr,size);

    cout<<"\nAsceding sort: ";
    for (int i = 0; i < size; i++)
    {
        cout<<asc[i]<<endl;
    }
    
    desc = Desceding_sort(ptr,size);
    cout<<"\nDesceding sort: ";
    for (int i = 0; i < size; i++)
    {
        cout<<desc[i]<<endl;
    }
    // cout<<asc<<endl;
    // cout<<desc<<endl;
    return 0;
}