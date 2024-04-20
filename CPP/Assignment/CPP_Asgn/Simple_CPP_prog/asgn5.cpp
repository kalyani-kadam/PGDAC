/*5. Accept two numbers and swap two numbers using 
i) Third variable
ii) By performing arithmetic operations.*/
#include<iostream>
using namespace std;
int main(){
    int num1,num2;
    cout<<"Enter 2 no.";
    cin>>num1>>num2;
    // using third variable
    int temp = num1;
    num1 = num2;
    num2 = temp;
    cout<<"Num1 & num2: "<<num1<<" "<<num2;
    // using arithmetic operators
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
    cout<<"\nNum1 & num2: "<<num1<<" "<<num2;
    return 0;
}