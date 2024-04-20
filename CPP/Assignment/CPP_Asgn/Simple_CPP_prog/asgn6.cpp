/*6. Accept dimensions of a cylinder and print the surface area and volume (Hint: surface area = 2πr 2 + 2πrh, 
volume = π r 2 h). Define a constant variable pi=3.14.*/
#include<iostream>
using namespace std;
int main(){
    int radius,height;
    cout<<"Enter 2 no: ";
    cin>>radius>>height;
    float surfce_area,volume,pi=3.14;
    surfce_area = (2 * pi * radius)*(2 * pi * radius) + 2 * pi * radius * height;
    volume = pi * radius * 2 * height;
    cout<<"Surface area: "<<surfce_area<<" & volume: "<<volume<<"";
    return 0;
}