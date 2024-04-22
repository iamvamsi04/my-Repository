#include <iostream>
using namespace std;

class Shape {
public:
  virtual double calculateArea() = 0;
  virtual void displayShape() = 0;
};

class Circle : public Shape {
private:
  double radius;

public:
  Circle(double radius) : radius(radius) {}
  double calculateArea() override {
    return 3.14159 * radius * radius;
  }

  void displayShape() override {
    cout << "This is a circle" << endl;
  }
};

int main() {
  Circle circle(3);
  circle.displayShape();
  cout << "Area of circle: " << circle.calculateArea() << endl;

  return 0;
}
