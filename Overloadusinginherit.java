class Animal {
    // Method to make a sound
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overloading the makeSound() method from the superclass
    void makeSound(String sound) {
        System.out.println("Dog barks: " + sound);
    }
}

public class Overloadusinginherit {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Calling the makeSound() method of the superclass
        animal.makeSound();

        // Calling the makeSound() method of the subclass with different arguments
        dog.makeSound();
        dog.makeSound("Woof");
    }
}
