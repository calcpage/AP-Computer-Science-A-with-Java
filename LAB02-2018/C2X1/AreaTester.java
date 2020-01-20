/*
AreaTester.java     MrG     2018.1004
purpose:            practice using the Rectangle class
required files:     AreaTester.java             main class
translator phase:   javac AreaTester.java
interpreter phase:  java AreaTester x y l w
*/

//imported classes
import java.awt.Rectangle;

//main class
public class AreaTester
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int width = Integer.parseInt(args[2]);
        int height = Integer.parseInt(args[3]);
        Rectangle bob = new Rectangle(x,y,width,height);

        double area = bob.getWidth()*bob.getHeight();

        System.out.println("width = " + bob.getWidth());
        System.out.println("height = " + bob.getHeight());
        System.out.println("area = " + area);
    }
}