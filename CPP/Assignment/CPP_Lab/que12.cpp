#include<iostream>
#include<string.h>
using namespace std;
class book{
    int id;
    float price;
    char *bname,*author;

    public:
        book(){
            this->bname="Atomic habit";
            this->author="James clare";
            this->id=0;
            this->price=0.1;
        }
        book(char *bname,char *author,int id,float price){
            this->bname=bname;
            bname = new char[strlen(bname)];
            strcpy(bname,bname);
            this->author=author;
            author = new char[strlen(author)];
            strcpy(author,author);
            this->id=id;
            this->price=price;
            // cout<<"Constrr created";
        }
        void display(){
            cout<<"Name: "<<bname<<" Author: "<<author<<" Id: "<<id<<" Price: "<<price<<endl;
        }
void setName(char *bname){
    this->bname = bname;
}     
void setAuthor(char *author){
    this->author = author;
}   
void setId(int id){
    this->id = id;
}
void setPrice(float price){
    this->price = price;
}
string getName(char *name){
    return this->bname;
}
string getAuthor(char *name){
    return this->author;
}
int getId(int id){
    return this->id;
}
float getPrice(int p){
    return this->price;
}
~book(){
    cout<<"object destroyed";
    delete bname;
    delete author;
}
};
int main()
{
    book b;
    b.display();
    book b1("Wings of fire","Abdul Kalam",1,100.91);
    b1.display();
    return 0;
}
