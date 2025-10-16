package part2;

public class Cone implements Shape
{
    private double radius;
    private double height;
    
    public Cone(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    
    public double getArea()
    {
        // Surface area = πr² + πr * slant_height
        // slant_height = sqrt(r² + h²)
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * radius + Math.PI * radius * slantHeight;
    }
}
