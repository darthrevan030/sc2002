package part2;

public class Cylinder implements Shape
{
    private final double radius;
    private final double height;
    
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double getArea()
    {
        // Surface area = 2πr² + 2πrh (two circles + curved surface)
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}