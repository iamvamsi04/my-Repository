import java.util.Scanner;

class Parallelogram {
    public float diagonal1, diagonal2, angle, result;

    public float areaOfParallelogram(float d1, float d2, float angle) {
        float angle1 = (float) (angle * Math.PI / 180);
        result = 0.5f * (d1 * d2) * (float) Math.sin(angle1);
        return result;
    }
}

class Rectangle extends Parallelogram {
    public float length, breadth, result;

    public float areaOfRectangle(float length, float breadth) {
        result = length * breadth;
        return result;
    }
}

public class Simpleinherit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle obj1 = new Rectangle();

        System.out.println("To find the area of Parallelogram");
        System.out.println("Enter lengths of two diagonals and angle between them: ");
        obj1.diagonal1 = scanner.nextFloat();
        obj1.diagonal2 = scanner.nextFloat();
        obj1.angle = scanner.nextFloat();
        obj1.result = obj1.areaOfParallelogram(obj1.diagonal1, obj1.diagonal2, obj1.angle);
        System.out.println("Area of parallelogram is " + obj1.result);

        System.out.println("To find the area of rectangle");
        System.out.println("Enter lengths of two length and breadth: ");
        obj1.length = scanner.nextFloat();
        obj1.breadth = scanner.nextFloat();
        obj1.result = obj1.areaOfRectangle(obj1.length, obj1.breadth);
        System.out.println("Area of rectangle is " + obj1.result);
        scanner.close();
    }
}
