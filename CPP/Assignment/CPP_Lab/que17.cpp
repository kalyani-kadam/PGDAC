#include<iostream>
using namespace std;

class employee{
    int empid;
    double basicSalary,PT=200,grossSaalary,netSalary,medical=1000,HRA,PF;
    string name;

    public:
        employee(){
            empid = 0;
            name="no name";
            basicSalary= 0;
        }

        employee(int e,string n,double b){
            empid = e; 
            name = n;
            basicSalary=b;
            HRA = (50*basicSalary)/100;
            PF = (12*basicSalary)/100;
        }
        void calc(){
            // HRA = (50*basicSalary)/100;
            // PF = (12*basicSalary)/100;
            grossSaalary = basicSalary + HRA + medical;
            netSalary = grossSaalary - PT + PF;
        }
        void display(){
            cout<<"id "<<empid<<" name "<<name<<" salary "<<basicSalary<<" gross salary "<<grossSaalary<<" net salary "<<netSalary<<" hra "<<HRA<<" PF "<<PF<<" PT "<<PT<<" Medical "<<medical<<endl;
        }
};
int main(){
    employee e;
    e.calc();
    e.display();
    employee e1(101,"Hari",100000);
    e1.calc();
    e1.display();
}