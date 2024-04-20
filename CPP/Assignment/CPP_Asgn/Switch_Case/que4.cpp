/*4. Accept radius from the user and write a program having menu with the following options and 
corresponding actions:
Options Actions 
1. Area of Circle
2. Circumference of Circle
3. Volume of Sphere*/
#include<iostream>
using namespace std;
int main()
{
    int ch;
    cout<<"1. Area of Circle\n2. Circumference of Circle\n3. Volume of Sphere\n";
    float rad,area,circumference,volume,pi=3.14;
    cout<<"Enter radius: ";
    cin>>rad;
    cout<<"Enter option: ";
    cin>>ch;
    switch (ch)
    {
    case 1:
        area = pi*rad*rad;
        cout<<"Area: "<<area;
        break;
    case 2:
        circumference = 2*pi*rad;
        cout<<"Circumference: "<<circumference;
        break;
    case 3:
        volume = 4*(pi*rad*rad*rad)/3;
        cout<<"Volume: "<<volume;
        break;
    default:
        cout<<"Invalid";
        break;
    }
    return 0;
}