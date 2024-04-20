/*2. Write a program that accepts n strings and displays the longest string. Use array of strings.
3. Write a menu driven program to perform the following operations on strings using standard library 
functions: Length, Copy, Concatenation, Compare, Reverse, Uppercase, Lowercase, Check case*/

#include<stdio.h>
#include<string.h>
#define size 100 
#define wsize 20
void Longest_Word(char str[][20],int n); // Longest_Word Function Prototype
int main()
{
	char str[size][wsize];
	int i,count=0,n;
	printf("\n How many words to accept:- ");
	scanf("%d",&n);
	printf("\n Enter %d words:- \n \n",n);
	for(i=0;i<n;i++)
	scanf("%s",str[i]);
	Longest_Word(str,n);
}
// Longest_Word Function
void Longest_Word(char str[][20],int n)
{
	int i,Max,len1,c;
	Max=strlen(str[0]);
	for(i=1;i<n;i++)
	{
		len1=strlen(str[i]);
		if(len1>=Max)
		{
			c=i;
			Max=len1;
		}
}
	printf("\n The longest string among all is \"%s\" \n \n",str[c]);
}