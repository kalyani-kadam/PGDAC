/*Shape Sorting with Interfaces:
Problem Statement: Implement a shape sorting program. Define a base class Shape with properties like area and perimeter. Create derived classes like Circle, Rectangle, and Triangle. Implement an interface Sortable with a method to compare shapes by area. Use this interface to sort a list of shapes.
*/

#include<iostream>
using namespace std;
class shape{
    int area,perimeter;
    public:
    virtual void display()=0;
    // virtual void calcArea()= 0;
    // virtual void calPerimeter()= 0; 
};
class circle : public shape{
    int rad=10;
    public:
    void display(){
        cout<<"Area : "<<3.14*rad*rad<<endl;
        cout<<"Perimeter : "<<2*3.14*rad<<endl;
    }
};

class rectangle : public shape{
    int l =10, b=10;
    public:
    void display(){
        cout<<"Area : "<<l*b<<endl;
        cout<<"Perimeter : "<<2*(l+b)<<endl;
    }
};

class triangle : public shape{
    int height =12,breadth = 2,a=2,b=12,c=22;
    public:
    void display(){
        cout<<"Area : "<<(height*breadth)/2<<endl;
        cout<<"Perimeter : "<<a+b+c<<endl;
    }
};

int main(){
    cout<<"======circle========\n";
    circle c;
    c.display();
    cout<<"=======rectangle======\n";
    rectangle r;
    r.display();
    cout<<"=======triangle=======\n";
    triangle t;
    t.display();
}