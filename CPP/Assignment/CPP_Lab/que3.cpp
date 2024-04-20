#include<iostream>
using namespace std;
int main(){

    int n=1;
    bool flag =0;
    int n1,n2;
    cout<<"Enter num1 and num 2 :";
    cin>>n1>>n2;

    for (int i = n1; i <=n2; i++)
    {
        int flag = 0;
        for (int j = 2; j<=i/2; ++j)
        {
            if (i % j == 0)
            {
               flag = 1;
               break;
            //    cout<<"not prime";
            }            
        }
        if (flag == 0){
            cout<<i<<" ";
        }
        
    }
    return 0;
}
