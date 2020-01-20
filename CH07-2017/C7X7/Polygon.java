//Polygon.java MrG 2018.0306
import java.util.ArrayList;
public class Polygon
{
    private ArrayList<Point> corners;

    public Polygon()
    {
        corners = new ArrayList<Point>();
    }

    public void addPoint(Point p)
    {
        corners.add(p);
    }

    public String toString()
    {
        String temp="";
        for(Point p: corners)
        {
            temp+=p.toString();
        }
        return temp;
        //return corners.toString();
    }

    public double perimeter()
    {
        double sum=0.0;
        for(int i=0; i<corners.size(); i++)
        {
            sum+=corners.get(i).length(corners.get((i+1)%corners.size()));
        }
        return sum;
    }

    public double area()
    {
        double sum=0.0;
        for(int i=0; i<corners.size(); i++)
        {
            sum+=corners.get(i).getX()*corners.get((i+1)%corners.size()).getY();
            sum-=corners.get(i).getY()*corners.get((i+1)%corners.size()).getX();
        }
        return Math.abs(sum)/2;
    }
}