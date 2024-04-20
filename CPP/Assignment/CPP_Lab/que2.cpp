#include<iostream>
using namespace std;
int main(){

    int n=1;
    bool flag =0;
    /*for(int i = 2 ; i<=n/2;i++){
            
        if (n%i==0)
        {
            flag = 1;
            // break;
        }else{
            cout<<i;
    }*/
    // if(flag == 0){
    //     cout<<"prime";
    // }else{
    //     cout<<"not prime";
    // }

    for (int i = 2; i <=50; i++)
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
