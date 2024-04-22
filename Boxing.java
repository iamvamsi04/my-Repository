public class Boxing {
    public static void main(String[] args) {
        // Boxing: Converting primitive types to wrapper classes
        int intValue = 10;
        Integer integerValue = Integer.valueOf(intValue); // Boxing int to Integer

        double doubleValue = 3.14;
        Double doubleObject = Double.valueOf(doubleValue); // Boxing double to Double

        // Unboxing: Converting wrapper classes to primitive types
        int unboxedIntValue = integerValue.intValue(); // Unboxing Integer to int

        double unboxedDoubleValue = doubleObject.doubleValue(); // Unboxing Double to double

        // Displaying results
        System.out.println("Boxed Integer value: " + integerValue);
        System.out.println("Boxed Double value: " + doubleObject);
        System.out.println("Unboxed Integer value: " + unboxedIntValue);
        System.out.println("Unboxed Double value: " + unboxedDoubleValue);
    }
}
