import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter two numbers to perform an arithmetic operation of your choice\n ");
        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = ip.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = ip.nextDouble();

        // Choose arithmetic operation
        System.out.println("Choose an operation from the list given below");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = ip.nextInt();  
        double result = 0.0;

        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                return; // Exit the program
            }
        } else {
            System.out.println("Invalid choice. Please choose a number between 1 and 4.");
            return; // Exit the program
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        ip.close();
    }
}

