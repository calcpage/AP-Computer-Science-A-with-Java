/*
SorterTester.java           MrG         2018.1207
purpose:            to sort Strings in Lexicographical order
required files:     SorterTester.java           main class
                    Sorter.java                 derived class
translator phase:   javac SorterTester.java
interpreter phase:  java SorterTester s1 s2 s3
*/

//main class
public class SorterTester
{
    public static void main(String[] args)
    {
        String s1 = args[0];
        String s2 = args[1];
        String s3 = args[2];

        Sorter peyton = new Sorter(s1,s2,s3);

        System.out.println("1st = " + peyton.getFirst());
        System.out.println("2nd = " + peyton.getSecond());
        System.out.println("3rd = " + peyton.getThird());
    }
}













