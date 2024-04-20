#include <iostream>
#include <fstream>
using namespace std;

class student {
private:
    string name;    
    int age;    
    string mail;
public:
    void getData(student &s) {
        ofstream file;
        file.open("file.txt", ios::app);
        if(!file) {
            cout << "Error in creating file.." << endl;
            return;
        }
        cout << "\nFile created successfully." << endl;

        cout << "Enter name:    ";
        cin.ignore(); 
        getline(cin, name);

        cout << "Enter age:     ";
        cin >> age;

        cout<<"Enter mail:    ";
        cin.ignore(); 
        getline(cin, mail);

        file.write((char*)&s, sizeof(s));
        file.close();

        cout << "\nFile saved and closed succesfully." << endl;
    }
    void showData(student &s) {
        ifstream file1;
        file1.open("file.txt", ios::in);
        if(!file1){
            cout<<"Error in opening file..";
            return;
        }
        while(!file1.eof()){
             file1.read((char*) &s, sizeof(s));
             cout << "Name: " <<name << "\nAge : " << age << "\nMail: "<< mail << endl; 
        }
        file1.close();
    }
};
int main() {
    student s;
    s.getData(s);
    s.getData(s);
    s.getData(s);
    s.showData(s);
    return 0;
}