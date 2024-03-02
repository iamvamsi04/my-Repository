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

int main(){
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

}
