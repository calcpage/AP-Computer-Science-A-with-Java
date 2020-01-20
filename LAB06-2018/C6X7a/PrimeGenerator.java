/*
PrimeGenerator.java     MrG         2019.0109
purpose:            generate all primes<=max
required files:     PrimeGenerator.java                 main class
                    Prime.java                          derived class
translator phase:   javac PrimeGenerator.java
interpreter phase:  java PrimeGenerator max
*/

//main class
public class PrimeGenerator
{
    public static void main(String[] args)
    {
        int max = Integer.parseInt(args[0]);

        for(int n=2; n<=max; n++)
        {
            if(Prime.isPrime(n))
            {
                System.out.println(n + " is prime!");
            }
            //else
            //{
                //System.out.println(n + " is NOT prime!!");
            //}
        }
    }
/*
    public static boolean isPrime(int n)
    {
        if(n==2){return true;}
        if(n<2 || n%2==0){return false;}
        //if(m%2==0){return false;}
        for(int i=3;i<=n-1;i+=2)
        {
            if(n%i==0){return false;}
        }
        return true;
    }
*/
}