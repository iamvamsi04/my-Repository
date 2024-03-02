
#include<iostream>
#include<cmath>
using namespace std;
class Parlleogram{
    public:
        float diagonal1,diagonal2,angle,result;
        float AreaofParlleogram(float d1,float d2,float angle){
            float angle1 = angle*3.14/180;
            result = 0.5*(d1*d2)*sin(angle1);
            return result;
        }
};

class Rectangle : public Parlleogram{
    public:
        float length,breadth,result;
        float AreaofRectangle(float length,float breadth){
            result = length*breadth;
            return result;
        }
};

class Square : public Parlleogram{
    public:
        float side;
        float AreaofSquare(float side){
            result = side*side;
            return result;
        }
};

class Rhombus : public Parlleogram{
    public:
        float AreaofRhombus(float d1,float d2){
            result = 0.5*d1*d2;
            return result;
        }
};

int main(){
    cout<<"This is to demonstrate Hierachial inheritance"<<endl;
    Rectangle obj1;
    cout<<"To find area of Parlleogram"<<endl;
    cout<<"enter lengths of two diagonals and angle between them: "<<endl;
    cin>>obj1.diagonal1>>obj1.diagonal2>>obj1.angle;
    obj1.result=obj1.AreaofParlleogram(obj1.diagonal1,obj1.diagonal2,obj1.angle);
    cout<<"Area of parlleogram is "<<obj1.result<<endl;


    cout<<"To find area of rectangle"<<endl;
    cout<<"enter lengths of two length and breadth: "<<endl;
    cin>>obj1.length>>obj1.breadth;
    obj1.result=obj1.AreaofRectangle(obj1.length,obj1.breadth);
    cout<<"Area of rectangle is "<<obj1.result<<endl;

    Square obj2;
    cout<<"To find area of Square"<<endl;
    cout<<"enter lengths of side: "<<endl;
    cin>>obj2.side;
    obj2.result=obj2.AreaofSquare(obj2.side);
    cout<<"Area of Square is "<<obj2.result<<endl;

    Rhombus obj3;
    cout<<"To find area of Rhombus"<<endl;
    cout<<"enter lengths of two diagonals: "<<endl;
    cin>>obj3.diagonal1>>obj3.diagonal2;
    obj3.result=obj3.AreaofRhombus(obj3.diagonal1,obj3.diagonal2);
    cout<<"Area of Square is "<<obj3.result<<endl;
}
