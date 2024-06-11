#include<iostream>
#include<math.h>
using namespace  std;

namespace  MyMathNamespace
{
	class myMath{
		public:int add(int i,int j)
		{
			return (i+j);
		}
	};
	class  myMathAdv{
		public:int add(int i,int j)
		{
			return (i+j);
		}
		double NumberSqrt(double num)
		{
			return  sqrt(num);
		}
	};
	
}
namespace  MyMathNamespace2
{
class myMath{
		public:int add(int i,int j)
		{
			return (i+j);
		}
	};
	class  myMathAdv{
		public:int add(int i,int j)
		{
			return (i+j);
		}
		double NumberSqrt(double num)
		{
			return  sqrt(num);
		}
	};
		
}

int main()
{
	
MyMathNamespace::myMath obj1;
cout<<"Add="<<obj1.add(45,67)<<endl;


MyMathNamespace::myMathAdv obj2;
cout<<"sqrt="<<obj2.NumberSqrt(56);

typedef MyMathNamespace::myMathAdv advMath;

advMath obj4;
advMath ojb5;

MyMathNamespace2::myMath m1;
m1.add(77,88);	
	
}
