#include<iostream>
using namespace std;
// in this ex
//  this pointer is passed by compiler itself that's why not mentioned explicitly
class point{
    private:
        int x,y;
    public:
        point(){
            x=0;
            y=0;
        } 
        point(int x1,int y1){
            x = x1;
            y = y1;
        }  
        void display(){
            cout<<"X: "<<x<<" Y: "<<y<<endl;
        } 
void setX(int x1){
    x = x1;
}        
void setY(int y1){
    y = y1;
}
void getX(int x1){
    x = x1;
}
void getY(int y1){
    y = y1;
}
~point(){
    cout<<"object destroyed\n";
}
};
int main()
{
    int x,y;
    cout<<"enter point: ";
    cin>>x>>y;
    point p;
    p.display();
    point p1(1,8);
    p1.display();
    point p2(x,y);
    p2.display();
    return 0;
}
