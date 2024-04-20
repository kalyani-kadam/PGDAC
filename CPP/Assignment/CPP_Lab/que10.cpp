#include<iostream>
#include<string.h>
using namespace std;
class person{
    int age;
    char *name,*city;

    public:
        person(){
            this->age=1;
            this->name="Ram";
            this->city = "Latur";
        }
        person(int age,char *name,char *city){
            this->age = age;
            this->name = new char[strlen(name)+1];
            strcpy(this->name,name);
            this->city = new char[strlen(city)+1];
            strcpy(this->city,city);
        }
        void display(){
            // for (int i = 0; i < strlen(name)+1; i++)
            // {
                // cout<<name;
            // }
            // for (int i = 0; i < strlen(city)+1; i++)
            // {
                // cout<<city;
            // }
        //    cout<<" Age: "<<age<<endl; 
        cout<<" Name: "<<name<<" Age: "<<age<<" City: "<<city<<endl;
        }
void setAge(int age){
    this->age=age;
}
void setName(char *name){
    this->name = name;
}
void setCity(char *city){
    this->city = city;
}  
int getAge(int age){
    return this->age;
}   
string getName(char *name){
    return this->name;
}  
string getCity(char *city){
    return this->city;
} 
~person(){
    cout<<"object destryed"<<endl;
    delete name;
    delete city;
}
};
int main()
{
    person p;
    p.display();
    person p1(29,"Radha","Latur");
    p1.display();
    return 0;
}
