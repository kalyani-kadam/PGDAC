
#include <iostream>
#include <string.h>
#include <fstream>

using namespace std;

class Employee

{
    int eno;
    char name[20];
    double sal;

public:
    Employee()
    {
    }
    Employee(int no, const char *nm, double sa)
    {
        eno = no;
        strcpy(name, nm);
        sal = sa;
    }
    void Accept()
    {
        cout << "\n\n\t Enter EMp No Name and Salary ";
        cin >> eno >> name >> sal;
    }
    void Display()
    {
        cout << "\n\n"
             << eno << "\t" << name << "\t" << sal;
    }
    void AddReord()
    {
        ofstream fout("emp.dat", ios::app | ios::binary);
        Employee e1;
        e1.Accept();
        fout.write((char *)&e1, sizeof(Employee));
        fout.close();
    }
    void DipslayRecords()
    {
        Employee e1;
        ifstream fin("emp.dat", ios::binary);
        while (fin.read((char *)&e1, sizeof(Employee)))
        {
            e1.Display();
        }
        fin.close();
    }
    bool Search(int eno)
    {
        bool res = false;
        Employee e1;
        ifstream fin("emp.dat", ios::binary);
        while (fin.read((char *)&e1, sizeof(Employee)))
        {
            if (e1.eno == eno)
            {
                e1.Display();
                res = true;
            }
        }
        fin.close();
        return res;
    }
    bool Modify(int eno)
    {
        bool res = false;
        Employee e1, e2;
        fstream fin("emp.dat", ios::binary | ios::in | ios::out);
        // fin.seekp(0,ios::beg);
        while (fin.read((char *)&e1, sizeof(Employee)))
        {
            if (e1.eno == eno)
            {
                long no = -1 * sizeof(Employee);//32
                
				cout<<"\t\t\t\t   "<<no<<endl;;
                fin.seekp(no, ios::cur);
                e2.Accept();
                fin.write((char *)&e2, sizeof(Employee));
                res = true;
            }
        }
        fin.close();
        return res;
    }
    
    int countRecords()
    {
        int cnt = 0;
        fstream file("emp.dat", ios::out | ios::in | ios::binary);
        file.seekg(0, ios::end);
        long no = file.tellg();
        cnt = no / sizeof(Employee);
        return cnt;
    }
};
int main()
{
    int eno, ch;
    Employee e1, e2;
    do
    {
        cout << "\n\t\t1. Add Record\
        \n\t\t2. Display All REcord\
        \n\t\t3. Search Record\
        \n\t\t4. Count Records\
        \n\t\t5. Modify\
        \n\t\t6. Delete\
        \n\t\t0. Exit\
        \nEnter Your Choice ";
        cin >> ch;
        switch (ch)
        {
        case 1:
            e1.AddReord();
            break;
        case 2:
            e1.DipslayRecords();
            break;
        case 3:
            cout << "\n\n\t Enter Employee Number To Search ";
            cin >> eno;
            if (e1.Search(eno) == false)
                cout << "\n\n\t Record Not Found ";
            break;
        case 5:
            cout << "\n\n\t Enter Employee Number To Modify ";
            cin >> eno;
            if (e1.Modify(eno) == false)
                cout << "\n\n\t Record Not Found ";
            break;
        case 4:
            cout << "\n\n\t Number Of Records " << e1.countRecords();
            break;
            
            //break;
        }
    } while (ch != 0);

    cout << "\n\n\n";
    return 0;
}


