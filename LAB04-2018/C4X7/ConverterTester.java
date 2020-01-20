/*
ConverterTester.java        MrG     2018.1114
purpose:            convert from m to km to mi to ft to in
required files:     ConverterTester.java            main class
                    Converter.java                  derived class
translator phase:   javac ConverterTester.java
interpreter phase:  java ConverterTester meters
*/

//main class
public class ConverterTester
{
    public static void main(String[] args)
    {
        Converter jordan = new Converter(Double.parseDouble(args[0]));
        System.out.println(jordan.getMeters() + " meters");
        System.out.println(jordan.meter2km() + " kilometers");
        System.out.println(jordan.kilo2mi() + " miles");
        System.out.println(jordan.mile2ft() + " feet");
        System.out.println(jordan.foot2in() + " inches");
    }
}