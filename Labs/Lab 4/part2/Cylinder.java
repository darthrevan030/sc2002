package part2;

public class Cylinder implements Shape
{
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    
    public double getArea()
    {
        // Surface area = 2πr² + 2πrh (two circles + curved surface)
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}