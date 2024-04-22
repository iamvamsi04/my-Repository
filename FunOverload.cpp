#include <iostream>
using namespace std;

class MathOperations {
public:
    // Overloaded method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to concatenate two strings
    string add(const string& str1, const string& str2) {
        return str1 + str2;
    }
};

int main() {
    MathOperations math;

    // Call the add method with different types of arguments
    cout << "Sum of integers: " << math.add(3, 4) << endl;
    cout << "Sum of doubles: " << math.add(3.5, 4.5) << endl;
    cout << "Concatenated strings: " << math.add("Hello, ", "world!") << endl;

    return 0;
}
