/*
PointTester.java            MrG         2019.0227
purpose:            abstract a Point(x,y)
required files:     PointTester.java        main class
                    Point.java              derived class
translator phase:   javac PointTester.java
interpreter phase:  java PointTester
*/

public class PointTester
{
    public static void main(String[] args)
    {
        Point foo = new Point(3,8);
        Point bar = new Point(6,8);

        System.out.println("foo = " + foo);
        System.out.println("bar = " + bar);

        System.out.println("foo's dist = " + foo.getDistance());
        System.out.println("bar's dist = " + bar.getDistance());

        System.out.println("foo's dir = " + foo.getDirection()*180/Math.PI);
        System.out.println("bar's dir = " + bar.getDirection()*180/Math.PI);

        System.out.println("length from foo to bar = " + foo.getLength(bar));

        if(foo.compareTo(bar)>0)
        {
            System.out.println("foo > bar");
        }
        else if(foo.compareTo(bar)<0)
        {
            System.out.println("foo < bar");
        }

        if(foo.equals(bar))
        {
            System.out.println("foo == bar");
        }
    }
}











