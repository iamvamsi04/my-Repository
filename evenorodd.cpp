#include <iostream>

using namespace std;

// Function to check whether a number is even or odd
bool isEven(int number) {
    return (number % 2 == 0);
}

int main() {
    int number;
    cout << "Enter a number: ";
    cin >> number;
    if (isEven(number)) {
        cout << number << " is even." << endl;
    } 
     else {
        cout << number << " is odd." << endl;
    }

    return 0;
}
