/*
ROT13Tester.java            MrG         2019.0130
purpose:            create a Caesar Cypher using Strings as static arrays of chars
required files:     Rot13Tester.java                main class
                    Rot13a.java                     derived class
translator phase:   javac Rot13Tester.java
interpreter phase:  java Rot13Tester
*/

//imported classes
import java.util.Scanner;

//main class
public class Rot13Tester
{
    public static void main(String[] args)
    {
        Scanner bob = new Scanner(System.in);
        System.out.print("Enter text to encode: ");
        //String ross = bob.next();

        Rot13a foo = new Rot13a(args[0]);

        System.out.print("textIn = ");
        System.out.println(foo.getTextIn());
        System.out.print("textOut = ");
        System.out.println(foo.getTextOut());
    }
}
