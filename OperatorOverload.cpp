#include <iostream>
using namespace std;

class Vector2D {
public:
    double x =0, y =0;

public:
    Vector2D(double x, double y) : x(x), y(y) {}

    // Overloading the addition operator '+'
    Vector2D operator+(const Vector2D& other) const {
        return Vector2D(x + other.x, y + other.y);
    }

};

int main() {
    double x1, y1, x2, y2;

    cout << "Enter the x and y components of the first vector: ";
    cin >> x1 >> y1;

    cout << "Enter the x and y components of the second vector: ";
    cin >> x2 >> y2;

    Vector2D v1(x1, y1);
    Vector2D v2(x2, y2);

    Vector2D sum = v1 + v2;

    cout << "Sum of the two vectors: " << "("<<sum.x<<","<< sum.y<<")"<< endl;

    return 0;
}
