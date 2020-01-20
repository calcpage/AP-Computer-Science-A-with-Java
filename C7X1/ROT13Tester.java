import java.util.Scanner;
public class ROT13Tester
{
    public static void main(String[] args)
    {
        Scanner bob = new Scanner(System.in);
        System.out.print("enter text to encode: ");
        String s = bob.nextLine();

        ROT13c ross = new ROT13c(s);
        System.out.println("your encoded message: " + ross);
    }
}