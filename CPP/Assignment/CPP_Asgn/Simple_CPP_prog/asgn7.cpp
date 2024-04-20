/*7. Accept temperatures in Fahrenheit (F) and print it in Celsius(C) and Kelvin (K) (Hint: C=5/9(F-32), K = C + 
273.15)*/
#include<iostream>
using namespace std;
int main(){
    float temp;
    cout<<"Enter temp: ";
    cin>>temp;
    float celsius = (5*(temp-32))/9;
    float kelvin = celsius + 273.15;
    cout<<"Celcius: "<<celsius<<" & Kelvin: "<<kelvin<<"";
    return 0;
}