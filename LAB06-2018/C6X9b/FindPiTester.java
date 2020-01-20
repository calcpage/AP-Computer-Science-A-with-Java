/*
FindPiTester.java       MrG         2019.0117
purpose:            find the nth root of a using an iterator class
required files:     FindPiTester.java           main class
                    FindPi.java                 derived class
translator phase:   javac FindPiTester.java
interpreter phase:  java FindPiTester a n eps
*/

public class FindPiTester
{
    public static void main(String[] args)
    {
        double x0 = Double.parseDouble(args[0]);
        double eps = Double .parseDouble(args[1]);

        FindPi zidan = new FindPi(x0,eps);

        while(zidan.hasMoreGuesses())
        {
            System.out.println(zidan.nextGuess());
        }

        System.out.println("Math.PI = ");
        System.out.println(Math.PI);
    }
}












