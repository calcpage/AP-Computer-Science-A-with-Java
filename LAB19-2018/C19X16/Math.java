public class Math
{
    public static int pow(int b, int e)
    {
        int prod = 1;
        for(int i = 0; i < e; i++)
        {
            prod *= b;
        }
        return prod;
    }

    public static double pow(double b, int e)
    {
        if(e == 0)
        {
            return 1;
        }
        return b*pow(b, e-1);
    }

    public static int fact(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        return num*fact(num-1);
    }

    public static int combo(int n, int r)
    {
        if((n == r) || (r == 0))
        {
            return 1;
        }
        return combo(n-1,r)+combo(n-1,r-1);
    }
}