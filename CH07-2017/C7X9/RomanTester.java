/*
RomanTester.java    MrG 2018.0314
purpose:    representing Roman numerals
required:   RomanTester.java        main class
            Roman3.java             derived class
translator: javac RomanTester.java
interpreter:java RomanTester num1 num2
*/
public class RomanTester
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        Roman3 caesar = new Roman3(num1);
        Roman3 brutus = new Roman3(num2);

        System.out.println("caesar = " + caesar);
        System.out.println("brutus = " + brutus);

        if(caesar.compareTo(brutus)<0)
        {
            System.out.println("caesar<brutus");
        }

        if(caesar.equals(brutus))
        {
            System.out.println("caesar==brutus");
        }

        if(caesar.compareTo(brutus)>0)
        {
            System.out.println("caesar>brutus");
        }

        Roman3 sum = caesar.add(brutus);
        System.out.println(caesar+" + "+brutus+" = "+sum);

        Roman3 diff = caesar.sub(brutus);
        System.out.println(caesar+" - "+brutus+" = "+diff);

        Roman3 prod = caesar.mul(brutus);
        System.out.println(caesar+" * "+brutus+" = "+prod);

        System.out.println("caesar = " + caesar.getNum());
        System.out.println("brutus = " + brutus.getNum());
        System.out.println("sum = " + sum.getNum());
        System.out.println("diff = " + diff.getNum());
        System.out.println("prod = " + prod.getNum());
        System.out.println("caesar digits = " + caesar.getDigits());
        System.out.println("brutus digits = " + brutus.getDigits());
        System.out.println("sum digits = " + sum.getDigits());
        System.out.println("diff digits = " + diff.getDigits());
        System.out.println("prod digits = " + prod.getDigits());

    }
}