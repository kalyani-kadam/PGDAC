/*Vehicle Inheritance:
Problem Statement: Develop a class hierarchy for vehicles. Start with a base class Vehicle and create derived classes like Car, Motorcycle, and Truck. Each derived class should have unique properties like the number of wheels and specific methods like start_engine().*/
#include<iostream>
using namespace std;

class vehicle{
    int dist;
    int NoOfDoors;
    public:
        vehicle();
        vehicle(int dist,int NoOfDoors);
        void displayVehicle();

};
vehicle::vehicle(){
            dist = 0;
            NoOfDoors = 4;
        }
vehicle::vehicle(int dist,int NoOfDoors){
            this->dist = dist;
            this->NoOfDoors = NoOfDoors;
        }
void vehicle:: displayVehicle(){
        cout<<"Distance : "<<dist<<" No of Doors: "<<NoOfDoors<<endl;
    }

class car:public vehicle{
    int noOfWheels;
    bool isLuxury;
    public:
        car(){
            noOfWheels = 4;
            isLuxury = true;
        }
        car(int dist,int NoOfDoors ,int noOfWheels,bool isLuxury):vehicle(dist,noOfWheels){
            cout<<"\n---parametrized constructor----"<<endl;
            this->noOfWheels = noOfWheels;
            this->isLuxury = isLuxury;
        }
        void displayCar(){
            cout<<" No of wheels: "<<noOfWheels<<" Is Luxury: "<<isLuxury<<endl;
        }
};

class truck:public vehicle{
    int noOfWheels;
    bool isLuxury;
    public:
        truck(){
            noOfWheels = 4;
            isLuxury = true;
        }
        truck(int dist,int NoOfDoors ,int noOfWheels,bool isLuxury):vehicle(dist,noOfWheels){
            cout<<"\n---parametrized constructor----"<<endl;
            this->noOfWheels = noOfWheels;
            this->isLuxury = isLuxury;
        }
        void displayCar(){
            cout<<" No of wheels: "<<noOfWheels<<" Is Luxury: "<<isLuxury<<endl;
        }
};

int main(){
    vehicle v;
    // v.displayVehicle();

    // car c;
    // c.displayVehicle();
    // c.displayCar();

    // car c1(200,2,4,false);
    // c1.displayVehicle();
    // c1.displayCar();

    truck t(1000,2,6,0);
    t.displayVehicle();
    t.displayCar();
    return 0;
}