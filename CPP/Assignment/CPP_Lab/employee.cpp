#include<iostream>
using namespace std;

class employee{
    int empId;
    string name;
    protected: double salary;
    public:
    employee(int id,string n,double s){
        empId = id;
        name = n;
        salary = s;
    }
        void calSalary(){
            cout<<"Salary: "<<salary<<endl;
        }
};

class developer:public employee{
    int deptNo;
    public:
        developer(int empId,string name,double salary,int deptNo):employee(empId,name,salary){
            this->deptNo = deptNo;
        }
        void developerTask(){
            cout<<"Developer specific task"<<endl;
        }
        // void calSalary(){
        //     employee ::calSalary();
        // }
};
class manager:public employee{
    int incentives;
    public:
        manager(int empId,string name,double salary,int incentives):employee(empId,name,salary){
            this->incentives = incentives;
        }
        void managerTask(){
            cout<<endl<<"Manager specific task"<<endl;
        }
        void calSalary(){
            // employee::calSalary();
            cout<<"Salary of manager: "<<this->salary+this->incentives;
        }
};
int main()
{
    // employee e(101,"Kalyani Kadam",100000);
    // e.calSalary();
    cout<<"_________Developer__________"<<endl;
    developer d(102,"Kadam Hari",90000,4);
    d.calSalary();
    d.developerTask();
    cout<<"_________Manager___________"<<endl;
    manager m(10,"Patil Sam",50000,10000);
    m.calSalary();
    m.managerTask();
    return 0;
}
