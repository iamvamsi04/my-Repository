// Abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();

    // Concrete method to display the shape
    void displayShape() {
        System.out.println("This is a shape");
    }
}

// Concrete subclass representing a circle
class Circle extends Shape {
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Override method to calculate area for circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Partialabs {
    public static void main(String[] args) {
        // Creating a circle object
        Circle circle = new Circle(3);

        // Displaying the shape
        circle.displayShape();

        // Calculating and displaying the area of the circle
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
