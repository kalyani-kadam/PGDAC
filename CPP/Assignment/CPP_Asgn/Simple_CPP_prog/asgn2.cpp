/*2. Accept a character from user and display ASCII value of it.*/
#include<iostream>
using namespace std;
int main()
{
    char ch;
    cout<<"Enter character:";
    cin>>ch;
    // printf("ASCII value of %c is %d",ch,ch);
    int asciiValue = (int)ch;
    cout<<"ASCII value of "<<ch<<" is "<<asciiValue<<"";
    // <<ch<<asciiValue;
    return 0;
}
