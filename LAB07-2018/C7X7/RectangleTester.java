//RectangleTester.java           MrG             2019.0308
public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle bob = new Rectangle(new Point(1,1), new Point(4,1), new Point(4,3), new Point(1,3));
        System.out.println("bob = " + bob);
        System.out.println("bob's perimeter = " + bob.getPerimeter());
        System.out.println("bob's area = " + bob.getArea());
    }
}
