#include<iostream>
#include<string>
using namespace std;

class Box {
private:
    float length;
    float width;
    float height;

public:
    // Member function defined inside the class to calculate the area
    void boxArea(float l, float w, float h)
    {
     cout<<"the area of box is  " <<((2*l*w)+(2*l*h)+(2*h*w))<<endl;
    }

    // Member function defined outside the class to calculate the volume
    void boxVolume(float l, float w, float h);

    // Friend function to display box dimensions
    friend void displayBoxDimensions(Box box);
};

// Definition of the member function outside the class to calculate the volume
void Box::boxVolume(float l, float w, float h) {
    length = l;
    width = w;
    height = h;
    float volume = length * width * height;
    cout << "Volume of the box is: " << volume << endl;
}

// Inline function defined outside the class
inline void displayWelcomeMessage(Box box) {
    cout << "Welcome to the Box Class!" << endl;
}

// Friend function to display box dimensions
void displayBoxDimensions(Box box) {
    cout << "Box Dimensions - Length: " << box.length << ", Width: " << box.width << ", Height: " << box.height << endl;
}

int main() {
    Box myBox;

    // Using the inline function defined outside the class
    displayWelcomeMessage(myBox);

    float l, w, h;
    cout << "Enter the length, width, and height of the box: ";
    cin >> l >> w >> h;

    myBox.boxArea(l,w,h);
    myBox.boxVolume(l, w, h);

    // Using the friend function to display box dimensions
    displayBoxDimensions(myBox);

    return 0;
}

