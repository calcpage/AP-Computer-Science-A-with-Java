/*
QuadTester.java         MrG             2018.1129
purpose:            solving ax^2+bx+c=0 for x
required files:     QuadTester.java             main class
                    Quad.java                   derived class
translator phase:   javac QuadTester.java
interpreter phase:  java QuadTester a b c
*/

//main class
public class QuadTester
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        Quad jack = new Quad(a,b,c);

        System.out.println("a = " + jack.getA());
        System.out.println("b = " + jack.getB());
        System.out.println("c = " + jack.getC());

        if(jack.isReal())
        {
            System.out.println("Roots are Real!");
            if(jack.isRat())
            {
                System.out.println("Roots are Rational!");
            }
            else
            {
                System.out.println("Roots are Irrational!");
            }
            if(jack.isEqual())
            {
                System.out.println("Roots are Equal!");
            }
            else
            {
                System.out.println("Roots are Not Equal!");
            }
            System.out.println("Root1 = " + jack.getRoot1());
            System.out.println("Root2 = " + jack.getRoot2());
        }
        else
        {
            System.out.println("Roots are Complex!");
        }
    }
}






