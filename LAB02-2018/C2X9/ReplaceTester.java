/*
ReplaceTester.java      MrG     2018.1012
purpose:            practice with OBP and the String class!
required files:     ReplaceTester.java          main class
translator phase:   javac ReplaceTester.java
interpreter phase:  java ReplaceTester
*/

//main class
public class ReplaceTester
{
    public static void main(String[] args)
    {
        //String river = new String("Mississippi");
        String river = "Mississippi";
        System.out.println("river = " + river);
        //System.out.println("river = " + river.replace("i","!"));
        //System.out.println("river = " + river.replace("i","!").replace("s","$"));
        river=river.replace("i","!");
        System.out.println("river = " + river);
        river=river.replace("s","$");
        System.out.println("river = " + river);
    }
}











