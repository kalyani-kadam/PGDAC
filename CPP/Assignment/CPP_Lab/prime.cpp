#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    if (n==1)
    {
        cout<<n;
    }
    
    for (int i = 2; i <= n; i++)
    {
        int flag = 1;
        for (int j = 2; j*j <=i; j++)
        {
            if (i % j == 0)
            {
                flag = 0;
                break;
            }
            
        }
        if (flag == 1)
        {
            cout<<i<<" ";
        }        
    }
    
    return 0;
}