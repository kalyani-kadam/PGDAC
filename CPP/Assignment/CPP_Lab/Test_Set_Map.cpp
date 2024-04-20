#include<iostream>
#include<vector>
#include <algorithm>
#include <numeric>
#include<set>
#include<map>

using namespace std;
int main(){
	
	set<int> intSet={12,3,4,5,66,23,12};
	cout<<"-----all elements------\n";
	for(int i:intSet){
		cout<<i<<"  ";
	}
	cout<<"\n----add element into set"<<endl;
	int num;
	cout<<"Enter Num "<<endl;
	cin>>num;
	intSet.insert(num);
	
    cout<<"-----all elements set------\n";
	for(int i:intSet){
		cout<<i<<"  ";
	}
	
	multiset<int> mmSet={23,45,2,1,3,5,23,45};
	cout<<"\n-----all elements in multiset------\n";
	for(int i:mmSet){
		cout<<i<<"  ";
	}
	
	
	
	
	
}
