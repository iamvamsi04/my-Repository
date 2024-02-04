import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	// Input a number
    	System.out.print("Enter a number: ");
    	int number = scanner.nextInt();
		if(number!=0){
    	// Check if the number is even or odd
    	if (isEven(number) ) {
        	System.out.println(number + " is even.");
    	} else {
        	System.out.println(number + " is odd.");
    	}
		}
    	// Check if the number is zero
    	if (number == 0) {
        	System.out.println("Enter a number other than 0.");
    	}

    	// Close the scanner
    	scanner.close();
	}

	// Function to check if a number is even
	public static boolean isEven(int num) {
    	return num % 2 == 0;
	}





        
