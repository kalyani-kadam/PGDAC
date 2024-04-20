/*5. Write a program having menu that has three options - add, subtract or multiply two fractions. The two 
fractions and the options are taken as input and the result is displayed as output. Each fraction is read as 
two integers, numerator and denominator.*/
#include<iostream>
using namespace std;
int main()
{
    // int ch;
    // cout<<"Enter choice: ";
    // cin>>ch;
    // float n1,n2;
    // cout<<"Enter 2 no's: ";
    // cin>>n1>>n2;
    // switch (ch)
    // {
    //     case 1:
    //         cout<<"Add: "<<(n1)+(n2);
    //         break;
    //     case 2:
    //         cout<<"Substract: "<<((n1)-(n2));
    //         break;
    //     case 3:
    //         float m = (n1)*(n2);
    //         cout<<"Multiplication of Fractions: "<<m;
    //         // cout<<n1*n2;
    //         break;
    //     // default:
    //     //     cout<<"Invalid";
    //     //     break;

    int a,b,c,d,ch,nu,de;
    printf("enter 1 st fraction \nnumerator:");
    scanf("%d",&a);
    printf("denominator:");
    scanf("%d",&b);
    printf("enter 2 st fraction \nnumerator:");
    scanf("%d",&c);
    printf("denominator:");
    scanf("%d",&d);
    printf("1.add\n2.sub\n3.mul :");
    scanf("%d",&ch);
    switch(ch)
    {
        case 1:nu=(a*d)+(c*b);
            de=(b*d);
            printf("add is %d/%d",nu,de);
            break;
        case 2:nu=(a*d)-(c*b);
            de=(b*d);
            printf("sub is %d/%d",nu,de);
            break;
        case 3:nu=(a*c);
            de=(b*d);
            printf("mul is %d/%d",nu,de);
            break;
    }
    return 0;
}