// Interface representing a shape
interface Shape {
    // Abstract method to calculate area
    double calculateArea();

    // Abstract method to display the shape
    void displayShape();
}

// Concrete class representing a circle
class Circle implements Shape {
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Override method to calculate area for circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override method to display the shape

    public void displayShape() {
        System.out.println("This is a circle");
    }
}

public class PureAbs {
    public static void main(String[] args) {
        // Creating a circle object
        Circle circle = new Circle(3);

        // Displaying the shape
        circle.displayShape();

        // Calculating and displaying the area of the circle
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
