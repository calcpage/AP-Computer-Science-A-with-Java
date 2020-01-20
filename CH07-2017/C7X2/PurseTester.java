public class PurseTester
{
    public static void main(String[] args)
    {
        Purse a = new Purse();
        a.addCoin("Quarter");
        a.addCoin("Dime");
        a.addCoin("Nickel");
        a.addCoin("Dime");

        Purse b = new Purse();
        b.addCoin("Quarter");
        b.addCoin("Dime");
        b.addCoin("Nickel");
        b.addCoin("Dime");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a.transfer(b);
        //System.out.println("a = " + a);
        //System.out.println("b = " + b);

        System.out.println("a==b is " + a.sameCoins(b));
        //p.reverse();
        //System.out.println(p);
    }
}









