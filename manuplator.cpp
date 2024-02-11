#include <iostream>
#include <iomanip>

int main() {
    // Using endl manipulator
    std::cout << "Using endl:" << std::endl;
    std::cout << "Line 1" << std::endl;
    std::cout << "Line 2" << std::endl;

    // Using ends manipulator
    std::cout << "\nUsing ends:" << std::endl;
    std::cout << "Part 1" << std::ends;
    std::cout << "Part 2" << std::endl;

    // Using ws manipulator
    std::cout << "\nUsing ws:" << std::endl;
    std::cout << "   NoWhitespaceBefore" << std::ws << "   WithWhitespaceAfter" << std::endl;

    // Using flush manipulator
    std::cout << "\nUsing flush:" << std::flush;
    std::cout << "This will be flushed immediately." << std::endl;

    // Using setw and setfill manipulators
    std::cout << "\nUsing setw and setfill:" << std::endl;
    std::cout << std::setw(10) << std::setfill('*') << "Hello" << std::setw(10) << "World" << std::endl;

    // Using setprecision manipulator
    std::cout << "\nUsing setprecision:" << std::endl;
    double pi = 3.14159265358979323846;
    std::cout << "Default precision: " << std::setprecision(10) << pi << std::endl;
    std::cout << "Precision 2: " << std::setprecision(2) << pi << std::endl;

    return 0;
}
