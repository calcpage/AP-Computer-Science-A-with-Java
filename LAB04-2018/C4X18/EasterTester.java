/*
EasterTester.java       MrG         2018.1109
purpose:            test Easter Sunday algorithm
required files:     EasterTester.java           main class
                    Easter.java                 derived class
translator phase:   javac EasterTester.java
interpreter phase:  java EasterTester
*/

//imported classes
import java.util.Scanner;

//main class
public class EasterTester
{
    public static void main(String[] args)
    {
        Scanner foo = new Scanner(System.in);

        System.out.print("Please enter year: ");
        int year = foo.nextInt();

        Easter bar = new Easter(year);

        System.out.print("Easter Sunday: " + bar.getMonth() + "/");
        System.out.println(bar.getDay() + "/" + year);
    }
}

























