/*
FindETester.java       MrG         2019.0117
purpose:            find the nth root of a using an iterator class
required files:     FindETester.java           main class
                    FindE.java                 derived class
translator phase:   javac FindETester.java
interpreter phase:  java FindE x0 eps
*/

public class FindETester
{
    public static void main(String[] args)
    {
        double x0 = Double.parseDouble(args[0]);
        double eps = Double .parseDouble(args[1]);

        FindE zidan = new FindE(x0,eps);

        while(zidan.hasMoreGuesses())
        {
            System.out.println(zidan.nextGuess());
        }

        System.out.println("Math.E = ");
        System.out.println(Math.E);
    }
}












