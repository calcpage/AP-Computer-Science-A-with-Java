/*
LineTester.java             MrG         2018.1211
purpose:            abstract a line in the plane
require files:      LineTester.java         main class
                    Line.java               derived class
translator phase:   javac LineTester.java
interpreter phase:  java LineTester
*/

//imported classes
import java.util.Scanner;

//main class
public class LineTester
{
    public static void main(String[] args)
    {
        Scanner frank = new Scanner(System.in);

        System.out.print("m=?");
        double m = frank.nextDouble();
        System.out.print("b=?");
        double b = frank.nextDouble();
        Line luke = new Line(m,b);
        System.out.println("l1: " + luke);

        System.out.print("x=?");
        double x = frank.nextDouble();
        System.out.print("y=?");
        double y = frank.nextDouble();
        System.out.print("m=?");
        m = frank.nextDouble();
        Line jack = new Line(x,y,m);
        System.out.println("l2: " + jack);


        System.out.println();
        if(luke.isParallel(jack))
        {
            System.out.println("l1 is parallel to l2");
        }
        else
        {
            System.out.println("l1 is NOT parallel to l2");
        }

        if(luke.intersects(jack))
        {
            System.out.println("POI x = " + luke.getX(jack));
            System.out.println("POI y = " + luke.getY(jack));
        }
        else
        {
            System.out.println("l1 does NOT intersect l2");
        }

        if(luke.equals(jack))
        {
            System.out.println("l1 = l2");
        }
        else    if(luke.compareTo(jack)>0)
                {
                    System.out.println("l1>l2");
                }
                else
                {
                    System.out.println("l1<l2");
                }
        /*
        System.out.println();
        System.out.print("x1=?");
        double x1 = frank.nextDouble();
        System.out.print("y1=?");
        double y1 = frank.nextDouble();
        System.out.print("x2=?");
        double x2 = frank.nextDouble();
        System.out.print("y2=?");
        double y2 = frank.nextDouble();
        Line sean = new Line(x1,y1,x2,y2);
        System.out.println("l3: " + sean);
        */
    }
}