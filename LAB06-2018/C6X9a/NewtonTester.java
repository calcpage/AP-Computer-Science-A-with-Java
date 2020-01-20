/*
NewtonTester.java       MrG         2019.0117
purpose:            find the nth root of a using an iterator class
required files:     NewtonTester.java           main class
                    Newton.java                 derived class
translator phase:   javac NewtonTester.java
interpreter phase:  java NewtonTester a n eps
*/

public class NewtonTester
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        double eps = Double .parseDouble(args[2]);

        Newton zidan = new Newton(a,n,eps);

        while(zidan.hasMoreGuesses())
        {
            System.out.println(zidan.nextGuess());
        }
    }
}












