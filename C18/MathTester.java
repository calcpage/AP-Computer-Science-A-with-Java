public class MathTester
{
    public static void main(String[] args)
    {
        System.out.println("2.5^2="+Math.pow(2.5,2));
        System.out.println("6!="+Math.fact(6));
        System.out.println("fib(7)="+Math.fib(7));
        System.out.println("combo(5,2)="+Math.combo(5,2));

        for(int n=0; n<=5; n++)
        {
            for(int r=0; r<=n; r++)
            {
                System.out.print(Math.combo(n,r)+" ");
            }
            System.out.println();
        }

        for(int n=0; n<200; n++)
        {
            System.out.println((double)Math.fib(n+1)/Math.fib(n));
        }
    }
}
