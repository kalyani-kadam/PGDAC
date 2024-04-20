#include<iostream>
#include<string.h>
using namespace std;

class student{
    private:
        double rollNo,mark1,mark2,mark3,Total,AddTotal=300;
        double percentage;
        char grade = 'A';
        char *name;
        void calcTotal(){
            Total = mark1 + mark2 + mark3;
        }
        void calcPercentage(){
            // percentage = 100;
            percentage = ((mark1+mark2+mark3)/300)*100;
            // percentage = (mark)
        }
        void calcGrade(){
            if (percentage>80)
            {
                grade = 'A';
            }else if(percentage>60)
            {
                grade = 'B';
            }else{
                grade = 'C';
            }
            
        }
    public:
        student(){
            this->name=name;
            this->rollNo = rollNo;
            this->mark1 = mark1;
            this->mark2 = mark2;
            this->mark3 = mark3;
        }
        student(char *name,int rollNo,int mark1,int mark2,int mark3){
            this->rollNo = rollNo;
            this->mark1 = mark1;
            this->mark2 = mark2;
            this->mark3 = mark3;
            this->name = name;
            this->name = new char[strlen(name)+1];
            strcpy(this->name,name);
        }
        void acceptInfo(char *name,int rollNo,int mark1,int mark2,int mark3){
            this->rollNo = rollNo;
            this->mark1 = mark1;
            this->mark2 = mark2;
            this->mark3 = mark3;
        }
        void display(){
            calcTotal();
            calcPercentage();
            calcGrade();
            cout<<"Name: "<<name<<" RollNo: "<<rollNo<<" Mark1: "<<mark1<<" Mark2: "<<mark2<<" Mark3: "<<mark3<<" Total: "<<Total<<" Percentage: "<<percentage<<" Grade : "<<grade<<endl;
        }
        ~student(){
            cout<<"object destroyed"<<endl;
        } 
        void setRollNo(int r){
            this->rollNo = r;
        }   
        int getRollNo(){
            return this->rollNo;
        }
        void setName(char *n){
            this->name = n;
        }
        string getName(char *n){
            return this->name;
        }
        int getMark1(){
            return this->mark1;
        }
};

int main()
{
    // student s(101,80,50,70);
    int rollNo,mark1,mark2,mark3;
    char *name;
    // cout<<"enter student details: ";
    // cin>>rollNo>>mark1>>mark2>>mark3;
    // student s(*name,rollNo,mark1,mark2,mark3);
    // s.display();
    student dac[5];
    student s1("Kalyani",102,40,60,80);
    student s2("Bhakti",103,90,80,30);
    student s3("Bhagawati",104,60,60,10);
    student s4("Hari",105,70,60,80);
    student s5("Maya",106,80,90,90);
    dac[0] = s1;
    dac[1] = s2;
    dac[2] = s3;
    dac[3] = s4;
    dac[4] = s5;
    cout<<"--------Display Student details-----"<<endl;
    for (int i = 0; i < 5; i++)
    {
        dac[i].display();
        cout<<"\n";
    }
    return 0;
}
    // int r1,RN;
    // cout<<"Enter rollNo to search: ";
    // cin>>r1;
    // cout<<"\n--------Display Student RollNo details-----"<<endl;
    // for (int i = 0; i < 5; i++)
    // {
    //     RN = dac[i].getRollNo();
    //     // cout<<"RollNo: "<<dac[i].getRollNo();
    //     cout<<"RollNo: "<<RN;
    //     cout<<"\n";       
    //     if(RN == r1){
    //         cout<<"-------------------------\n";
    //         cout<<"------Get student details by entering roll no--------\n";
    //         cout<<"Valid rollNo\n";
    //         dac[i].display();
    //         cout<<"-------------------------\n";
    //     }
    //     // else{
    //     //     cout<<"Invalid rollNo\n";
    //     // }
    // }     

    // // cout<<"Name : "<<dac[0].setName("Babali");
    // // string n = dac[1].setName("Babali");
    // // char *n = dac[1].getName("Babli");
    // int m = dac[0].getMark1();
    // cout<<"Mark1: "<<m<<endl;
//     return 0;
// }