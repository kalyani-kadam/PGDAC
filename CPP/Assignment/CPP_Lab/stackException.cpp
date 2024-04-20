#include<iostream>
using namespace std;

class stack{
    // int s;
    // int arr[s];
    public:
        int size,top = -1;
        int *arr = new int(size);

        void setSize(int size){
            this->size = size;
        }
        void push(int value){
            if(isFull()){
                cout<<"Stack is full"<<endl;
            }else{
                top++;
                // cout<<"Enter Element : "<<endl;
                // cin>>arr[top];
                arr[top] = value;
                cout<<"Element added!"<<endl;
            }
        }
        void pop(){
            if (isEmpty())
            {
                cout<<"Stack is empty!"<<endl;
            }else{
                cout<<arr[top]<<" removed"<<endl;
                arr[top] = 0;
                top--;
            }
        }
        int isFull(){
            if (top == size-1)
            {
                return 1;
            }else{
                return 0;
            }           
        }
        int isEmpty(){
            if(top==-1){
                return 1;
            }else{
                return 0;
            }
        }

        // void add(){
        //     cout<<"Enter "<<sizeof(arr)/sizeof(int)<<" element: ";
        //     for (int i = 0; i < sizeof(arr)/sizeof(int); i++)
        //     {
        //         cin>>arr[i];
        //     }   
        // }
        void display(){
            cout<<endl<<"-----------Stack elements----------"<<endl;
            if (isEmpty())
                {
                    cout<<"Stack is empty"<<endl;
                }else{
                    for (int i = 0; i<size; i++)
                    {
                        cout<<arr[i]<<" "; 
                    } 
                }
        }
};
int main()
{
    stack s1;
    // s1.pop();

    int size,ch,element;
    cout<<"Enter size: ";
    cin>>size;
    s1.setSize(size);
    // s1.push(89);
    // s1.push(67);
    // s1.push(63);
    // s1.pop();
    // s1.pop();
    // s1.pop();
    // s1.pop();
    // s1.display();
    do
    {   
        cout<<"\n0.exit\n1.Push\n2.Pop\n3.Display\n";
        cout<<"Enter choice: ";
        cin>>ch;
        switch (ch)
        {
        case 1:
            if (s1.isFull())
            {
                cout<<"Stack overflow!";
            }else{
                cout<<"Enter element: ";
                cin>>element;
                s1.push(element);
            }
            break;
        case 2:
            s1.pop();
            break;
        case 3:
            s1.display();  
            break;  
        default:
            cout<<"Invalid";
            break;
        }
    } while (ch!=0);
    
    return 0;
}