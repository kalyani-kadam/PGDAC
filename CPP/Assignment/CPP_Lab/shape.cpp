/*Geometric Shapes with Polymorphism:
Problem Statement: Extend the shape hierarchy example by implementing polymorphism. Define a base class Shape with methods to calculate area and perimeter. Then, create derived classes like Circle, Rectangle, and Triangle, each with its own implementation of these methods*/

#include<iostream>
using namespace std;

class shape{
    int area,perimeter;
    public:
        virtual void calArea() =0;
        // {
        //     cout<<"Area: "<<area<<endl;
        // }
        void perimeter()
        {
            cout<<" perimeter: "<<perimeter<<endl;
        }
};
class circle:public shape{
    double radius;
    public:
        circle(int radius){
            this->radius = radius;
        }
        void calArea(){
            cout<<"Area of Circle: "<<3.14*radius*radius;
        }
        void perimeter()
        {
            cout<<" perimeter of circle : "<<2*3.14*radius;
        }
};

class rectangle:public shape{
    double l,b;
    public:
        rectangle(int l,int b){
            this->l = l;
            this->b = b;
        }
        void calArea(){
            cout<<"Area of rectangle: "<<l*b;
        }
        void perimeter(){
            cout<<" perimeter of rectangcle : "<<2*(l+b);
        }
};
int main()
{
    cout<<"\n------------circle-----------\n";
    circle c(10);
    c.calArea();
    c.perimeter();
    cout<<"\n------------rect-----------\n";
    rectangle r(2,10);
    r.calArea();
    r.perimeter();
    return 0;
}
