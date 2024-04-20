/*Employee Payroll System with Abstract Classes:
Problem Statement: Design an employee payroll system. Create an abstract class Employee with attributes like name and employee ID. Derive concrete classes like HourlyEmployee and SalariedEmployee. Define abstract methods for calculating pay in the base class and implement them in the derived classes.*/

#include<iostream>
using namespace std;
class emp{
    int empId;
    string name;
    public:
        emp(int id,string n){
            empId = id;
            name = n;
        }
        virtual void calcPay()=0;
        void display(){
            cout<<"Emp id : "<<empId<<" Name: "<<name<<endl;
        }
};
class hourlyEmp : public emp{
    int rate,hrworked;
    public:
        hourlyEmp(int id,string name,int rate,int hrworked):emp(id,name){
            this->rate = rate;
            this->hrworked = hrworked;
        }
        void calcPay(){
            cout<<"Hourly employee : "<<rate*hrworked<<endl;
        }
};

class salariedEmp: public emp{
    int salary;
    public:
        salariedEmp(int id,string name,int salary):emp(id,name){
            this->salary = salary;
        }
        void calcPay(){
            cout<<"Salary: "<<salary<<endl;
        }
};
int main()
{
    cout<<"\n=====Hourly employee======\n";
    hourlyEmp he(12,"Kalyani",10,10);
    he.display();
    he.calcPay();
    cout<<"\n=====salaried Employee=====\n";
    salariedEmp se(101,"Maya",100000);
    se.display();
    se.calcPay();
    return 0;
}
