//MersennePrime.java        MrG     2019.0110
public class MersennePrime
{
    private int n;
    private long m;

    public MersennePrime()
    {
        n=1;
        m=(long)(Math.pow(2,n)-1);
    }

    public String toString()
    {
        return "2^"+n+"-1 = " + m;
    }

    public void nextPrime()
    {
        n++;
        m=(long)(Math.pow(2,n)-1);
        while(!isPrime())
        {
            n++;
            m=(long)(Math.pow(2,n)-1);
        }
    }

    public boolean isPrime()
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