import java.util.Scanner;
import java.util.Random;
public class HiLoGame
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner bar = new Scanner(System.in);
		Random foo = new Random();
		int num = foo.nextInt(100)+1;
		boolean winner=false;
		while(!winner)
		{
			System.out.println("guess #"+count); 
			System.out.print("guess an int from 1 to 100: ");
			int guess = bar.nextInt();
			if(guess>num)
			{
				System.out.println("too high!");
			}
			else if(guess<num)
			{
				System.out.println("too low!");
			}
			winner=guess==num;
			count++;
		}
		System.out.println("you win!");
	}
}
