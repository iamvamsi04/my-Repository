public class Override {
    // Method to set an integer value
    void setValue(int value) {
        System.out.println("Setting integer value: " + value);
    }
    void setValue(double value) {
        System.out.println("Setting double value: " + value);
    }
}

class Test {
    public static void main(String[] args) {
        Override obj = new Override();
        obj.setValue(10);       // Setting integer value: 10
        obj.setValue(15.5);     // Setting double value: 15.5
    }
}
