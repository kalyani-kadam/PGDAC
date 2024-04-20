/*6. Write a C program to check whether a entered character is uppercase or lowercase alphabet.*/
#include<iostream>
using namespace std;
int main(){
    char ch;
    cout<<"Enter char:";
    cin>>ch;
    if (ch>=65 && ch<=90)
    {
        cout<<"Uppercase";
    }else{
        cout<<"Lowercase";
    }
    return 0;
}