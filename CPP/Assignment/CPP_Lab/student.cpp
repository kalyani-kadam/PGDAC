#include<iostream>
using namespace std;
class student{
    int rno,m1,m2,m3;
    double total,percentage;
    char grade;
    // void total(){
        // total = m1 + m2 + m3;
    // }
    public:
        void acceptInfo(int rno,int m1,int m2,int m3){
            this->rno = rno;
            this->m1 = m1;
            this->m2 = m2;
            this->m3 = m3;
        }
        void display(){
            total = m1 + m2 + m3;
            percentage = (total/300)*100;
            if (percentage >= 80)
            {
                grade = 'a';
            }else if (percentage >=60)
            {
                grade = 'b';
            }else if (percentage >=40)
            {
                grade = 'c';
            }else{
                grade = 'f';
            }
            
            cout<<"Roll no: "<<rno<<" Mark1: "<<m1<<" Mark2: "<<m2<<" Mark3: "<<m3<<" Total: "<<total<<" Percentage: "<<percentage<<" Grade : "<<grade<<endl;
        }

};
int main()
{
    student s;
    // s.acceptInfo(101,100,100,100);
    // s.display();
    int rno,m1,m2,m3;
    cout<<"Enter roll no, mark1, mark2, mark3: ";
    cin>>rno>>m1>>m2>>m3;
    s.acceptInfo(rno,m1,m2,m3);
    s.display();
    return 0;
}
