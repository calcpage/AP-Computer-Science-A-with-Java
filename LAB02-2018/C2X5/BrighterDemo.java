/*
BrighterDemo.java       MrG     2018.1010
purpose:            practice constructing Color objects
required files:     BrighterDemo.java           main class
translator phase:   javac BrighterDemo.java
interpreter phase:  java BrighterDemo
*/

//imported class
import java.awt.Color;

//main class
public class BrighterDemo
{
    public static void main(String[] args)
    {
        Color foo = new Color(50,100,150);
        System.out.println(foo);
        System.out.println(foo.brighter());
        System.out.println(foo.brighter().brighter());
    }
}