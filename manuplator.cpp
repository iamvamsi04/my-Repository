##include <iostream>
#include <iomanip>
#include <string>

using namespace std;

int main() {
    cout << "endl usage is as follow" << endl;
    cout << "Hi" << endl;
    cout << "Linux" << endl;
    cout << "            " << endl;

    cout << "ends usage is as follow" << endl;
    cout << "Hello" << ends;
    cout << "I AM HERE NOW" << ends;
    cout << "            " << endl;
    cout << "            " << endl;

    cout << "ws usage is as follow" << endl;
    string name;
    cout << "Enter your name : " << endl;
    cin >> ws >> name;
    cout << "hello  " << name << endl;
    cout << "            " << endl;

    cout << "flush usage is as follow" << endl;
    cout << "Example of a flush" << flush;
    cout << "            " << endl;
    cout << "            " << endl;

    cout << "setw usage is as follow" << endl;
    cout << setw(5) << 1 << endl;
    cout << setw(5) << 10 << endl;
    cout << setw(5) << 100 << endl;
    cout << "            " << endl;

    cout << "setfill usage is as follow" << endl;
    cout << setfill('+') << setw(5) << 3 << endl;
    cout << setfill('#') << setw(5) << 40 << endl;
    cout << setfill('-') << setw(5) << 500 << endl;
    cout << "            " << endl;

    cout << "setprecision usage is as follow" << endl;
    cout << setprecision(2) << 4.56788543334 << endl;
    cout << setprecision(4) << 50.9366487 << endl;
    cout << setprecision(5) << 900.8356458965 << endl;
    cout << "            " << endl;

    return 0;
}

