/*Animal Hierarchy:
Problem Statement: Create a hierarchy of animal classes. Start with a base class Animal and
 then create derived classes like Mammal, Bird, and Fish. Each of these derived classes 
 should have specific properties and methods related to their respective categories of
  animals.*/
#include<iostream>
using namespace std;

class animal{
	private:
		bool isBreath;
		string action;
		int age;
	public:
		animal();
		animal(bool isBreath,string action,int age);
		void display();	
};