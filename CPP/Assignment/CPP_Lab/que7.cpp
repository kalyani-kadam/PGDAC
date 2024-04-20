#include<iostream>
using namespace std;
int main()
{
    int r,c,r1,c1;
    cout<<"enter row & column for first array: ";
    cin>>r>>c;
    int arr[r][c];
    // cout<<endl<<"enter row & column for second array: ";
    // cin>>r>>c;
    int arr2[r][c];
    // if (c==r)
    // {
        
        cout<<endl<<"enter first array elements: ";
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                cin>>arr[i][j];
            }            
        }

        cout<<endl<<"enter second array elements: ";
        for (int i = 0; i <r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                cin>>arr2[i][j];
            }       
        }
        int mul[r][c];
        cout<<"Multiplication af arrays: "<<endl;
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                mul[i][j] = 0;
                for (int k = 0; k<c; k++)
                {
                    mul[i][j] += arr[i][k] * arr2[k][j];
                }
            }
            // cout<<endl;
        }

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                cout<<mul[i][j]<<" ";
            }
            cout<<endl;
        }
        
    // }else{
    //     cout<<"Enter valid row & column!";
    // }
    return 0;
}
