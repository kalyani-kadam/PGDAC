/*3. Write a program, which accepts annual basic salary of an employee and calculates and displays the 
Income tax as per the following rules. 
Basic: < 1, 50,000 Tax = 0
 1, 50,000 to 3,00,000 Tax = 20% */
#include<iostream>
using namespace std;
int main(){
    int salary;
    cout<<"Enter basic salary: ";
    cin>>salary;
    if(salary<150000){
        float tax = 0;
        // salary = salary ;
        cout<<"Income tax: "<<tax<<"";
    }else if(salary >=150000 && salary<=300000){
        // tax = 20/100;
        float tax = salary*(0.2);
        cout<<"Income tax: "<<tax<<"";
    }else{
        float tax = salary*(0.3);
        cout<<"Income tax: "<<tax<<"";
    }
    return 0;
}