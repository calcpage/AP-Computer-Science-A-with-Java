/*
DataSorter.java                 MrG             2018.1206
purpose:                sorting doubles
required files:         DataSorter.java         main class
                        Data.java               derived class
translator phase:       javac DataSorter.java
interpreter phase:      java DataSorter
*/

//imported class
import java.util.Scanner;

//main class
public class DataSorter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a double: ");
        double n1 = in.nextDouble();
        System.out.print("Enter another double: ");
        double n2 = in.nextDouble();
        System.out.print("Enter one more double: ");
        double n3 = in.nextDouble();

        Data adrian = new Data(n1,n2,n3);
        System.out.println("1st: " + adrian.getSmallest());
        System.out.println("2nd: " + adrian.getMiddle());
        System.out.println("3rd: " + adrian.getLargest());
    }
}











