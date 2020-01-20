public class MathTester
{
    public static void main(String[] args)
    {
        System.out.println("5^3 = " + Math.pow(5,3));
        System.out.println("2.5^2 = " + Math.pow(2.5,2));
        System.out.println("5! = " + Math.fact(5));
        System.out.println("4C3 = " + Math.combo(4,3));
        System.out.println("2C2 = " + Math.combo(2,2));
        System.out.println("4C0 = " + Math.combo(4,0));

        System.out.println(" ");

        for(int n = 0; n < 34; n++)
        {
            for(int r = 0; r <= n; r++)
            {
                System.out.print(Math.combo(n,r) + " ");
            }
            System.out.print("\n");
        }
    }
}