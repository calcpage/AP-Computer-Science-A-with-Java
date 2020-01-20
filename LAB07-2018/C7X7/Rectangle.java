//Rectangle.java             MrG             2019.0308
public class Rectangle extends Polygon
{
    private double l;
    private double w;

    public Rectangle(Point p1, Point p2, Point p3, Point p4)
    {
        addPoint(p1);
        addPoint(p2);
        addPoint(p3);
        addPoint(p4);
        l=p1.getLength(p2);
        w=p2.getLength(p3);
    }
/*
    public double getPerimeter()
    {
        return 2*(l+w);
    }

    public double getArea()
    {
        return l*w;
    }
*/
}