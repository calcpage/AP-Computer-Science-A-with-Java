/*
PolygonTester.java  MrG 2018.0306
purpose:    abstracting a polygon with an ArrayList<Point>
required:   PolygonTester.java          main class
            Polygon.java                derived class
            Point.java                  utility class
translator: javac PolygonTester.java
interpreter:java PolygonTester
*/
public class PolygonTester
{
    public static void main(String[] args)
    {
        Point p1 = new Point(1,1);
        Point p2 = new Point(4,1);
        Point p3 = new Point(4,5);

        Polygon tri = new Polygon();

        tri.addPoint(p1);
        tri.addPoint(p2);
        tri.addPoint(p3);

        System.out.println("tri = " + tri);
        System.out.println("perimeter = " + tri.perimeter());
        System.out.println("area = " + tri.area());
    }
}