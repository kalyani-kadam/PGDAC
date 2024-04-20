#include<iostream>
using namespace std;
class bankAccount{
    int accNo;
    protected: double balance;
    public:
        bankAccount(int accNo,double balance){
            this->accNo = accNo;
            this->balance = balance;
        }
        void display(){
            cout<<"Account no: "<<accNo<<" Balance: "<<balance<<endl;
        }
};

class savingAccount:public bankAccount{
    int interest,rate,time;
    public:
        savingAccount(int accNo,double balance,int rate,int time):bankAccount(accNo,balance){
            this->rate = rate;
            this->time = time;
        }
        void calInterest(){
            // cout<<"Enter rate of interest & time period: ";
            // cin>>rate>>time;
            interest = (balance*rate*time)/100;
            cout<<"Interest "<<interest<<endl;
        }
        void withdraw(int amt){
            balance = balance - amt;
            // cout<<"Balance: "<<balance<<endl;
        }
        void display(){
            bankAccount::display();
            cout<<"Interest "<<interest<<endl;
            cout<<"Balance: "<<balance<<endl;
        }
};

class checkingAccount:public bankAccount{
    int interest,rate,time;
    public:
        checkingAccount(int accNo,double balance,int rate,int time):bankAccount(accNo,balance){
            this->rate = rate;
            this->time = time;
        }
        void calInterest(){
            // cout<<"Enter rate of interest & time period: ";
            // cin>>rate>>time;
            interest = (balance*rate*time)/100;
            cout<<"Interest "<<interest<<endl;
        }
        void withdraw(int amt){
            balance = balance - amt;
            // cout<<"Balance: "<<balance<<endl;
        }
        void display(){
            bankAccount::display();
            cout<<"Interest "<<interest<<endl;
            cout<<"Balance: "<<balance<<endl;
        }
};

int main()
{
    cout<<"___________Saving account________"<<endl;
    savingAccount sa(1010,8000,2,4);
    // sa.display();
    sa.calInterest();
    sa.withdraw(1000);
    sa.display();

    cout<<"___________Checking account________"<<endl;
    checkingAccount ca(1902,28900,2.4,4);
    ca.calInterest();
    ca.withdraw(1000);
    ca.display();
    return 0;
}
