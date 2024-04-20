/*2. Write a program, which accepts two integers and an operator as a character (+ - * / ), performs the 
corresponding operation and displays the result.*/
#include<iostream>
using namespace std;
int main()
{
    int num1,num2;
    char op;
    cout<<"Enter 2 no's & any one operator(+,-,*,/): ";
    cin>>num1>>num2>>op;
    switch (op)
    {
    case '+':
        cout<<num1+num2;
        break;
    case '-':
        cout<<num1-num2;
        break;
    case '*':
        cout<<num1*num2;
        break;
    case '/':
        if (num2>0){
            cout<<num1/num2;
            break;
        }else{
            cout<<"Num2 < 0";
            break;
        }        
    default:
    cout<<"Invalid";
        break;
    }
    return 0;
}