/*
PowerGeneratorTester.java       MrG         2019.0107
purpose:            generate a table of powers using a for loop
required files:     PowerGeneratorTester.java       main class
                    PowerGenerator.java             derived class
translator phase:   javac PowerGeneratorTester.java
interpreter phase:  java PowerGeneratorTester base
*/

//main class
public class PowerGeneratorTester
{
    public static void main(String[] args)
    {
        int base = Integer.parseInt(args[0]);
        PowerGenerator ismail = new PowerGenerator(base);

        System.out.println((int)Math.pow(base,0));
        for(int i=1; i<=20; i++)
        {
            System.out.println(ismail.nextPower());
        }
    }
}