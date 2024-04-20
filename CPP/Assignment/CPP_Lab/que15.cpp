#include<iostream>
using namespace std;

/*class employee{
    int empId;
    string name;
    double salary;
    public:

        employee(){
            empId = 1;
            name = "abc";
            salary = 10000;
        }
        employee(int e,string n,double s){
            empId = e;
            name = n;
            salary = s;
        }
        void display(){
            cout<<"Name: "<<name<<" EmpId: "<<empId<<" Salary: "<<salary<<endl;
        }
        void calSalary(){
            cout<<"salary of employee: "<<salary<<endl;
        }
};*/

class employee{
    int empId;
    string name;
    double salary;
    public:
        employee();
        employee(string name,int EmpId,double salary);
        void display();
        void calSalary();
        // void calSalary(int salary);

};

employee::employee(){
    empId = 1;
    name = "abc";
    salary = 10000;
}
employee::employee(string name,int empId,double salary){
            this->empId = empId;
            this->name = name;
            this->salary = salary;
        }
void employee::display(){
            cout<<"Name: "<<name<<" EmpId: "<<this->empId<<" Salary: "<<this->salary<<endl;
        }
void employee::calSalary(){
            cout<<"salary of employee: "<<this->salary<<endl;
        } 
// void employee::calSalary        

// developer class
class developer:public employee{
    private:
        int deptNo,bonus=5000;
    public: 
        developer(){
            deptNo = 1;
            bonus=5000;
        }  
        // developer(int deptNo,int bonus){
        //     this->deptNo = deptNo;
        //     this->bonus = bonus;
        // }  
        // void displayDev(){
        //     cout<<"DeptNo: "<<deptNo<<" Bonus: "<<bonus<<endl;
        // }
        developer(string name, int empId, double salary,int deptNo,int bonus):employee(name,empId,salary){
            // employee e1;
            // cout<<"Bonus :"<<e1.calSalary(this->bonus);
            // below two lines code is same
            // e1.calSalary();
            // salary = salary+e1.calSalary(this->bonus);//40000
            // salary = salary + bonus;//40000
            // cout<<"Name: "<<name<<" EmpId: "<<empId<<" Salary: "<<salary<<" DeptNo: "<<deptNo<<" Salary: "<<salary<<" bonus:"<<bonus<<endl;
            this->deptNo = deptNo;
            this->bonus= bonus;
        }
        void developerTask(){
            cout<<" DeptNo: "<<deptNo<<" Bonus "<<bonus<<endl;
        }
};

// manager class
class manager:public employee{
    private: 
        int deptId,incentives;
    public:
        manager(){
            deptId = 3;
            incentives = 7000;
        }    
       /* manager(int deptId,int incentives){
            this->deptId = deptId;
            this->incentives = incentives;
        }
        void displayMan(){
            cout<<"DeptId: "<<deptId<<" Incentives: "<<incentives<<endl;
        }
        void displayManager(string name,int empId,double salary){
            // employee e2;
            salary = salary + incentives;
            cout<<"Name: "<<name<<" EmpId: "<<empId<<" Salary: "<<salary<<" DeptId: "<<deptId<<" Salary: "<<salary<<" incentives: "<<incentives<<endl;
        }*/

        manager(string name, int empId, double salary,int deptId,int incentives):employee(name,empId,salary){
            this->deptId = deptId;
            this->incentives= incentives;
        }
        void managerTask(){
            cout<<" DeptNo: "<<deptId<<" Bonus "<<incentives<<endl;
        }
};

int main(){
    employee e;
    // cout<<endl<<"-------Degault employee-----"<<endl;
    // e.display();
    // e.calSalary();

    // cout<<endl<<"-------Degault developer-----"<<endl;
    // developer d1;
    // d1.display();
    // d1.calSalary();

    cout<<endl<<"-------parameterized developer-----"<<endl;
    developer d("Kalyani",3,99999.00,20,10000);
    d.display();
    d.developerTask();
    d.calSalary();

    // cout<<endl<<"-------Degault manager-----"<<endl;
    // manager m1;
    // m1.display();
    // m1.managerTask();
    // m1.calSalary();

    cout<<endl<<"-------parameterized manager-----"<<endl;
    manager m("Vaibhav",10,63737.3,5,15000);
    m.display();
    m.calSalary();
    m.managerTask();

}