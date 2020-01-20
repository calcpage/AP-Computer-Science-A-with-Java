/*
Roman3Tester.java                MrG                 2019.0327
purpose:                use int[] to parse integers as Roman Numerals
required files:         Roman3Tester.java                main class
                        Roman3.java                      derived class
translator phase:       javac Roman3Tester.java
interpreter phase:      java Roman3Tester num1 num2
*/

//main class
public class Roman3Tester
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        Roman3 caesar = new Roman3(num1);
        Roman3 brutus = new Roman3(num2);

        Roman3 sum = caesar.add(brutus);
        Roman3 sub = caesar.sub(brutus);
        Roman3 mul = caesar.mul(brutus);

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