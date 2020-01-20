/*
MersennePrimeTester.java     MrG         2019.0109
purpose:            generate all mersene primes 2^n-1 where n<Max
required files:     MersennePrimeTester.java                 main class
                    MersennePrime.java                       derived class
translator phase:   javac MersennePrimeTester.java
interpreter phase:  java MersennePrimeTester Max
*/

//main class
public class MersennePrimeTester
{
    public static void main(String[] args)
    {
        int max = Integer.parseInt(args[0]);

        MersennePrime luke = new MersennePrime();
/*
        for(int i=1; i<=max; i++)
        {
            luke.nextPrime();
            System.out.println("M"+i+": "+luke);
        }
*/
        int i=1;
        while(i<=max)
        {
            luke.nextPrime();
            System.out.println("M"+i+": "+luke);
            i++;
        }

    }
}