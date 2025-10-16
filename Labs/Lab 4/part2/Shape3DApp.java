package part2;

import java.util.Scanner;

public class Shape3DApp
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the total number of 3D shapes: ");
            int numShapes = sc.nextInt();
            
            Shape[] shapes = new Shape[numShapes];
            
            // Input shapes
            for (int i = 0; i < numShapes; i++)
            {
                System.out.println("\n3D Shape " + (i + 1));
                System.out.println("1. Sphere");
                System.out.println("2. Pyramid (Square-based)");
                System.out.println("3. Cuboid");
                System.out.println("4. Cone");
                System.out.println("5. Cylinder");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                
                switch (choice)
                {
                    case 1 -> {
                        System.out.print("Enter radius: ");
                        double radius = sc.nextDouble();
                        shapes[i] = new Sphere(radius);
                    }
                    case 2 -> {
                        System.out.print("Enter base (side of square): ");
                        double base = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double height = sc.nextDouble();
                        shapes[i] = new Pyramid(base, height);
                    }
                    case 3 -> {
                        System.out.print("Enter length: ");
                        double length = sc.nextDouble();
                        System.out.print("Enter breadth: ");
                        double breadth = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double height3 = sc.nextDouble();
                        shapes[i] = new Cuboid(length, breadth, height3);
                    }
                    case 4 -> {
                        System.out.print("Enter radius: ");
                        double radiusCone = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double heightCone = sc.nextDouble();
                        shapes[i] = new Cone(radiusCone, heightCone);
                    }
                    case 5 -> {
                        System.out.print("Enter radius: ");
                        double radiusCyl = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double heightCyl = sc.nextDouble();
                        shapes[i] = new Cylinder(radiusCyl, heightCyl);
                    }
                    default -> {
                        System.out.println("Invalid choice!");
                        i--; // Retry this shape
                    }
                }
            }
            
            // Calculate total surface area
            System.out.print("\nDo you want to calculate surface area? (y/n): ");
            char calc = sc.next().charAt(0);
            
            if (calc == 'y' || calc == 'Y')
            {
                double totalArea = 0;
                for (int i = 0; i < numShapes; i++)
                {
                    totalArea += shapes[i].getArea();
                }
                System.out.printf("\nTotal surface area of 3D figure: %.2f\n", totalArea);
            }
        }
    }
}
