#include<iostream>
using namespace std;


class animal{
	private:
		bool isBreath;
		string action;
		int age;
	public:
		animal(){
	this->isBreath = 0;
	action = "Eating"; 	
	age = 1;	
}
    animal(bool isBreath,string action,int age){
	this->isBreath = isBreath;
	this->action = action;
	this->age = age;
}
void display(){
	cout<<"IsBreath: "<<isBreath<<" Action: "<<action<<" Age: "<<age<<endl;
}	
};

class mamal:public animal{
	string HairClr,colour;
	public:
		mamal(){
			cout<<"------default mamal---------\n";
			this->colour =" black";
			this->HairClr = "black";
		}
		mamal(bool isBreath,string action,int age,string HairClr,string colour):animal(isBreath, action, age){
			cout<<"-----parametarized mamal---------\n";
			this->colour = colour;
			this->HairClr = HairClr;
		}
		void displayMamal(){
			cout<<"Hair colour "<<HairClr<<" colour "<<colour<<endl;
		}
};

class bird:public animal{
	string HairClr,colour;
	public:
		bird(){
			cout<<"------default bird---------\n";
			this->colour = "white";
			this->HairClr = "white";
		}
		bird(bool isBreath,string action,int age,string HairClr,string colour):animal(isBreath, action, age){
			cout<<"-----parametarized bird---------\n";
			this->colour = colour;
			this->HairClr = HairClr;
		}
		void displaybird(){
			cout<<"Hair colour "<<HairClr<<" colour "<<colour<<endl;
		}
};

class fish:public animal{
	string colour;
	public:
		fish(){
			cout<<"------default fish---------\n";
			this->colour = "golden";
		}
		fish(bool isBreath,string action,int age,string colour):animal(isBreath, action, age){
			cout<<"-----parametarized fish---------\n";
			this->colour = colour;
		}
		void displayfish(){
			cout<<" colour "<<colour<<endl;
		}
};
int main(){
//	animal obj;
//	obj.display();
//	animal obj1(true,"walk",10);
//	obj1.display();
	cout<<"\n==========mamal===========\n";
	mamal obj2;
	obj2.display();
	obj2.displayMamal();
	mamal obj3(1,"dance",20,"black","white");
	obj3.display();
	obj3.displayMamal();
	cout<<"\n==========Bird===========\n";
	bird obj4(1,"fly",2,"blue","black");
	obj4.display();
	obj4.displaybird();
	cout<<"\n==========fish===========\n";
	fish obj5;
	obj5.display();
	obj5.displayfish();
	return 0;
}