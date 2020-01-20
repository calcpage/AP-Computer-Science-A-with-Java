/*
RPSTester.java  MrG 2018.0124
purpose:    play a game of RPS using a while loop to simulate multiple rounds
required:    RPSTester.java          main class
            RPS.java                derived class
translator: javac RPSTester.java
interpreter:java RPS.java
*/

//Imported Classes
import java.util.Scanner;
import java.util.Random;

//Main Class
public class RPSTester
{
    public static void main(String[] args)
    {
        RPS foo;
        String personMove;
        String computerMove="";
        int computerChoice;
        Scanner input = new Scanner(System.in);
        Random generator = new Random();


        System.out.print("make a move! (r,p,s or x exit): ");
        personMove = input.next().toLowerCase();

        while(!personMove.equals("x"))
        {
            computerChoice = generator.nextInt(3);
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

            foo = new RPS(personMove, computerMove);
            System.out.println("personMove = " + foo.getPerson());
            System.out.println("computerMove = " + foo.getComputer());
            System.out.println(foo);
            System.out.println();

            System.out.println("Person win ratio = " + (double)foo.getPersonWins()/foo.getNumRounds()*100 + "%");

            System.out.print("make a move! (r,p,s or x exit): ");
            personMove = input.next().toLowerCase();
        }
    }
}