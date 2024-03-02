#include<iostream>
#include<cmath>

using namespace std;
class Rectangle {
public:
    float length, breadth, result1;
    float AreaofRectangle(float length, float breadth) {
        result1 = length * breadth;
        return result1;
    }
};

class Square {
public:
    float side, result2;
    float AreaofSquare(float side) {
        result2 = side * side;
        return result2;
    }
};

class Rhombus : public Rectangle, public Square {
public:
    float diagonal1, diagonal2, result3;
    float AreaofRhombus(float d1, float d2) {
        result3 = 0.5 * d1 * d2;
        return result3;
    }
};

int main() {
    cout << "This is to demonstrate Multiple inheritance" << endl;
    Rhombus obj1;

    cout << "To find area of rectangle" << endl;
    cout << "enter lengths of two length and breadth: " << endl;
    cin >> obj1.length >> obj1.breadth;
    obj1.result1 = obj1.AreaofRectangle(obj1.length, obj1.breadth);
    cout << "Area of rectangle is " << obj1.result1 << endl;

    cout << "To find area of Square" << endl;
    cout << "enter lengths of side: " << endl;
    cin >> obj1.side;
    obj1.result2 = obj1.AreaofSquare(obj1.side);
    cout << "Area of Square is " << obj1.result2 << endl;

    cout << "To find area of Rhombus" << endl;
    cout << "enter lengths of two diagonals: " << endl;
    cin >> obj1.diagonal1 >> obj1.diagonal2;
    obj1.result3 = obj1.AreaofRhombus(obj1.diagonal1, obj1.diagonal2);
    cout << "Area of Rhombus is " << obj1.result3 << endl;

    return 0;
}
