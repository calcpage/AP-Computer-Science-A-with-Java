/*
BugMover.java       MrG     2018.1026
purpose:            make my own Bug class!
required files:     BugMover.java           main class
                    Bug.java                derived class
translator phase:   javac BugMover.java
interpreter phase:  java BugMover
*/

public class BugMover
{
    public static void main(String[] args)
    {
        Bug zidan = new Bug(20);
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");

        zidan.turnBug();

        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");

        zidan.turnBug();

        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
        zidan.moveBug();
        System.out.println("pos = " + zidan.getPos() + "in.");
    }
}