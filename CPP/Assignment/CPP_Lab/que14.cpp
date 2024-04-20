#include<iostream>
using namespace std;
class ComplexNumber{
    int real,imaginary;
    public:
        ComplexNumber(){
            this->real = 0;
            this->imaginary= 0;
        }
        ComplexNumber(int r,int imag){
            this->real = r;
            this->imaginary = imag;
        }
        void display(){
            // cout<<"Real: "<<real<<" Imaginary: "<<imaginary<<endl;
            cout<<"Complex no= "<<real<<"+i"<<imaginary<<endl;
        }
void setReal(int r){
    this->real = r;
}        
void setImaginary(int i){
    this->imaginary = i;
}
int getReal(int r){
    return this->real;
}
int getImaginary(){
    return this->imaginary;
}
~ComplexNumber(){
    cout<<"Object destroyd\n";
}
};
int main()
{
    ComplexNumber c;
    c.display();
    ComplexNumber c1(10,2);
    c1.display();
    return 0;
}
