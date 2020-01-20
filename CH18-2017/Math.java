public class Math
{
    public static double pow(double b, int e)
    {
        if(e==0)
        {
            return 1;
        }
        return b*pow(b,e-1);
    }

    public static int fact(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*fact(num-1);
    }

    public static int fib(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }

    public static int combo(int n, int r)
    {
        if(n==r || r==0)
        {
            return 1;
        }
        return combo(n-1,r)+combo(n-1,r-1);
    }
}














