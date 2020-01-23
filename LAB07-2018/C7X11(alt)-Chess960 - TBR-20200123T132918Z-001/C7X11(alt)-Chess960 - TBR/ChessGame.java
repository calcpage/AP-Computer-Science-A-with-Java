import java.util.Scanner;
public class ChessGame
{
	public static void main(String[] args)
	{
		Scanner cliff = new Scanner(System.in);
		String[][] game = new String[8][8];
		String board = "RNBQKBNR";
		initBoard(board, game);
		System.out.println(toString(game));
		while(true)
		{
			System.out.print("enter r1: ");
			int r1=cliff.nextInt();
			System.out.print("enter c1: ");
			int c1=cliff.nextInt();
			System.out.print("enter r2: ");
			int r2=cliff.nextInt();
			System.out.print("enter c2: ");
			int c2=cliff.nextInt();
			move(r1,c1,r2,c2,game);
			System.out.println(toString(game));
		}
	}

	public static void initBoard(String board, String[][] game)
	{
		for(int c=0; c<8; c++)
		{
			game[7][c]=board.substring(c,c+1).toLowerCase();
			game[6][c]="p";
			game[1][c]="P";
			game[0][c]=board.substring(c,c+1);
		}
	}

	public static String toString(String[][] game)
	{
		String temp = "";
		for(int r=7; r>=0; r--)
		{
			for(int c=0; c<8; c++)
			{
				if(game[r][c]==null)
				{
					temp+="[ ]";
				}
				else
				{
					temp+="["+game[r][c]+"]";
				}
			}
			temp+="\n";
		}
		return temp;
	}

	public static void move(int r1, int c1, int r2, int c2, String[][] game)
	{
		game[r2][c2]=game[r1][c1];
		game[r1][c1]=null;
	}
}














