/*3. Accept marks of 5 subjects (out of 100) of a student and display total marks and compute the 
percentage also.*/
#include<iostream>
using namespace std;
int main()
{
    float s1,s2,s3,s4,s5;
    cout<<"Enter a marks of 5 subjects out of 100:";
    cin>>s1>>s2>>s3>>s4>>s5;
    float total = s1+s2+s3+s4+s5;
    cout<<"Toatal marks of student is "<<total<<"";
    float percentage = total / 5;
    cout<<"\nPercentage of marks of student is "<<percentage<<"%";
    return 0;
}