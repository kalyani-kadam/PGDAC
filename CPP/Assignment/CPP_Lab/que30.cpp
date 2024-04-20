#include <iostream>  
using namespace std;  
class A{  
public:      A(){     
     cout<<"Constructor called\n";       
  }     
 ~A(){     
     cout<<"Destructor called\n";        
  } 
  }; 
 int main(int argc, char const *argv[])  {  
    A *a = new A[5]; 
     delete[] a;  
    return 0;
  } 