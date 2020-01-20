//BigMersennePrime.java        MrG     2019.0110
import java.math.BigInteger;
public class BigMersennePrime
{
    private int n;
    private BigInteger m;
    private static BigInteger TWO;
    private static BigInteger THREE;

    public BigMersennePrime()
    {
        //TWO=(BigInteger.ONE).add(BigInteger.ONE);
        //THREE=TWO.add(BigInteger.ONE);
        TWO=new BigInteger("2");
        THREE=new BigInteger("3");
        n=1;
        m=TWO.pow(n).subtract(BigInteger.ONE);
        //m=(long)(Math.pow(2,n)-1);
    }

    public String toString()
    {
        return "2^"+n+"-1 = " + m;
    }

    public void nextPrime()
    {
        n++;
        m=TWO.pow(n).subtract(BigInteger.ONE);
        //m=(long)(Math.pow(2,n)-1);
        while(!isPrime())
        {
            n++;
            m=TWO.pow(n).subtract(BigInteger.ONE);
            //m=(long)(Math.pow(2,n)-1);
        }
    }

    public boolean isPrime()
    {
        //BigInteger i;
        //if(m.equals(2)){return true;}
        //if(m.compareTo(TWO)<0 || m.mod(TWO).equals(0)){return false;}
        //for(i=THREE;i.compareTo(m.subtract(BigInteger.ONE))<=0;i.add(TWO))
        {
            //if(m.mod(i).equals(0)){return false;}
        }
        //return true;
        return m.isProbablePrime(1);
    }
}