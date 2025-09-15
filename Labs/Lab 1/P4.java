import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input values
        System.out.print("height = ");
        int height = input.nextInt();
        
        input.close();
        
        // Check for error case
        if (height <= 0) {
            System.out.println("Error input!!");
            input.close();
            return;
        }
        
        for (int line = 1; line <= height; line++){
            String pattern = "";

            if (line % 2 == 1){
                for (int pair = 0; pair < line; pair++){
                    if (pair % 2 == 0){
                        pattern += "AA";
                    } else {
                        pattern += "BB";
                    }
                }
            } else {
                for (int pair = 0; pair < line; pair++){
                    if (pair % 2 == 0){
                        pattern += "BB";
                    } else {
                        pattern += "AA";
                    }
                }
            }

            System.out.println(pattern);
        }

        input.close();
    }
}