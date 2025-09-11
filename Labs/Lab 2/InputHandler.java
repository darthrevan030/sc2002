import java.util.Scanner;

public class InputHandler {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            
            while (true) {
                System.out.print("Enter a positive integer: ");
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    if (number >= 0) { // Check for positivity (or non-negativity)
                        break;
                    } else {
                        System.out.println("Negative numbers are not allowed. Please enter a positive integer.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next();
                }
            }
            System.out.println("You entered: " + number);
        }
    }
}