import java.util.Scanner;

class Shop_exception extends Exception {
    // Constructor to initialize the exception
    Shop_exception() {
        super("Insufficient quantity or amount. Please try again.");
    }
}

class Shop {
    private int availableQuantity = 10;
    private double availableAmount = 2000;

    // Method to check availability of items and amount
    void items(int quantity, double amount) throws Shop_exception {
        if (availableQuantity < quantity || availableAmount < amount) {
            throw new Shop_exception();
        } else {
            System.out.println("Items purchased successfully.");
            availableQuantity -= quantity;
            availableAmount -= amount;
        }
    }
}

public class Shopme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items you want to buy: ");
        int quantity = sc.nextInt();
        System.out.println("Enter the total amount of items: ");
        double amount = sc.nextDouble();

        Shop shop = new Shop();
        try {
            shop.items(quantity, amount);
        } catch (Shop_exception e) {
            System.out.println("Error: " + e.getMessage());
            // Additional handling for the exception...
            sc.close();
        }
    }
}
