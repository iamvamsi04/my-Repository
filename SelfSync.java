public class SelfSync implements Runnable {
    // Shared variables
    static int number = 1;
    static Object lock = new Object();

    public void printTable(int tableNumber) {
        synchronized (lock) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));
            }
        }
    }

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("t1")) {
            printTable(2); // Print 2 table
        } else if (name.equals("t2")) {
            printTable(3); // Print 3 table
        }
    }

    public static void main(String[] args) {
        SelfSync s = new SelfSync();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
