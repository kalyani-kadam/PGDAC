/*Library Catalog with Books and Journals:
Problem Statement: Build a library catalog system. Create a base class LibraryItem with properties like title and author. Then, derive classes like Book and Journal, each with their unique properties. Implement methods to check out and return items in the derived classes.*/


#include<iostream>
using namespace std;
class libraryItem
{
    // public:static int counter=0;
private:
    string title;
    string author;
public:
    libraryItem(string title,string author){
        this->title = title;
        this->author=author;
        // counter++;
    }
    virtual void display(){
        cout<<"Title :"<<title<<" author: "<<author<<endl;
    }
    ~libraryItem(){
        cout<<"destructor is called!"<<endl;
    }
};

class book:public libraryItem{
    int id;
    double price;
    public:
        book(string title,string author,int id,double price):libraryItem(title,author){
            this->id = id;
            this->price = price;
            // counter++;
        }
        void display(){
            libraryItem::display();
            cout<<" BOOK Id :"<<id<<" price : "<<price<<endl;
        }
};

class journals : public libraryItem{
    int JId;
    double price;
    public:
        journals(string title,string author,int id,double price):libraryItem(title,author){
            this->JId = id;
            this->price = price;
            // counter++;
        }
        void display(){
            libraryItem::display();
            cout<<" BOOK Id :"<<JId<<" price : "<<price<<endl;
        }
};
int main()
{
    book b1("java","james gosling",101,800.23);
    b1.display();
    journals j1("c","dennis ritchie",289,839.92);
    j1.display();
    // cout<<"count : "<<j1.counter<<endl;
    return 0;
}
