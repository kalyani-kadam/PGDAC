#include<iostream>
using namespace std;

class date{
    private: 
        int dd,mm,yy;
    public:
        date(){
            this->dd=1;
            this->mm=1;
            this->yy=2000;
        }
        date(int day,int month,int year){
            this->dd=day;
            this->mm=month;
            this->yy=year;
        }
        void display(){
            // cout<<"Day: "<<dd<<" Month:"<<mm<<" Year: "<<yy<<endl;
            cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
        }
void setDay(int day){
    this->dd=day;
}
void setMonth(int month){
    this->mm=month;
}
void setYear(int year){
    this->yy=year;
}
int getDay(int day){
    return this->dd;
} 
int getMonth(int month){
    return mm; //this pointer is provided by compiler itself
}          
int getYear(int year){
    return this->yy;
} 
~date(){
    cout<<"Objejt destroyed"<<endl;
}
};

int main()
{
    date d;
    d.display();
    date d1(22,1,2001);
    d1.display();
    return 0;
}
