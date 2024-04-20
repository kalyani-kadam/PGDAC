/*5. Write a C program to input angles of a triangle and check whether triangle is valid or not.*/
#include<iostream>
using namespace std;
int main(){
    int a,b,c;
    cout<<"Enter sides of triangle";
    cin>>a>>b>>c;
    // int sum = a+b+c;
    if (a+b+c<=180)
    {
        cout<<"Valid trianle";
    }else{
        cout<<"Invalid triangle";
    }
    return 0;
}