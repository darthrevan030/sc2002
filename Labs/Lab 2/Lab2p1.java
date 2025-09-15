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
            
            // Lab 2 Question 1
            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest();
                    break;

                case 2: /* add divide() call */
                    System.out.println("Enter m: ");
                    int m1 = sc.nextInt();
                    System.out.println("Enter n: ");
                    int n1 = sc.nextInt();
                    System.out.println(m1 + "/" + n1 + " = " + divide(m1, n1));
                    break;

                case 3: /* add modulus() call */
                    System.out.println("Enter m: ");
                    int m2 = sc.nextInt();
                    System.out.println("Enter n: ");
                    int n2 = sc.nextInt();
                    System.out.println(m2 + "%" + n2 + " = " + modulus(m2, n2));
                    break;

                case 4: /* add countDigits() call */
                    System.out.println("Enter n (a Positive Integer): ");
                    int n3 = sc.nextInt();

///////////////////// Attempt to sanitize the input //////////////////////////////////////////////////////////////////
                    // while (true) {
                    //     if (sc.hasNextInt()){
                    //         n3 = sc.nextInt();
                    //         if (n3 > 0){
                    //             break;
                    //         } else {
                    //             System.out.println("Negative Numbers are not allowed! Enter a Positive Integer: ");
                    //         }
                    //     } else {
                    //         System.out.println("Non-Integer Numbers are not allowed! Enter a Positive Integer :");
                    //         n3 = sc.nextInt();
                    //     }
                    // }
/////////////////////////////// End of Attempt /////////////////////////////////////////////////////////////////////////////
                    
                    int countDigitsResult = countDigits(n3);
                    if (countDigitsResult != -1){
                        System.out.println("n : " + n3 + " - count = " + countDigitsResult);
                    }
                    break;

                case 5: /* add position() call */
                    System.out.println("Enter n: ");
                    int n4 = sc.nextInt();
                    
                    System.out.println("Enter digit: ");
                    int digit = sc.nextInt();

                    int positionResult = position(n4, digit);
                    System.err.println("position = " + positionResult);
                    break;

                case 6: /* add extractOddDigits() call */
                    System.out.println("Enter n: ");    
                    int n5 = sc.nextInt();

                    long oddDigitResult = extractOddDigits(n5);

                    System.err.println("oddDigits = " + oddDigitResult);
                    break;

                case 7: System.out.println("Program terminating...");
            }
        } while (choice < 7);
        sc.close();
    }

    // Lab 2 Question 2
    public static void mulTest() {
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
        Scanner sc = new Scanner(System.in);
        int countCorrectAns = 0;
        
        for (int i = 0; i < 5; i++){
            int num1 = (int)(Math.random() * 9) + 1;
            int num2 = (int)(Math.random() * 9) + 1;
            int correctAns = num1 * num2;

            System.out.println("How much is " + num1 + " times " + num2 + "?");
            int userAns = sc.nextInt();

            if (userAns == correctAns){
                countCorrectAns++;
            }
        }

        System.err.println(countCorrectAns + " answers out of 5 are correct.");
    }
    
    // Lab 2 Question 3
    public static int divide(int m, int n){
    /*
    Write the method divide() which does division by subtraction and returns the quotient of dividing m by
    n. Both m and n are positive integers (i.e. 1,23,4,…). Division by subtraction means that the division
    operation is achieved using the subtraction method. For example, divide(12,4) will be performed as
    follows: 12-4=8, 8-4=4, and then 4-4=0, and it ends and returns the result of 3 as it performs three
    times in the subtraction operation. No error checking on the parameters is required in the method. 
    */

    int result = 0;
    while(m >= n){
        m = m - n;
        result++;
    }
    return result;
    }

    // Lab 2 Question 4
    public static int modulus(int m, int n){
    /*
    Write the method modulus() which does division by subtraction and returns the remainder of dividing
    m by n. Both m and n are positive integers. No error checking on the parameters is required in the
    method.
    */
    while(m >= n){
        m = m - n;
    }
    return m;

    }

    // Lab 2 Question 5
    public static int countDigits(int n){
    /*
    Write a method to count the number of digits for a positive integer (i.e. 1,2,3,4,…). For example, 1234
    has 4 digits. The method countDigits() returns the result.
    */
    int numDigits = 0;

    if (n < 0) {
        System.out.println("n: " + n + "Error Input!! Input a Positive Integer");
    }
    if (n == 0){
        return 1;
    }

    while (n > 0){
        n = n/10;
        numDigits++;
    }
    return numDigits;
    }

    // Lab 2 Question 6
    public static int position(int n, int digit) {
    /*
    Write the method position() which returns the position of the first appearance of a specified digit in a
    positive number n. The position of the digit is counted from the right and starts from 1. If the required
    digit is not in the number, the method should return -1. For example, position(12315, 1) returns 2 and
    position(12, 3) returns -1. No error checking on the parameters is required in the method. 
    */

////////// counting from the back using the previous qn method /////////////////////////
    int numDigits = countDigits(n);
    int digitPosition = numDigits;

    for (int i = numDigits; i > 0; i--){
        int curDigit = n % 10;
        if (curDigit == digit){
            return digitPosition;
        }
        n = n/10;
        digitPosition--;
    }

    return -1;

///////// counting from the front - no dependency //////////////////////////////////
    // int position = 1;
        
    //     while (n > 0) {
    //         int currentDigit = n % 10;
    //         if (currentDigit == digit) {
    //             return position;
    //         }
    //         n = n / 10;
    //         position++;
    //     }
        
    //     return -1; // digit not found
    }

    // Lab 2 Question 7
    public static long extractOddDigits(long n){
    /*
    Write a method extractOddDigits() which extracts the odd digits from a positive number n, and
    combines the odd digits sequentially into a new number. The new number is returned back to the
    calling method. If the input number n does not contain any odd digits, then returns -1. For examples, if
    n=1234567, then 1357 is returned; and if n=28, then –1 is returned.
    */

    if (n <= 0){
        return -1;
    }


    long oddNum = 0;
    long multiplier = 1;
    boolean foundOddDigit = false;

    while (n > 0){
        long digit = n % 10;

        if (digit % 2 == 1){
            oddNum = digit * multiplier + oddNum;
            multiplier *= 10;
            foundOddDigit = true;
        }
        n /= 10;
    }
    
    // return oddNum if foundOddDigit == true, else return -1
    return foundOddDigit ? oddNum : -1;
    }

}
