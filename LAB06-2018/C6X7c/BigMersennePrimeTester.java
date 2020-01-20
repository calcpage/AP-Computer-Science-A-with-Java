/*
BigMersennePrimeTester.java     MrG         2019.0109
purpose:            generate all mersene primes 2^n-1 where n<max
required files:     BigMersennePrimeTester.java                 main class
                    BigMersennePrime.java                       derived class
translator phase:   javac BigMersennePrimeTester.java
interpreter phase:  java BigMersennePrimeTester max
*/

//main class
public class BigMersennePrimeTester
{
    public static void main(String[] args)
    {
        int max = Integer.parseInt(args[0]);

        BigMersennePrime luke = new BigMersennePrime();

        for(int i=1; i<=max; i++)
        {
            luke.nextPrime();
            System.out.println("M"+i+": "+luke);
            System.out.println();
        }
    }
}