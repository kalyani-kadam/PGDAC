/*3. Write a menu driven program to perform the following operations on strings using standard library 
functions: Length, Copy, Concatenation, Compare, Reverse, Uppercase, Lowercase, Check case*/

#include<iostream>
#include<string>
#include <string.h>
#include<bits/stdc++.h>
#include<cstring>
using namespace std;
int main()
{
    // string str1="",str2="";
    char str1[20],str2[20];
    cout<<"Enter first string : ";
    cin>>str1;
    // getline(cin,str1);
    cout<<"Enter second string : ";
    cin>>str2;
    // getline(cin,str2);
    int ch;
    while(ch!=0){
        cout<<"\n0.Exit\n1.Length\n2.Copy\n3.Concatenation\n4.Compare\n5.Reverse\n6.Uppercase\n7.Lowercase\n8.Check case\n";
        cout<<"Enter choice:"<<endl;
        cin>>ch;
        switch(ch)
        {
        
            case 1:{
                // cout<<"Enter first string : ";
                // cin>>str1;
                // // getline(cin,str1);
                // cout<<"Enter second string : ";
                // cin>>str2;
                int i = strlen(str1);
                cout<<"Length of str1: "<<i<<endl;
                // cout<<"Length of str1: "<<str1.length()<<endl;
                break;
        }    
            case 2:{    
                // cout<<"Enter first string : ";
                // cin>>str1;
                // // getline(cin,str1);
                // cout<<"Enter second string : ";
                // cin>>str2;
                // char str3[20];
                // str1.copy(str3,sizeof str1);
                // cout<<"Copying of string: "<<str3<<endl;
                strcpy(str2,str1);
                cout<<"copied string : "<<str2<<endl;
                break;
            // int i = str1.compare(str2);
            // cout<<i;
        }
            case 3:{
                // cout<<"Enter first string : ";
                // cin>>str1;
                // // getline(cin,str1);
                // cout<<"Enter second string : ";
                // cin>>str2;
                // str1.append(str2);
                strcat(str1,str2);
                cout<<"Concatenation of string: "<<str1<<endl; 
                break;}
            case 4:{
                // cout<<"Enter first string : ";
                // cin>>str1;
                // // getline(cin,str1);
                // cout<<"Enter second string : ";
                // cin>>str2;
                int j = strcmp(str1,str2);
                if(j==0){
                    cout<<"String are equal"<<endl;
                }else{
                    cout<<"String are not equal";
                }
                // cout<<"Comparing 2 string: "<<j<<endl;
                break;}
            case 5:{
                    // cout<<"Enter first string : ";
                    // cin>>str1;
                    // // getline(cin,str1);
                    // cout<<"Enter second string : ";
                    // cin>>str2;
                    strrev(str1);
                    cout<<"Reverse: "<<str1;
                    // reverse(str.begin(), str.end()); 
	                // cout<<"\n"<<str; 
                    // char str4[] = "hello";
                    // strrev(str4);
	                // cout<<"\nReverse of string: "<<str4<<endl; 
                    // reverse(str1.begin(),str1.end());
                    // cout<<"Reverse of string: "<<str1<<endl;
                break; }
            case 6:{
                    // cout<<"Enter first string : ";
                    // cin>>str1;
                    // // getline(cin,str1);
                    // cout<<"Enter second string : ";
                    // cin>>str2;
                    // char str1[] = "Engineering Discipline.";
                    cout << "Original String:\n"<< str1<< endl;
                    cout<<"String in UPPERCASE:\n";
                    for (int x=0; x<strlen(str1); x++)
                        putchar(toupper(str1[x])); 
                    break; 
            }       
            case 7:{
                    // cout<<"Enter first string : ";
                    // cin>>str1;
                    // // getline(cin,str1);
                    // cout<<"Enter second string : ";
                    // cin>>str2;
                    // char str1[] = "Engineering Discipline.";
                    cout << "Original String:\n"<< str1<< endl;
                    cout<<"String in LOWERCASE:\n";
                    for (int x=0; x<strlen(str1); x++)
                        putchar(tolower(str1[x])); 
                    break;  
        }
            case 8:{
                    cout<<"Enter first string : ";
                    cin>>str1;
                    // getline(cin,str1);
                    // cout<<"Enter second string : ";
                    // cin>>str2;
                    char ch = str1[0];
                    if (ch >= 'A' && ch <= 'Z')
                    cout << ch << " is an UpperCase character\n";
 
                    else if (ch >= 'a' && ch <= 'z')
                    cout << ch << " is an LowerCase character\n";
 
                    else
                    cout << ch << " is not an alphabetic character\n";
                    break;
            }                           
            default:
                cout<<"Enter valid choice!";
                break;     

                // cout<<"Comparing 2 string: "<<i<<endl;
                // cout<<"Comparing 2 string: "<<str1.compare(str2)<<endl;
        } 
    }
    return 0;
}