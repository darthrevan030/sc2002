package part1;
import java.util.Scanner;
public class Numbers
{
    // --------------------------------------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    // --------------------------------------------
    public static void main (String[] args)
    {
        Integer[] intList;  // Changed from int[] to Integer[]
        int size;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print ("\nHow many integers do you want to sort? ");
            size = scan.nextInt();
            intList = new Integer[size];  // Changed from int[] to Integer[]
            System.out.println ("\nEnter the numbers...");
            for (int i = 0; i < size; i++)
                intList[i] = scan.nextInt();  // Autoboxing: int -> Integer
            Sorting.insertionSort(intList);
            System.out.println ("\nYour numbers in sorted order...");
            for (int i = 0; i < size; i++)
                System.out.print(intList[i] + " ");  // Auto-unboxing: Integer -> int
            System.out.println ();
        }
    }
}