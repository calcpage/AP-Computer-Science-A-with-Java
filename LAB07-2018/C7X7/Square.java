//Square.java             MrG             2019.0308
public class Square extends Rectangle
{
    private double s;

    public Square(Point p1, Point p2, Point p3, Point p4)
    {
        super(p1, p2, p3, p4);
        s = p1.getLength(p2);
    }

    public double getPerimeter()
    {
        return 4*s;
    }

    public double getArea()
    {
        return Math.pow(s,2);
    }
}