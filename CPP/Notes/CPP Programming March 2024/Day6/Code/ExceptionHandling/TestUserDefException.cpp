#include<iostream>
using namespace std;
namespace Bank{
	class BankException{
 	public: string message;
 	        BankException(string msg){
 	        this->message=msg;	
			 }
 };
	class Account{
		private :int actid;
		         string name;
		         double balance;
		         
		public:Account(int actid,string name,double balance){
			this->actid=actid;
			this->name=name;
			this->balance=balance;
		}
		
		void withdraw(double amount)
		{
			if(balance<amount)
			throw  new  BankException("Low Balance ");
			this->balance=this->balance-amount;
			cout<<"After Withdraw Balance="<<balance<<endl;
		}
		
		
		
		
	};

 
}

int main(){
typedef	Bank::Account Account;
typedef Bank::BankException BankException;
	try{
 
	Account act1(101,"Ram",10000);
	
	act1.withdraw(2000);
	cout<<"After Withdraw  save data into db----"<<endl;
	cout<<"---------Main Ends-------"<<endl;
	
}
catch(int i)
{
	cout<<"Exp 1"<<endl;
}
	catch(const char *ch)
	{
		cout<<"Exp:2"<<endl;
	}
	catch(BankException *obj){
		cout<<"Bank Exception "<<obj->message<<endl;
	}
	catch(...)
	{
	cout<<"Other Type Of Exception"<<endl;	
	}
	
	
	
	
	
	
	
}
