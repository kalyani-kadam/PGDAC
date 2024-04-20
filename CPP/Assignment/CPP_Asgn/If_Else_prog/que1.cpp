/*1. Write a program to accept an integer and check if it is even or odd.*/
#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter number:";
    cin>>num;
    if(num % 2 == 0){
        cout<<"Even no.";
    }else{
        cout<<"Odd no.";
    }
    return 0;
}
