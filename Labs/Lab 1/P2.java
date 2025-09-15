import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("salary : $");
        int salary = input.nextInt();

        System.out.print("merit : ");
        int merit = input.nextInt();

        String grade = "";

        if (salary >= 500 && salary <= 649) {
            if (salary >= 600 && salary <= 649) {
                if (merit < 10) {
                    grade = "C";
                } else {
                    grade = "B";
                }
            } else {
                grade = "C";
            }
        } else if (salary >= 650 && salary <= 799) {
            if (salary >= 700 && salary <= 799) {
                if (merit < 20) {
                    grade = "B";
                } else {
                    grade = "A";
                }
            } else {
                grade = "B";
            }
        } else if (salary >= 800 &&  salary <= 899) {
            grade = "A";
        } else {
            System.out.println("Salary is outside the valid range");
            input.close();
            return;
        }

        System.out.println("Grade " + grade);

        input.close();
    }
}
