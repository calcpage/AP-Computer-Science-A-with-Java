import java.util.ArrayList;
import java.util.Random;
public class Chess960
{
	public static void main(String[] args)
	{
		int printCount=0;
		ArrayList<String> foo = new ArrayList<String>();
		foo.add("R N B Q K B N R ");
		System.out.println(printCount+" "+foo.get(0));
		printCount++;
		while(printCount<960)
		{
			String[] whitePieces = new String[8];
			darkBishop(whitePieces);
			lightBishop(whitePieces);
			setQueen(whitePieces);
			setKnight(whitePieces);
			setKnight(whitePieces);
			setRook(whitePieces);
			setKing(whitePieces);
			setRook(whitePieces);
			if(!found(toString(whitePieces),foo))
			{
				System.out.println(printCount+" "+toString(whitePieces));
				foo.add(toString(whitePieces));
				printCount++;
			}
		}
	}

	public static boolean found(String wP, ArrayList<String> bar)
	{
		for(String board:bar)
		{
			if(board.equals(wP))
			{
				return true;
			}
		}
		return false;
	}

	public static void darkBishop(String[] wP)
	{
		Random die = new Random();
		wP[die.nextInt(4)*2]="B";
	}

	public static void lightBishop(String[] wP)
	{
		Random die = new Random();
		wP[1+die.nextInt(4)*2]="B";
	}

	public static void setQueen(String[] wP)
	{
		int pos;
		Random die = new Random();
		do
			pos=die.nextInt(8);
		while(wP[pos]!=null);
		wP[pos]="Q";
	}

	public static void setKnight(String[] wP)
	{
		int pos;
		Random die = new Random();
		do
			pos=die.nextInt(8);
		while(wP[pos]!=null);
		wP[pos]="N";
	}

	public static void setRook(String[] wP)
	{
		int pos = 0;
		while(wP[pos]!=null)
		{
			pos++;
		}
		wP[pos]="R";
	}

	public static void setKing(String[] wP)
	{
		int pos = 0;
		while(wP[pos]!=null)
		{
			pos++;
		}
		wP[pos]="K";
	}

	public static String toString(String[] wP)
	{
		String temp = "";
		for(int k=0; k<wP.length; k++)
		{
			temp+=wP[k]+" ";
		}
		return temp;
	}
}

