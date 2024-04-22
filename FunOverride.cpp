#include <iostream>
using namespace std;

// Base class
class Animal {
public:
    // Virtual function to make it possible to override
    virtual void makeSound() {
        cout << "Animal makes a sound" << endl;
    }
};

// Derived class
class Dog : public Animal {
public:
    // Overriding the makeSound() function of the base class
    void makeSound() override {
        cout << "Dog barks" << endl;
    }
};

int main() {
    // Base class object
    Animal animal;
    // Derived class object
    Dog dog;

    // Calling the makeSound() function of the base class object
    animal.makeSound();
    // Calling the makeSound() function of the derived class object
    dog.makeSound();

    return 0;
}
