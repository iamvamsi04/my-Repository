import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        // Input username
        System.out.print("Enter your username to greet: ");
        String username = ip.nextLine();  // Corrected: use 'ip' instead of 'scanner'

        // Display greeting with the entered username
        System.out.println("Hello '" + username + "'!");

        // Close the scanner
        ip.close();
    }
}
