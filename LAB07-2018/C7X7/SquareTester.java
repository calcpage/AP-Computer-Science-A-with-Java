//SquareTester.java           MrG             2019.0308
public class SquareTester
{
    public static void main(String[] args)
    {
        Square bob = new Square(new Point(1,1), new Point(3,1), new Point(3,3), new Point(1,3));
        System.out.println("bob = " + bob);
        System.out.println("bob's perimeter = " + bob.getPerimeter());
        System.out.println("bob's area = " + bob.getArea());
    }
}
