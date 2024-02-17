#include<iostream>
#include<string>

using namespace std;

class Student {
private:
    string fullName;
    double semPercentage;
    string collegeName;
    int collegeCode;

public:
    // Default constructor with default values
    Student() {
        collegeName = "MVGR";
        semPercentage = 100;
        collegeCode = 33;
        cout << "Default Constructor Called" << endl;
    }

    // Parameterized constructor
    Student(string name, double semPercent) {
        fullName = name;
        semPercentage = semPercent;
        collegeName = "MVGR";
        collegeCode = 33;
        cout << "Parameterized Constructor Called" << endl;
    }

    // Destructor
    ~Student() {
        cout << "Destructor Called" << endl;
    }

    // Display method to show the values of the object
    void displayValues() {
        cout << "Full Name: " << fullName << endl;
        cout << "Semester Percentage: " << semPercentage << endl;
        cout << "College Name: " << collegeName << endl;
        cout << "College Code: " << collegeCode << endl;
    }
};

int main() {
    // Creating objects using different constructors
    Student defaultStudent;  // Calls default constructor
    Student paramStudent("vamsi", 90);  // Calls parameterized constructor

    // Displaying values of objects
    cout << "Values of Default Student:" << endl;
    defaultStudent.displayValues();
    cout << endl;

    cout << "Values of Parameterized Student:" << endl;
    paramStudent.displayValues();

    return 0;
}
