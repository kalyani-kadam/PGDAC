#include<iostream>
using namespace std;
void sum(int arr[5]);
void grt_fifty(int arr[5]);
void odd(int arr[5]);
void even(int arr[5]);
void primeNo(int arr[5]);
void sort(int arr[5]);
void Asceding_sort(int arr[5]);
void Desceding_sort(int arr[5]);
void reverse(int arr[5]);
void doubleArr(int arr[5]);
void search(int arr[]);
void concat();
int main()
{
    int arr[5],ch;
    cout<<"Enter array elements: ";
    for (int i = 0; i < 5; i++)
    {
        cin>>arr[i];
    }
    do
    {
        cout<<"\n------------\n0.Exit\n1.Sum\n2.Greater than 50\n3.Odd\n4.Even\n5.Prime no\n6.Asc sort\n7.Desc Sort\n8.Reverse\n9.DoubleArr\n10.Search\n11.Concatenation\n-----------\n";
        cout<<"Enter choice: ";
        cin>>ch;
        switch (ch)
        {
        case 1:
            sum(arr);
            break;
        case 2:
            grt_fifty(arr);
            break;
        case 3:
            odd(arr);
            break;   
        case 4:
            even(arr);
            break;
        case 5:
            primeNo(arr);
            break;  
        case 6:
            Asceding_sort(arr);
            break;
        case 7:
            Desceding_sort(arr);
            break; 
        case 8 :
            reverse(arr);
            break; 
        case 9:
            doubleArr(arr);
            break;
        case 10:
            search(arr);
            break;
        case 11:
            /*int arr1[3],arr2[3];
            cout<<"Enter first array for concatenation: ";
            for (int i = 0; i < 3; i++)
            {
                cin>>arr1[i];
            }
            cout<<"Enter second array for concatenation: ";
            for (int i = 0; i < 3; i++)
            {
                cin>>arr2[i];
            }*/
            concat();
            break;                         
        default:
            cout<<"Invalid";
            break;
        }
    } while (ch!=0);

    return 0;
}
void sum(int arr[5]){
    int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            sum += arr[i];
        }
        cout<<"Sum : "<<sum<<endl;
    }
void grt_fifty(int arr[5]){
    for (int i = 0; i < 5; i++)
    {
        if(arr[i]>50){
            cout<<arr[i]<<" ";
        }
    }   
}

void odd(int arr[5]){
    cout<<"odd no:"<<endl;
    for (int i = 0; i < 5; i++)
    {
        if ((arr[i] % 2) != 0)
        {
            cout<<arr[i]<<" ";
        }
        
    }
    
}

void even(int arr[5]){
    cout<<"Even no:"<<endl;
    for (int i = 0; i < 5; i++)
    {
        if ((arr[i] % 2) == 0)
        {
            cout<<arr[i]<<" ";
        }
        
    }
    
}

void primeNo(int arr[5]){
    for (int i = 0; i <= 4; i++)
    {
        // cout<<"outer loop\n";
        int flag = 0;
        for (int j = 2; j<=arr[i]/2; j++)
        {
            // cout<<"inner loop\n";
            if (arr[i] % j  == 0)
            {
               flag = 1;
               break;
            //    cout<<"not prime";
            }            
        }
        if (flag == 0){
            cout<<arr[i]<<" ";
        }
    }
}

// selection sort

void Asceding_sort(int arr[5]){
    int temp;
    for (int i = 0; i < 4; i++)
    {
        for (int j = i+1; j<5; j++)
        {
        
        if (arr[j]<arr[i])
        {
            temp =  arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    }
    cout<<"Sorted array elements: ";
    for ( int i = 0; i < 5; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}

void Desceding_sort(int arr[5]){
    int temp;
    for (int i = 0; i < 4; i++)
    {
        for (int j = i+1; j<5; j++)
        {
        
        if (arr[j]>arr[i])
        {
            temp =  arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    }
    cout<<"Sorted array elements: ";
    for ( int i = 0; i < 5; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}

void reverse(int arr[5]){
    for (int i = 4; i>=0; i--)
    {
        cout<<arr[i]<<" ";
    }  
}

void doubleArr(int arr[5]){
    for (int i = 0; i < 5; i++)
    { 
        arr[i] = arr[i]*2;
        cout<<arr[i]<<" ";
        
    }    
}

void search(int arr[]){
    int target,flag=0;
    cout<<"Enter target: ";
    cin>>target;
    for (int i = 0; i < 5; i++)
    {
        if (arr[i] == target)
        {
            flag =1;
            cout<<"Found target at index"<<i<<endl;
            // break;
        }      
    }
    if(flag==0)
    cout<<"Target not found";
}

void concat(){
    int arr1[3]= {11,22,43};
    int arr2[3]={12,82,10};
    int n = sizeof(arr1)/sizeof(arr1[0]);
    int m = sizeof(arr2)/sizeof(arr2[0]);
    int len = n+m;
    int newArr[len],pos=0,i;
    for (i = 0; i < n; i++)
    {
        newArr[i] = arr1[i];
        pos++;
    }
    pos = i;
    for (i = 0; i < m; i++)
    {
        newArr[pos] = arr2[i];
        pos++;
    }
    cout<<"Concatinated array: ";
    for (int i = 0; i <len; i++)
    {
        // cout<<"ele: ";
        cout<<newArr[i]<<" ";
    }      
}