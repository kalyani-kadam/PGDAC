#include<iostream>
using namespace std;

class A{
	public:void show()
	{
		cout<<"-----A --show-----"<<endl;
	}
};
class B{
	public:void show()
	{
		cout<<"-----B --show-----"<<endl;
	}
};
class C:public A,public B{
	 
	 public :void show()
	 { 
	 B::show();
	 
	 }
};

int main()
{
	
	C cObj;//constr A---->const B----->constr C
	//cObj.show();//error
	//sol1:
	cObj.A::show();
	//sol2:
	cObj.show();//
	return 0;
	
	
}
