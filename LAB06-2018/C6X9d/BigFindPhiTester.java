/*
BigFindPhiTester.java       MrG         2019.0117
purpose:            find the nth root of a using an iterator class
required files:     BigFindPhiTester.java           main class
                    BigFindPhi.java                 derived class
translator phase:   javac BigFindPhiTester.java
interpreter phase:  java BigFindPhiTester x0 eps
*/

public class BigFindPhiTester
{
    public static void main(String[] args)
    {
        BigFindPhi zidan = new BigFindPhi(args[0],args[1]);

        while(zidan.hasMoreGuesses())
        {
            System.out.println(zidan.nextGuess());
        }
    }
}












