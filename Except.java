import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Except{
    public static void main(String[] args) {
        // Checked exceptions
        try {
            FileInputStream fileInputStream = new FileInputStream("example.txt"); // FileNotFoundException
        } catch (FileNotFoundException obj) {
            System.out.println("File not found: " + obj.getMessage());
        }

        try {
            Class.forName("NonExistingClass"); // ClassNotFoundException
        } catch (ClassNotFoundException obj) {
            System.out.println("Class not found: " + obj.getMessage());
        }

        try {
            File file = new File("example.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.close(); // IOException
        } catch (FileNotFoundException obj) {
            System.out.println("File not found: " + obj.getMessage());
        } catch (IOException obj) {
            System.out.println("Error reading file: " + obj.getMessage());
        }

        // Unchecked exceptions
        try {
            int[] arr = new int[3];
            System.out.println(arr[4]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println("Array index out of bounds: " + obj.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException obj) {
            System.out.println("Null pointer exception: " + obj.getMessage());
        }

        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException obj) {
            System.out.println("Arithmetic exception: " + obj.getMessage());
        }
    }
}
