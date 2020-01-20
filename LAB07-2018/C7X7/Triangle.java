//Triangle.java             MrG             2019.0308
public class Triangle extends Polygon
{
    private double a;
    private double b;
    private double c;

    public Triangle(Point p1, Point p2, Point p3)
    {
        addPoint(p1);
        addPoint(p2);
        addPoint(p3);
        a=p1.getLength(p2);
        b=p2.getLength(p3);
        c=p3.getLength(p1);
    }

    public double getPerimeter()
    {
        return a+b+c;
    }

    public double getArea()
    {
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}