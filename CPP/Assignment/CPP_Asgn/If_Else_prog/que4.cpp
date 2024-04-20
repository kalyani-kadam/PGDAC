/*4. Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
(Hint: a, e, i, o, u are vowels)*/
#include<iostream>
using namespace std;
int main(){
    char ch;
    cout<<"Enter lowercase character: ";
    cin>>ch;
    if(ch>=97 && ch<=122){
        if(ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            cout<<"Vowels";
        }
        else{
            cout<<"Consonant";
        }
    }
    else{
        cout<<"Enter valid lowercase character";
    }
    return 0;
}