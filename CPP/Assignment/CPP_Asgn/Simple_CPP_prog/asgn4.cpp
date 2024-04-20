/*.4. Accept the basic salary of an employee and compute the net salary after adding earnings and subtracting 
deductions.
 PF is 2 % of basic
 Tax is 3 % of basic
 HRA is 5 % basic
 DA is 8 % of basic*/
#include<iostream>
using namespace std;
int main(){
    float basic_salary;
    cout<<"Enter salary:";
    cin>>basic_salary;
    float net_salary,pf,tax,da,hra;
    pf = (2*basic_salary)/100;
    tax = (3*basic_salary)/100;
    hra = (5*basic_salary)/100;
    da = (8*basic_salary)/100;
    net_salary = pf+tax+da+hra+basic_salary;
    cout<<"Salary: "<<net_salary<<"";
    return 0;
}