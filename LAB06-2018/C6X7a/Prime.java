//Prime.java        MrG         2019.0118
public class Prime
{
    public static boolean isPrime(int n)
    {
        if(n==2){return true;}
        if(n<2 || n%2==0){return false;}
        for(int i=3;i<=n-1;i+=2)
        {
            if(n%i==0){return false;}
        }
        return true;
    }
}