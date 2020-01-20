//Polygon.java              MrG         3019.0306
import java.util.ArrayList;
public class Polygon
{
    private ArrayList<Point> points;

    public Polygon()
    {
        points = new ArrayList<Point>();
    }

    public void addPoint(Point p)
    {
        points.add(p);
    }

    public String toString()
    {
        return points.toString();
    }

    public double getPerimeter()
    {
        double sum = 0;
        for(int i = 0; i < points.size(); i++)
        {
            sum+=points.get(i).getLength(points.get((i+1)%points.size()));
        }
        return sum;
    }

    public double getArea()
    {
        double sum = 0;
        for(int i = 0; i < points.size(); i++)
        {
            sum+=points.get(i).getX()*points.get((i+1)%points.size()).getY();
            sum-=points.get(i).getY()*points.get((i+1)%points.size()).getX();
        }
        return Math.abs(sum/2);
    }
}






