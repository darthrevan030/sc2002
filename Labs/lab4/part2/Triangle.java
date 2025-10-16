package part2;

public class Triangle implements Shape
{
    private final double base;
    private final double height;
    
    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea()
    {
        return 0.5 * base * height;
    }
    
    public double getBase()
    {
        return base;
    }
    
    public double getHeight()
    {
        return height;
    }
}