import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your choice (A for Action, C for Comedy, D for Drama): \n");
            
            do {
                String userChoice = input.next().toUpperCase();

                switch (userChoice) {
                    case "A" -> System.out.println("Action movie fan\n");
                    case "C" -> System.out.println("Comedy movie fan\n");
                    case "D" -> System.out.println("Drama movie fan\n");
                    default -> System.out.println("Invalid choice\n");
                }
            } while (true);
        }
    }
}