/*
RomanTester.java                MrG                 2019.0327
purpose:                use int[] to parse integers as Roman Numerals
required files:         RomanTester.java                main class
                        Roman.java                      derived class
translator phase:       javac RomanTester.java
interpreter phase:      java RomanTester num1 num2
*/

//main class
public class RomanTester
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        Roman caesar = new Roman(num1);
        Roman brutus = new Roman(num2);

        Roman sum = caesar.add(brutus);
        Roman sub = caesar.sub(brutus);
        Roman mul = caesar.mul(brutus);

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