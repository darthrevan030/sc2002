package part2;

public class Square implements Shape
{
    private final double side;
    
    public Square(double side)
    {
        this.side = side;
    }
    
    @Override
    public double getArea()
    {
        return side * side;
    }
    
    public double getSide()
    {
        return side;
    }
}
