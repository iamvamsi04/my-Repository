public class OverLoad {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to concatenate two strings
    String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        OverLoad math = new OverLoad();

        // Call the add methods with different types of arguments
        System.out.println("Sum of integers: " + math.add(3, 4));
        System.out.println("Sum of three integers: " + math.add(3, 4, 5));
        System.out.println("Sum of doubles: " + math.add(3.5, 4.5));
        System.out.println("Concatenated strings: " + math.add("Hello, ", "world!"));
    }
}
