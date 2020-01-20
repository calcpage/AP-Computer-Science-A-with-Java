/*
Roman2Tester.java                MrG                 2019.0327
purpose:                use int[] to parse integers as Roman Numerals
required files:         Roman2Tester.java                main class
                        Roman2.java                      derived class
translator phase:       javac Roman2Tester.java
interpreter phase:      java Roman2Tester num1 num2
*/

//main class
public class Roman2Tester
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        Roman2 caesar = new Roman2(num1);
        Roman2 brutus = new Roman2(num2);

        Roman2 sum = caesar.add(brutus);
        Roman2 sub = caesar.sub(brutus);
        Roman2 mul = caesar.mul(brutus);

        System.out.println("caesar = " + caesar);
        System.out.println("brutus = " + brutus);
        System.out.println("sum = " + sum);
        System.out.println("sub = " + sub);
        System.out.println("mul = " + mul);

        if(caesar.compareTo(brutus)<0)
        {
            System.out.println("caesar < brutus");
        }
/*
        if(caesar.compareTo(brutus)==0)
        {
            System.out.println("caesar == brutus");
        }
*/
        if(caesar.equals(brutus))
        {
            System.out.println("caesar == brutus");
        }

        if(caesar.compareTo(brutus)>0)
        {
            System.out.println("caesar > brutus");
        }
    }
}