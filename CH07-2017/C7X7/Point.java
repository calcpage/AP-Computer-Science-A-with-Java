//Point.java    MrG     2018.0227
public class Point extends Object implements Comparable<Point>
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return "("+x+","+y+")";
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double length(Point other)
    {
        double deltaX = this.getX()-other.getX();
        double deltaY = this.getY()-other.getY();
        return Math.sqrt(deltaX*deltaX+deltaY*deltaY);
    }

    public boolean equals(Object other)
    {
        Point temp = (Point)other;
        return x==temp.getX() && y==temp.getY();
    }

    public int compareTo(Point other)
    {
        //if(this.length(new Point(0,0))>temp.length(new Point(0,0)))
        //{
            //return 1;
        //}
        //if(this.length(new Point(0,0))<temp.length(new Point(0,0)))
        //{
            //return -1;
        //}
        //return 0;
        return (int)(this.distance()-other.distance());
    }

    public double distance()
    {
        return Math.sqrt(x*x+y*y);
    }
}









