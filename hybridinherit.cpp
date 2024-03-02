#include <iostream>
#include <cmath>

using namespace std;

class Parallelogram {
public:
    float areaOfParallelogram(float d1, float d2, float angle) {
        float angle1 = angle * M_PI / 180;
        return (0.5 * (d1 * d2) * sin(angle1));
    }
};

class Rectangle : virtual public Parallelogram {
public:
    float length, breadth;
    float resultRectangle;

    float areaOfRectangle(float length, float breadth) {
        resultRectangle = length * breadth;
        return resultRectangle;
    }
};

class Square : virtual public Parallelogram {
public:
    float side;
    float resultSquare;

    float areaOfSquare(float side) {
        resultSquare = side * side;
        return resultSquare;
    }
};

class Rhombus : public Rectangle, public Square {
public:
    float diagonal1, diagonal2, angle,result;
    float resultRhombus;

    using Rectangle::resultRectangle;
    using Square::resultSquare;
    using Parallelogram::areaOfParallelogram;

    float areaOfRhombus(float d1, float d2) {
        resultRhombus = resultRectangle + resultSquare + areaOfParallelogram(d1, d2, 0);
        return resultRhombus;
    }
};

int main() {
    cout << "This is to demonstrate Hybrid inheritance" << endl;
    Rhombus obj1;

    cout << "To find area of Parallelogram" << endl;
    cout << "Enter lengths of two diagonals and angle between them: " << endl;
    cin >> obj1.diagonal1 >> obj1.diagonal2 >> obj1.angle;
    obj1.result = obj1.areaOfParallelogram(obj1.diagonal1, obj1.diagonal2, obj1.angle);
    cout << "Area of parallelogram is " << obj1.result << endl;

    cout << "To find area of Rectangle" << endl;
    cout << "Enter lengths of two length and breadth: " << endl;
    cin >> obj1.length >> obj1.breadth;
    obj1.resultRectangle = obj1.areaOfRectangle(obj1.length, obj1.breadth);
    cout << "Area of rectangle is " << obj1.resultRectangle << endl;

    cout << "To find area of Square" << endl;
    cout << "Enter lengths of side: " << endl;
    cin >> obj1.side;
    obj1.resultSquare = obj1.areaOfSquare(obj1.side);
    cout << "Area of Square is " << obj1.resultSquare << endl;

    cout << "To find area of Rhombus" << endl;
    cout << "Enter lengths of two diagonals: " << endl;
    cin >> obj1.diagonal1 >> obj1.diagonal2;
    obj1.resultRhombus = obj1.areaOfRhombus(obj1.diagonal1, obj1.diagonal2);
    cout << "Area of Rhombus is " << obj1.resultRhombus;

}
