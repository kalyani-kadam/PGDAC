/*7. Write a C program to accept a character and invert the case of it.*/
#include<iostream>
using namespace std;
int main(){
    char ch;
    cout<<"Enter char:";
    cin>>ch;
    if (ch>=65 && ch<=90)
    {
        ch=ch+32;
        cout<<ch;
    }else if(ch>=97 && ch<=122){
        ch = ch-32;
        cout<<ch;
    }
    return 0;
}