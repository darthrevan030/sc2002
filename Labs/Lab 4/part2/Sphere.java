package part2;

public class Sphere implements Shape
{
    private double radius;
    
    public Sphere(double radius)
    {
        this.radius = radius;
    }
    
    public double getArea()
    {
        // Surface area = 4πr²
        return 4 * Math.PI * radius * radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
}
