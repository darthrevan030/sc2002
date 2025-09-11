import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: /* add mulTest() call */

                    break;
                case 2: /* add divide() call */
                    break;
                case 3: /* add modulus() call */
                    break;
                case 4: /* add countDigits() call */
                    break;
                case 5: /* add position() call */
                    break;
                case 6: /* add extractOddDigits() call */
                    break;
                case 7: System.out.println("Program terminating...");
            }
        } while (choice < 7);
    }

    public static void mulTest(String[] args) {
        /*
        Write a method that is to test students ability to do multiplication. The method will ask a student 5
        multiplication questions one by one and checks the answers. The method prints out the number of
        correct answers given by the student. The method random() from the Math class of the Java library
        can be used to produce two positive one-digit integers (i.e. 1,2,3,4, …) in each question. A sample
        screen display when the method is called is given below:
        How much is 6 times 7? 42
        How much is 2 times 9? 18
        How much is 9 times 4? 36

        4 answers out of 5 are correct.
        The input which is underlined is the student’s answer to a question
        */
    
    }

    public static void divide(int m, int n){
    /*
    Write the method divide() which does division by subtraction and returns the quotient of dividing m by
    n. Both m and n are positive integers (i.e. 1,23,4,…). Division by subtraction means that the division
    operation is achieved using the subtraction method. For example, divide(12,4) will be performed as
    follows: 12-4=8, 8-4=4, and then 4-4=0, and it ends and returns the result of 3 as it performs three
    times in the subtraction operation. No error checking on the parameters is required in the method. 
    */
    }

    public static int modulus(int m, int n){
    /*
    Write the method modulus() which does division by subtraction and returns the remainder of dividing
    m by n. Both m and n are positive integers. No error checking on the parameters is required in the
    method.
    */
    }

    public static int countDigits(int n){
    /*
    Write a method to count the number of digits for a positive integer (i.e. 1,2,3,4,…). For example, 1234
    has 4 digits. The method countDigits() returns the result.
    */
    }

    public static int position(int n, int digit) {
    /*
    Write the method position() which returns the position of the first appearance of a specified digit in a
    positive number n. The position of the digit is counted from the right and starts from 1. If the required
    digit is not in the number, the method should return -1. For example, position(12315, 1) returns 2 and
    position(12, 3) returns -1. No error checking on the parameters is required in the method. 
    */
    }



    public static long extractOddDigits(long n){
    /*
    Write a method extractOddDigits() which extracts the odd digits from a positive number n, and
    combines the odd digits sequentially into a new number. The new number is returned back to the
    calling method. If the input number n does not contain any odd digits, then returns -1. For examples, if
    n=1234567, then 1357 is returned; and if n=28, then –1 is returned.
    */
    }

}
