/*
CurrencyConverter.java      MrG         2019.0104
purpose:            convert dollars to euros using a while loop
required files:     CurrencyConverter.java          main class
translator phase:   javac CurrencyConverter.java
interpreter phase:  java CurrencyConverter
*/

//imported class
import java.util.Scanner;

//main class
public class CurrencyConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many euros/dollar?");
        double rate = in.nextDouble();

        String reply;
        double value;
        boolean keepGoing = true;

        while(keepGoing)
        {
            System.out.print("How many dollars to convert?");
            value = in.nextDouble();
            System.out.println("euros = " + Math.round(convert(rate, value)*100)/100.0);
            System.out.println("Quit? (Y/N)");
            reply = in.next();
            if(reply.equals("Y")||reply.equals("y"))
            {
                keepGoing=false;
            }
        }
    }

    public static double convert(double rate, double value)
    {
        return rate*value;
    }
}







