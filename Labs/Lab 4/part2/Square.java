package part2;

public class Square implements Shape
{
    private double side;
    
    public Square(double side)
    {
        this.side = side;
    }
    
    public double getArea()
    {
        return side * side;
    }
    
    public double getSide()
    {
        return side;
    }
}
