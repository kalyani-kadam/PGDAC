#include<iostream>
using namespace std;
int main()
{
	
	cout<<"----array demo----"<<endl;
	
     int arr[5]={23,45,42,12,4};
	 
	 for(int i=0;i<5;i++)
	 {
	 	cout<<arr[i]<<" ";
	  }	 
	//lab:sum of all array elements
	//lab:display num from array >50
	//lab:display odd,even,prime from array
	//lab:sort array
	//lab:reverse array
	//lab:double array element
	//lab:search element from array
	int size;
	cout<<"\n Enter Size "<<endl;
	cin>>size;
	int no;
	int rollno[size];//5
	for(int i=0;i<size;i++){
	cout<<"Enter No ";
	cin>>no;
	rollno[i]=no;
	//or
	//cin>>rollno[i];//0 1 2 3 4
     }
	cout<<"\n------numbers------"<<endl;
	for(int i=0;i<size;i++)
	{
	cout<<rollno[i]<<"  ";	
	}
	//lab :accept  arr1[3]  ex. 10 20 30
	// accept arr2[4] ex. 40 50 60 70
	//create arr3  to store elements from arr1 and arr2
	// so arr3 ex 10 20 30 40 50 60 70
	int rows=3;
	int cols=3;
	int array[rows][cols];
	cout<<"\n\n\n"<<endl;
	
	for(int row=0;row<rows;row++)
	{
		for(int col=0;col<cols;col++)
		{
			cout<<"enter value for "<<row<<"  "<<col<<endl;
	cin>>array[row][col];	
		}
	}
	cout<<"\n---elements are------"<<endl;
	
		for(int row=0;row<rows;row++)
	{
		for(int col=0;col<cols;col++)
		{
		 cout<<array[row][col]<<"  ";	
		}
		cout<<"\n";
	}
	
	
	
}


