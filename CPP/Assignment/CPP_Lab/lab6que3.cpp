#include<iostream>
using namespace std;

class shape{
    public:
        virtual void area() = 0;
        // area();
        void print(){
            cout<<"\n*******"<<endl;
        }
};

class rectangle:public shape{
    double length,breadth;

    public :
        rectangle(double length, double breadth){
            this->length = length;
            this->breadth = breadth;
        }
        void area(){
            cout<<"Area of rectangle: "<<length*breadth<<endl;
        }
};

class circle : public shape{
    double radius,pi=3.14;
    public:
        circle(double rad){
            radius = rad;
        }
        void area(){
            cout<<"Area of circle: "<<pi*radius*radius<<endl;
        }
};

class triangle : public shape{
    double height,width;
    public:
        triangle(double height,double width){
            this->height = height;
            this->width = width;
        }
        void area(){
            cout<<"Area of triangle: "<<(height*width)/2;
        }
};
int main()
{
    // shape s;
    rectangle r(10,20);
    r.area();
    r.print();
    circle c(10);
    c.area();
    c.print();
    triangle t(10,20);
    t.area();
    return 0;
}