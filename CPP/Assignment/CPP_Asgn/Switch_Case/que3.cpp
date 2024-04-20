/*3. Accept two numbers in variables x and y from the user and perform the following operations 
Options Actions 
    1. Equality Check if x is equal to y
    2. Less Than Check if x is less than y
    3. Quotient and Remainder Divide x by y and display the quotient and 
    remainder 
    4. Range : Accept a number and check if it lies between x and y (both 
    inclusive)
    5. Swap : Interchange x and y*/
#include<iostream>
using namespace std;
int main()
{
    int x,y,ch;
    cout<<"1. Equality Check if x is equal to y\n2. Less Than Check if x is less than y\n3. Quotient and Remainder Divide x by y and display the quotient and remainder\n4. Range : Accept a number and check if it lies between x and y (both inclusive)\n5. Swap : Interchange x and y\n";
    cout<<"Enter choice: ";
    cin>>ch;
    switch (ch)
    {
    case 1:
        cout<<"Enter 2 no's: ";
        cin>>x>>y;
        if(x==y)
            cout<<"Numbers are equal";
        break;
    case 2:
        cout<<"Enter 2 no's: ";
        cin>>x>>y;
        if (x<y)
        {
            cout<<"x is less than y";
        }   
        break; 
    case 3:
        cout<<"Enter 2 no's: ";
        cin>>x>>y;
        if (1)
        {
            int m=x%y;
            cout<<"Remainder: "<<m;
        }
        if (1)
        {
            int q=x/y;
            cout<<"\nQuotient: "<<q;
        }
        break;
    case 4:
        cout<<"Enter 2 no's: ";
        cin>>x>>y;
        int n;
        cout<<"Enter no: ";
        cin>>n;
        if (x<n && n<y)
        {
            cout<<"Lies betwwen x and y";
        }
        else if(y<n && n<x)
        {
            cout<<"Lies betwwen x and y";
        }
        else{
            cout<<"Not lies in  x & y";
        }
        break;
    case 5:
        cout<<"Enter 2 no's: ";
        cin>>x>>y;
        int temp=x;
        x=y;
        y=temp;
        cout<<"Swapped no's: "<<x<<" "<<y;
        break;
    // default:
    //     cout<<"Enter valid choice";
    //     break;
    }
    return 0;
}