/*#include <iostream>

class StackFullException : public std::exception {
    virtual const char* what() const throw() {
        return "Stack is full";
    }
};

class StackEmptyException : public std::exception {
    virtual const char* what() const throw() {
        return "Stack is empty";
    }
};

class Stack {
private:
    int arr[10];
    int top;

public:
    Stack() {
        top = -1; // Initialize top to -1 indicating an empty stack
    }

    void push(int number) {
        if (top == 9) {
            throw StackFullException();
        }
        arr[++top] = number;
    }

    int pop() {
        if (top == -1) {
            throw StackEmptyException();
        }
        return arr[top--];
    }
};

int main() {
    Stack s;

    try {
        s.push(10);
        s.push(20);
        s.push(30);
        // s.push(40); // Uncommenting this line will trigger StackFullException
        // s.push(50); // Uncommenting this line will trigger StackFullException

        int a = s.pop();
        std::cout << "Pop: " << a << std::endl; // Output: 30

        a = s.pop();
        std::cout << "Pop: " << a << std::endl; // Output: 20

        a = s.pop();
        std::cout << "Pop: " << a << std::endl; // Output: 10

        // s.pop(); // Uncommenting this line will trigger StackEmptyException
    }
    catch (const std::exception& e) {
        std::cerr << "Exception: " << e.what() << std::endl;
    }

    return 0;
}*/

#include<iostream>
using namespace std;
void push(int value);

class StackException{
 	public: string message;
 	        StackException(string msg){
 	        this->message=msg;	
			 }
 };
class stack{
    int top=-1,arr[10];
    public:
        void push(int value){
            // cout<<"pushing elements \n";
            // cout<<"size "<<sizeof(arr);
            if (9 == top-1)
            {
                // throw new StackException("stack full");
                cout<<"stack is full";
            } else{   
                // if(top<0)
                top++;
                arr[top] = value;
            }
        }
        void pop(int value){
            // arr[top] = 0;
            if(top==-1){
                cout<<"stack is empty";
            }
            else{
                arr[top] = 0;
                top--;
            }
        }
        void display(){
            cout<<"Elements at stack: ";
            for (int i = 0; i < 10; i++)
            {
                cout<<arr[i]<<" ";
            }
        }
};

int main()
{
    try
    {
        stack s;
        s.push(12);
        s.push(76);
        s.push(34);
        s.push(87);
        s.push(12);
        s.push(76);
        s.push(34);
        s.push(87);
        s.push(12);
        s.push(76);
        s.push(34);
        s.push(87);
        s.pop(76);
        // s.assign();
        s.display();
        cout<<"Stack main ";
    }
    catch(StackException *obj){
		cout<<"Stack Exception "<<obj->message<<endl;
	}
    catch(...)
	{
	    cout<<"Other Type Of Exception"<<endl;	
	}



    // try{
    //     void push(int value){
    //         if (top<0)
    //             top++;
    //         arr[top] = value; 
    //         top++;   
    //     }
    // }

    // catch(int i){
    //     cout<<" stack full"<<endl;
    // }
    return 0;
}