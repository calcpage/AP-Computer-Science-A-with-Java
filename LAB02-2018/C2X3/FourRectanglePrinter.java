/*
FourRectanglePrinter.java       MrG     2018.1005
purpose:            practice with OBP and Rectangle objects
required:           FourRectanglePrinter.java       main class
translator phase:   javac FourRectanglePrinter.java
interpreter phase:  java FourRectanglePrinter
*/

//imported class
import java.awt.Rectangle;

//main method
public class FourRectanglePrinter
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(10,20,30,40);
        System.out.println(box);

        box.translate(30,0);
        System.out.println(box);

        box.translate(0,40);
        System.out.println(box);

        box.translate(-30,0);
        System.out.println(box);
    }
}