/*
IceCreamConeTester.java     MrG     2018.1102
purpose:            find SA and V of my Ice Cream Cone
required files:     IceCreamConeTester.java         main class
                    IceCreamCone.java               derived class
translator phase:   javac IceCreamConeTester.java
interpreter phase:  java IceCreamConeTester r h
*/

//main class
public class IceCreamConeTester
{
    public static void main(String[] args)
    {
        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);

        IceCreamCone luke = new IceCreamCone(r,h);
        System.out.println("r = " + luke.getR() + "in.");
        System.out.println("h = " + luke.getH() + "in.");

        System.out.println("volume = " + luke.getVol() + "in^3");
        System.out.println("surface area = " + luke.getSA() + "in^2");
    }
}