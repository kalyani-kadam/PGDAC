/*1. Accept the radius from user and compute the area and circumference of a circle.*/
#include<stdio.h>
#include <iostream>
using namespace std;
int main()
{
    float radius;
    cout<<"Enter radius:";
    cin>>radius;
    float area,circumference;
    area = 3.14*radius*radius;
    circumference = 2*3.14*radius;
    cout<<"Area:"<<area;
    cout<<"\nCircumference:"<<circumference;
    return 0;
}
