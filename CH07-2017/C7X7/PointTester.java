/*
PointTester.java    MrG     2018.0227
purpose:    abstracting a point object like (x,y)
required:   PointTester.java       main class
            Point.java             derived class
translator: javac PointTester.java
interpreter:java PointTester
*/

public class PointTester
{
    public static void main(String[] args)
    {
        Point p1 = new Point(3,4);
        Point p2 = new Point(3,4);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        System.out.print("length of line segment from p1 to p2: ");
        System.out.println(p1.length(p2));

        if(p1.equals(p2))
        {
            System.out.println("p1 is the same point as p2");
        }
        else
        {
            System.out.println("p1 is NOT the same point as p2");
        }

        if(p1.compareTo(p2)>0)
        {
            System.out.println("p1>p2");
        }
        if(p1.compareTo(p2)<0)
        {
            System.out.println("p1<p2");
        }
        if(p1.compareTo(p2)==0)
        {
            System.out.println("p1==p2");
        }
    }
}