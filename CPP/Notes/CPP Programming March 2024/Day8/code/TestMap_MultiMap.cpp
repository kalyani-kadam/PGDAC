#include<iostream>
#include<vector>
#include <algorithm>
#include <numeric>
#include<set>
#include<map>

using namespace std;
int main()
{
	//unique key
 map<string,string> mymap={
	{"India","Delhi"},
	{"India","Delhi"},
	{"Abc","xyz"},
	{"Pqr","ijk"}	
	};
	
	for(int i=0;i<10)
	cout<<"--------show-------"<<endl;
	for( map<string,string>::iterator it1=mymap.begin();it1!=mymap.end();it1++)   
	{
     cout<< (*it1).first  <<"     "<<(*it1).second <<endl;		
	}
	//add new element into map
	
	
	
	
	
	
	
}
