//Box.c++

#include "BoxVolume.h"
#include "BoxArea.h"

int main ()
{
     float L,w,h;
     cout<<"Enter the length, width and height respectively: "<<endl;
     cin>>L>>w>>h;
     BoxVolume(L,w,h);
     BoxArea(L,w,h);
}
