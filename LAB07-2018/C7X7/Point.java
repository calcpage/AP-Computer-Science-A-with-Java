//Point.java            MrG         2019.0228
public class Point extends Object implements Comparable<Point>
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public double getDistance()
    {
        return Math.sqrt(x*x + y*y);
    }

    public double getDirection()
    {
        return Math.atan(y/x);
    }

    public double getLength(Point other)
    {
        double a = this.getDistance();
        double b = other.getDistance();
        double C = this.getDirection()-other.getDirection();
        return Math.sqrt(a*a+b*b-2*a*b*Math.cos(C));
    }

    public int compareTo(Point other)
    {
        return (int)(getDistance()-other.getDistance());
    }

    public boolean equals(Object other)
    {
        Point temp = (Point)other;
        return this.compareTo(temp)==0;
    }
}











