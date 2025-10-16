package part2;

import java.util.Scanner;

public class Shape2DApp
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the total number of shapes: ");
            int numShapes = sc.nextInt();
            
            Shape[] shapes = new Shape[numShapes];
            
            // Input shapes
            for (int i = 0; i < numShapes; i++)
            {
                System.out.println("\nShape " + (i + 1));
                System.out.println("1. Circle");
                System.out.println("2. Triangle");
                System.out.println("3. Rectangle");
                System.out.println("4. Square");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                
                switch (choice)
                {
                    case 1 -> {
                        System.out.print("Enter radius: ");
                        double radius = sc.nextDouble();
                        shapes[i] = new Circle(radius);
                    }
                    case 2 -> {
                        System.out.print("Enter base: ");
                        double base = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double height = sc.nextDouble();
                        shapes[i] = new Triangle(base, height);
                    }
                    case 3 -> {
                        System.out.print("Enter length: ");
                        double length = sc.nextDouble();
                        System.out.print("Enter breadth: ");
                        double breadth = sc.nextDouble();
                        shapes[i] = new Rectangle(length, breadth);
                    }
                    case 4 -> {
                        System.out.print("Enter side: ");
                        double side = sc.nextDouble();
                        shapes[i] = new Square(side);
                    }
                    default -> {
                        System.out.println("Invalid choice!");
                        i--; // Retry this shape
                    }
                }
            }
            
            // Calculate total area
            System.out.print("\nDo you want to calculate area? (y/n): ");
            char calc = sc.next().charAt(0);
            
            if (calc == 'y' || calc == 'Y')
            {
                double totalArea = 0;
                for (int i = 0; i < numShapes; i++)
                {
                    totalArea += shapes[i].getArea();
                }
                System.out.printf("\nTotal area of 2D figure: %.2f\n", totalArea);
            }
        }
    }
}
