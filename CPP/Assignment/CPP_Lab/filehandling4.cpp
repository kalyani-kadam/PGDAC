#include<iostream>
#include<string.h>
#include<fstream>
using namespace std;

class book{
    string name,author;
    int bookid;
    double price;

    public:
        void getBook(book &b1){
            ofstream b;
            b.open("book.txt" , ios::app);
            if (!b){
                cout<<"File not created!!"<<endl;
                return;
            }
            cout<<"\nFile created successfully!!\n\nEnter data of books"<<endl;
            cout<<"\nEnter id: ";
            cin>>bookid;
            cout<<"\nEnter name : ";
            cin.ignore();
            getline(cin,name);
            cout<<"\nEnter author name : ";
            cin.ignore();
            getline(cin,author);
            cout<<"\nEnter price: ";
            cin>>price;

            b.write((char*)&b1,sizeof(b1));
            b.close();
            cout<<"Data written successfully!!!"<<endl;
        }

        void readBook(book &b1){
            ifstream r;
            r.open("book.txt.c_str()",ios::app); //for version below c++17 use filename.c_str() function
            if(!r){
                cout<<"\nFile not created!!"<<endl;
            }
            cout<<"Reading data from file!!!\n";
            while (!r.eof())
            {
                r.read((char*)&r,sizeof(b1));
                cout<<"Name: "<<name<<"\nId : "<<bookid<<"\nAuthor name: "<<author<<"\nPrice: "<<price<<endl;
            }
            r.close();
            cout<<"file closed and saved successfully!!"<<endl;
            // r.close();
        }
        // cout<<"file closed and saved successfully!!"<<endl;
};

int main()
{
    book book;
    int ch;
    do
    {
        cout<<"\n___________0.exit 1.Add book 2.Read data about book__________\n";
        cout<<endl<<"enter choice: ";
        cin>>ch;
        switch (ch)
        {
        case 1:
            book.getBook(book);
            // cout<<"Book added successfully!";
            break;
        case 2:
            book.readBook(book);
            break;
        default:
            cout<<"Invalid choice"<<endl;
            break;
        }
    } while (ch!=0);
    
    return 0;
}
