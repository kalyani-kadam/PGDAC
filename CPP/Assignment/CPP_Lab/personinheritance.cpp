/*Person and Student Inheritance:
Problem Statement: Model a system for handling individuals and students within an educational institution. Create a base
 class Person with attributes like name and age. Derive a Student class with additional attributes like student ID and GPA, 
 inheriting the common attributes from the Person class.*/

#include<iostream>
using namespace std;
class person{
	int age;
	string name;
	public: 
		virtual void display(){
			cout<<" Name : "<<name<<" Age: "<<age<<endl;
		}
		person(int a,string n){
			age = a;
			name = n;
		}
		
};
class student:public person{
	int studId;
	double gpa;
	public:
		student(int a,string n,int id,double gpa):person(a,n){
			studId = id;
			this->gpa = gpa;
		}
		void display(){
			person::display();
			cout<<" Stud id : "<<studId<<" GPA :"<<gpa<<endl;
		}	
		
};

int main(){
//	person p(1,"Kalyani");
//	p.display();

	 student s(1,"Kalyani",101,8.65);
	 s.display();
}