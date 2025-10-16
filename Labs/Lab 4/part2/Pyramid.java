package part2;

public class Pyramid implements Shape
{
    private final double base;  // side of square base
    private final double height;
    
    public Pyramid(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea()
    {
        // Surface area = base² + 2 * base * slant_height
        // slant_height = sqrt(height² + (base/2)²)
        double slantHeight = Math.sqrt(height * height + (base / 2) * (base / 2));
        return base * base + 2 * base * slantHeight;
    }
}
