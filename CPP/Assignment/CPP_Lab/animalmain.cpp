#include<iostream>
using namespace std;

class vehicle{
	
	int wheel;
	string fuelType,name;
	public:
		vehicle(){
			wheel = 0;
			fuelType = "no fuel";
			name = "no name";
		}
		vehicle(int w,string ft,string n){
			this->wheel = w;
			this->fuelType = ft;
			this->name = n;
		}
		void display(){
			cout<<" Wheel "<<wheel<<" Fuel Type: "<<fuelType<<" Name :"<<name<<endl;		
		}
};

class car : public vehicle{
	string sensor;
	public: 
		car(){
			sensor = " no sensor";
		}
		car(int w,string ft,string n,string sensor):vehicle(w,ft,n){
			this->sensor = sensor;
		}
		void display(){
			vehicle::display();
			cout<<" Sensor: "<<sensor<<endl;
		}
};

class truck: public vehicle{
	int loadCapacity;
	public: 
		truck(){
			loadCapacity = 0;
		}
		truck(int w,string ft,string n,int loadCapacity):vehicle(w,ft,n){
			this->loadCapacity = loadCapacity;
		}
		void display(){
			vehicle::display();
			cout<<" loadCapacity: "<<loadCapacity<<endl;
		}
};
int main(){
//	vehicle v;
//	v.display();

//	car c(4,"diesel","bmw","temp");
//	c.display();
int w,lc;
static int i=0;
string ft,n,s;
vehicle *veh[2];
car* c;
truck* t;
	cout<<"\n0.exit\n1.add car details\n2.add truck details: "<<endl;
	int ch;
	do{
		cout<<"Enter choice: ";
		cin>>ch;
	switch(ch){
	case 1:
	if(i<2){
		cout<<"Enter car details: wheel fuelType name sensor---"<<endl;
	    cin>>w>>ft>>n>>s;
		c =new car(w,ft,n,s);
		veh[i] = c;
		veh[i]->display();
		i++;
//		veh[i]->		
	}
	else{
		cout<<"Capacity full";
	}
	break;
	case 2:
		if(i<2){
		cout<<"Enter truck details: wheel fuelType name loadCapacity---"<<endl;
	    cin>>w>>ft>>n>>lc;
		 t =new truck(w,ft,n,lc);
		veh[i] = t;
		veh[i]->display();
		i++;
//		veh[i]->		
	}
	else{
		cout<<"Capacity full";
	}
	break;
	default:
		cout<<"invalid";
		break;
	}
	}while(ch!=0);
	
	}