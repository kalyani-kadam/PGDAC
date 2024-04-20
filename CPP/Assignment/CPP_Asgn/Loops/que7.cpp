/* 7. Write a menu driven program to do following operations :
a) Compute area of circle
b) Compute area of rectangle
c) Compute area of triangle
d) Exit
Display menu, ask choice to the user, depending on choice accept the parameters and perform the 
operation. Continue this process until user selects exit option.
8. Write a program to print all prime numbers between 1 to n.
*/

#include<iostream>
using namespace std;
int main()
{
    char ch;
    float rad,pi=3.14,area,b,h;
    do
    {
        cout<<"a) Compute area of circle\nb) Compute area of rectangle\nc) Compute area of triangle\nd) Exit\n";
        cout<<"Enter choice: ";
        cin>>ch;
        switch (ch)
            {
            case 'a':
                cout<<"Enter radius of circle: ";
                cin>>rad;
                area=pi*rad*rad;
                cout<<"Area: "<<area<<"\n";
                break;
            case 'b':
                cout<<"Enter base & height: ";
                cin>>b>>h;
                area=b*h;
                cout<<"Area: "<<area<<"\n";
                break;
            case 'c':
                cout<<"Enter base & height: ";
                cin>>b>>h;
                area=(b*h)/2;
                cout<<"Area: "<<area<<"\n";
                break;
            case 'd':
                cout<<exit<<"\n";
                break;
            default:
                cout<<"Invalid";
                break;
            }
    } while(ch!='d');
    return 0;
}