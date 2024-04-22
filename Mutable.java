public class Mutable {
    public static void main(String[] args) {
        // Mutable example with int
        int num1 = 89;
        System.out.println("Value of num1: " + num1 + "\nAddress of num1: " + System.identityHashCode(num1));
        num1 = 680;
        System.out.println("Value of num1: " + num1 + "\nAddress of num1: " + System.identityHashCode(num1));

        // Mutable example with double
        double num2 = 38.3;
        System.out.println("Value of num2: " + num2 + "\nAddress of num2: " + System.identityHashCode(num2));
        num2 = 8.305658;
        System.out.println("Value of num2: " + num2 + "\nAddress of num2: " + System.identityHashCode(num2));

        // Immutable example with String
        String str1 = "CSE";
        System.out.println("Value of str1: " + str1 + "\nAddress of str1: " + System.identityHashCode(str1));
        str1 = "MVGR CSE";
        System.out.println("Value of str1: " + str1 + "\nAddress of str1: " + System.identityHashCode(str1));
    }
}
