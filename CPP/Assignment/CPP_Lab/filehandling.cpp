#include<iostream>
#include<fstream>
#include<string.h>
using namespace std;
class student{
    int rno;;
    char name[20];
    // string name;
    public:
        void accept(int r,char* n){
            this->rno = r;
            // this->name = n; //error
            strcpy(this->name,n);
        }
        void display(){
            cout<<"roll no : "<<rno<<" name: "<<name<<endl;
        }
        void dispRollno(){
            cout<<"Roll no: "<<rno<<endl;
        }
};

void writestud(string fname, student &studobj){
    // fstream out;
    fstream wstud(fname, ios::out | ios::app);
    wstud.write((char*)&studobj,sizeof(student));
        cout<<"data written";
        wstud.close();
}

void readstud(string fname){
    student s1;
    fstream rstud(fname,ios::in);
    rstud.read((char*)&s1,sizeof(student));
        s1.display();
        s1.dispRollno();
    rstud.close();
}

void readFile(string fname){
    ifstream inp(fname);
    string data;
    while(getline(inp,data)){
        cout<<data<<endl;
    }
}

int main(){
    int ch;
    string filename;
    cout<<"\n1.create student\n2.write\n3.read\n4.display\n";
    // student s2(122,"kalyani");
    // s2.display();
    student s2,s3;
    int rno;
    // string name;
    char name[20];
    do{
        cout<<"enter choice ";
        cin>>ch;
        switch(ch){
            case 1:
                cout<<" rollNo, name : ";
                cin>>rno>>name;
                s2.accept(rno,name);
                break;
            case 2:
                cout<<"enter file name: ";
                cin>>filename;
                writestud(filename,s2);
                break;
            case 3:
                cout<<"enter file name: ";
                cin>>filename;
                readstud(filename);
                // readFile(filename);
                break;
            case 4:
                s2.display();        
        }
    }while(ch!=0);
    return 0;
}