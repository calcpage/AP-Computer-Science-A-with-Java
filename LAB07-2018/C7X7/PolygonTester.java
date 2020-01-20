/*
PolygonTester.java          MrG         2019.0306
purpose:            abstracting a polygon
required files:     PolygonTester.java          main class
                    Polygon.java                derived class
                    Point.java                  derived class
translator phase:   javac PolygonTester.java
interpreter phase:  java PolygonTester
*/

//main class
public class PolygonTester
{
    public static void main(String[] args)
    {
        Point p1 = new Point(1,1);
        Point p2 = new Point(3,2);
        Point p3 = new Point(4,4);
        Point p4 = new Point(2,5);

        Polygon foo = new Polygon();

        foo.addPoint(p1);
        foo.addPoint(p2);
        foo.addPoint(p3);
        foo.addPoint(p4);

        System.out.println("foo = " + foo);
        System.out.println("Perimeter = " + foo.getPerimeter());
        System.out.println("Area = " + foo.getArea());
    }
}