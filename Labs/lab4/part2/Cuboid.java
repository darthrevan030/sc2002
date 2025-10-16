package part2;

public class Cuboid implements Shape
{
    private final double length;
    private final double breadth;
    private final double height;
    
    public Cuboid(double length, double breadth, double height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    @Override
    public double getArea()
    {
        // Surface area = 2(lb + bh + lh)
        return 2 * (length * breadth + breadth * height + length * height);
    }
}
