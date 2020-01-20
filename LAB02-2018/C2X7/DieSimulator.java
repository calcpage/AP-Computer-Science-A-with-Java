/*
DieSimulator.java       MrG     2018.1011
purpose:            practice with OBP and the Random class!
required files:     DieSimulator.java           main class
translator phase:   javac DieSimulator.java
interpreter phase:  java DieSimulator
*/

//imported class
import java.util.Random;

//main class
public class DieSimulator
{
    public static void main(String[] args)
    {
        Random die = new Random();
        System.out.println("die1 = " + (die.nextInt(6)+1));
        System.out.println("die2 = " + (die.nextInt(6)+1));
        System.out.println("die3 = " + (die.nextInt(6)+1));
        System.out.println("die4 = " + (die.nextInt(6)+1));
        System.out.println("die5 = " + (die.nextInt(6)+1));
    }
}









