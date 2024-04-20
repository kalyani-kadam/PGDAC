/* 3. Write a program to accept a character, an integer n and display the next n characters.*/

#include<iostream>
using namespace std;
int main()
{
    int n,i=0;char ch;
    cout<<"Enter character & number:";
    cin>>ch>>n;
    while(i!=n){
        cout<<ch<<" ";
        ch++;i++;
    }
    return 0;
}
