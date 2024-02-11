#include <iostream>

using namespace std;

int main() {
    // Declare variables to store user input and result
    double num1, num2, result;
    int choice;

    // Prompt the user to enter two numbers
    cout << "Enter first number: ";
    cin >> num1;

    cout << "Enter second number: ";
    cin >> num2;

    // Display the menu
    cout << "Choose an operation:" << endl;
    cout << "1. Addition" << endl;
    cout << "2. Subtraction" << endl;
    cout << "3. Multiplication" << endl;
    cout << "4. Division" << endl;
    cout << "Enter your choice (1-4): ";
    cin >> choice;

    // Perform arithmetic operations based on user choice
    switch (choice) {
        case 1:
            result = num1 + num2;
            cout << "Result: " << num1 << " + " << num2 << " = " << result << endl;
            break;
        case 2:
            result = num1 - num2;
            cout << "Result: " << num1 << " - " << num2 << " = " << result << endl;
            break;
        case 3:
            result = num1 * num2;
            cout << "Result: " << num1 << " * " << num2 << " = " << result << endl;
            break;
        case 4:
            // Check for division by zero
            if (num2 != 0) {
                result = num1 / num2;
                cout << "Result: " << num1 << " / " << num2 << " = " << result << endl;
            } else {
                cout << "Error: Division by zero is not allowed." << endl;
                return 1;  // Return 1 to indicate an error
            }
            break;
        default:
            cout << "Error: Invalid choice. Please enter a number between 1 and 4." << endl;
            return 1;  // Return 1 to indicate an error
    }

    return 0;
}
