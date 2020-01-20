/*
RPSTester.java      MrG         2018/1115
purpose:            use if statements to play RPS against my PC
required files:     RPSTester.java              main class
                    RPS.java                    derived class
translator phase:   javac RPSTester.java
interpreter phase:  java RPSTester
*/

//imported classes
import java.util.Scanner;
import java.util.Random;

//main class
public class RPSTester
{
    public static void main(String[] args)
    {
        RPS jasmine;
        int computerChoice;
        String computerMove="";
        Scanner input = new Scanner(System.in);
        System.out.println("make a move (r,p,s or x to exit): ");
        String personMove = input.next().toLowerCase();

        Random gen = new Random();

        while(!personMove.equals("x"))
        {
            computerChoice = gen.nextInt(3);

            if(computerChoice == 0)
            {
                computerMove="r";
            }
            if(computerChoice == 1)
            {
                computerMove="p";
            }
            if(computerChoice == 2)
            {
                computerMove="s";
            }

            jasmine = new RPS(personMove, computerMove);
            System.out.println(jasmine);
            System.out.println("personMove: " + jasmine.getPerson());
            System.out.println("computerMove: " + jasmine.getComputer());
            System.out.println("Person win ratio: " + Math.round(jasmine.getPercent()) + " %");

            System.out.println("make a move (r,p,s or x to exit): ");
            personMove = input.next().toLowerCase();
        }
    }
}







