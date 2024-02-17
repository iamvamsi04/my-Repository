#include <iostream>
using namespace std;

void BoxArea(float l, float w, float h)
{
    cout<<"the area of box is  " <<((2*l*w)+(2*l*h)+(2*h*w))<<endl;
}

void BoxVolume(float l, float w, float h)
{
    cout << "The Volume of box is  "<< l*w*h<<endl;
}
int main ()
{
     float L,w,h;
     cout<<"Enter the length, width and height respectively: "<<endl;
     cin>>L>>w>>h;
     BoxVolume(L,w,h);
     BoxArea(L,w,h);
}
