#include <iostream>
using namespace std;
// Template class for arithmetic operations
template<typename T>
class Arithmetic {
public:
  // Addition method
  T add(T a, T b) {
    return a + b;
  }

  // Subtraction method
  T subtract(T a, T b) {
    return a - b;
  }

  // Multiplication method
  T multiply(T a, T b) {
    return a * b;
  }

  // Division method
  T divide(T a, T b) {
    if (b != 0) {
      return a / b;
    } else {
      cout << "Error: Division by zero!" << std::endl;
    }
  }
};

int main() {
  // Creating an instance of Arithmetic class for integer arithmetic
  Arithmetic<int> a;
  cout << "Addition (int): " << a.add(5, 3) << endl;
  cout << "Subtraction (int): " << a.subtract(5, 3) << endl;
  cout << "Multiplication (int): " << a.multiply(5, 3) << endl;
  cout << "Division (int): " << a.divide(6, 3) << endl;

  // Creating an instance of Arithmetic class for double arithmetic
  Arithmetic<double> b;
  cout << "Addition (double): " << b.add(5.5, 3.3) << endl;
  cout << "Subtraction (double): " << b.subtract(5.5, 3.3) << endl;
  cout << "Multiplication (double): " << b.multiply(5.5, 3.3) << endl;
  cout << "Division (double): " << b.divide(6.6, 3.3) << endl;

  return 0;
}
