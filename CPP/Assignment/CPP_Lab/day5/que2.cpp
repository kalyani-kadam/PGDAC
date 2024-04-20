#include<iostream>
using namespace std;
class bankAccount{
    int accNo;
    string name;
    double balance;

    public:
        bankAccount(){
            accNo = 0;
            name = "no name";
            balance = balance;
        }
        bankAccount(int no,string nam,double bal){
            accNo = no;
            name = nam;
            balance = bal;
        }
        void withdraw(double amount){
            balance = balance - amount;
        }
        void deposit(double amount){
            balance = balance + amount;
        }
        void display(){
            cout<<" Balance :"<<balance<<endl;
        }
};
class account:public bankAccount{
    int amt;
    public:
    account(int n,string naam,double bal,double amt):bankAccount(n,naam,bal){
            this->amt= amt;
    }
};
int main()
{
    // bankAccount bac;
    // bac.withdraw(1000);
    // bac.display();
    // account b(101,"Kalyani",10000,2000);
    account b(10,"KKM",20000,1000);
    b.deposit(1000);
    b.display();
    b.withdraw(1000);
    b.display();
    return 0;
}