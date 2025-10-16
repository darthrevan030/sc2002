package part2;

public class Rectangle implements Shape
{
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea()
    {
        return length * breadth;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getBreadth()
    {
        return breadth;
    }
}
