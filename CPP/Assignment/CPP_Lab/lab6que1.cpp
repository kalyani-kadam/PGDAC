#include<iostream>
using namespace std;

class employee{
    private: int id,DeptId;string name;
    protected: double basicSalary;
    public:
        employee(){
            id = 0;
            name ="no name";
            DeptId = 0;
            basicSalary = 15000;
        }
        employee(int employeeId,int deptId,string name,double basicSalary){
            this->id = employeeId;
            this->name = name;
            this->DeptId = deptId;
            this->basicSalary = basicSalary;
        }
        virtual void computeNetSalary(){
            cout<<" Net salary of employee: "<<basicSalary<<endl;
            // return 0;
        }
        virtual void display(){
            cout<<" Id : "<<id<<" Name : "<<name<<" DeptId : "<<DeptId;
        }
        void setId(int id){
            this->id = id;
        }
        void setName(string name){
            this->name = name;
        }
        void setDeptId(int deptId){
            this->DeptId = deptId;
        }
        void setSalary(double salary){
            this->basicSalary = salary;
        }
        int getId(){
            return this->id;
        }
        int getdeptId(){
            return this->DeptId;
        }
        string getName(){
            return this->name;
        }
        double getSalary(){
            return this->basicSalary;
        }
};

class manager : public employee{
    double perfBonus;

    public: 
        manager(){
            perfBonus = 0;
        }
        manager(int id,int deptId,string name,double perfBonus,double basicSalary):employee(id,deptId,name,basicSalary){
            this->perfBonus = perfBonus;
        }
        void computeNetSalary(){
            // employee::computeNetSalary();
            double netSalary = basicSalary+perfBonus;
            cout<<" Net salary of manager: "<<netSalary;
            // return 0;
        }
        void display(){
            // cout<<" perfBonus : "<<perfBonus<<endl;
            employee::display();
            cout<<" perfBonus : "<<perfBonus<<endl;
        }
        void setPerfBonus(double perfBonus){
            this->perfBonus = perfBonus;
        }
        double getPerfBonus(){
            return this->perfBonus;
        }
};

class worker:public employee{
    int hoursWorked, hourlyRate;

    public:
    worker(){
        hourlyRate = 0;
        hoursWorked = 0;
    }
     worker(int id,int deptId,string name,double basicSalary,int hourlyRate,int hoursWorked):employee(id,deptId,name,basicSalary){
        this->hourlyRate = hourlyRate;
        this->hoursWorked = hoursWorked;
    }
    void setHourlyRate(int hourlyRate){
        this->hourlyRate = hourlyRate;
    }
    int getHourlyRate(){
        return this->hourlyRate;
    }

    void computeNetSalary(){
        double netSalary = basicSalary+(hoursWorked*hourlyRate);
        cout<<" Net salary of worker : "<<basicSalary+hoursWorked*hourlyRate<<endl;
        // cout<<" Net salary of worker : "<<netSalary<<endl;
        // return 0;
    }

    void display(){
        employee::display();
        cout<<" Hourly rate of worker: "<<this->hourlyRate<<" worked hours: "<<this->hoursWorked<<endl;
    }
    void setHoursWorked(int hourlyRate){
        this->hoursWorked = hoursWorked; 
    }
    int getHoursWorked(){
        return this->hoursWorked;
    }
};

int main(){
    // employee e;
    // e.computeNetSalary();
    manager m;
    // m.computeNetSalary();

    // cout<<"\n--------manager-----"<<endl;
    // manager m1(101,2,"Kalyani",10000,25000);
    // m1.display();
    // m1.computeNetSalary();

    // cout<<"\n--------worker-----"<<endl;
    worker w;
    // w.display();
    // w.computeNetSalary();

    // worker w1(5,"Kalyani",3,4,13,50000);
    // w1.display();
    // w1.computeNetSalary();
    // w1.getHourlyRateOfWorker(12);

    employee *emp[2];
    emp[1] =  &m;
    emp[2] = &w;
    // emp[3] = &w;
    int id,DeptId,hourlyRate,hoursWorked;
    string name;
    double basicSalary;
    double perfBonus;

    int ch,count;;
    do
    {   
        cout<<"\n1.Hire manager\n2.Hire worker\n3.Display information of all employees net salary\n4.Exit\n";
        cout<<endl<<"Enter choice: ";
        cin>>ch;
    
        // for(int i=1;i<5;i++)
        // {

            switch(ch){
            case 1:{
                // int count;
                cout<<"How many manager details do you want to add: ";
                cin>>count;
                for (int i = 0; i < count; i++)
                {
                    cout<<"Enter manager details: id>>DeptId>>name>>perfBonus>>basicSalary: "<<endl;
                    cin>>id>>DeptId>>name>>perfBonus>>basicSalary;
                }
                
                manager mgr(id,DeptId,name,perfBonus,basicSalary);
                for (int i = 0; i < count; i++)
                {
                    emp[i] = &mgr;
                    emp[i]->display();
                    emp[i]->computeNetSalary();
                    cout<<endl;
                }
                cout<<"\n-------------------\n"<<endl;
                break;
            }
            case 2:
                {
                cout<<"How many worker details do you want to add: id>>DeptId>>name>>basicSalary>>hourlyRate>>hoursWorked: ";
                cin>>count;
                for (int i = 0; i < count; i++)
                {
                    cout<<"Enter worker details: "<<endl;
                    cin>>id>>DeptId>>name>>basicSalary>>hourlyRate>>hoursWorked;
                }
                worker wkr(id,DeptId,name,basicSalary,hourlyRate,hoursWorked);
                // worker wkr(id,name,DeptId,hourlyRate,hoursWorked,basicSalary);
                for (int i = 0; i < count; i++)
                {
                    emp[i] = &wkr;
                    emp[i]->display();
                    emp[i]->computeNetSalary();
                } 
                cout<<"\n-------------------\n"<<endl;
                break;
                }
            case 3:
                {
                    cout<<" enter salary manager: ";
                    cin>>basicSalary;
                    manager m(id,DeptId,name,perfBonus,basicSalary);
                    emp[1]=&m;
                    cout<<" enter salary worker: ";
                    cin>>basicSalary;
                    worker w(id,DeptId,name,basicSalary,hourlyRate,hoursWorked);
                    emp[2]=&w;
                    for (int i = 1; i < 3; i++)
                    {
                        // emp[i] = &wkr;
                    // emp[i]->display();
                    // emp[i]->computeNetSalary();
                    emp[i]->computeNetSalary();
                    }
                   break;
                }
            case 4:
                exit(0);
                break;           
            default:
                cout<<"Invalid";
                break;    
        }
        // }

    } while (ch!=4);

}