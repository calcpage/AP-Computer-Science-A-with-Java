//TriangleTester.java           MrG             2019.0308
public class TriangleTester
{
    public static void main(String[] args)
    {
        Triangle bob = new Triangle(new Point(1,1), new Point(4,1), new Point(2,5));
        System.out.println("bob = " + bob);
        System.out.println("bob's perimeter = " + bob.getPerimeter());
        System.out.println("bob's area = " + bob.getArea());
    }
}
