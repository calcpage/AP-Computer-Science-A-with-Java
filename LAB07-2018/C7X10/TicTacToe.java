//TicTacToe.java        MrG                 2019.0314
import java.util.Random;
public class TicTacToe
{
    private String[][] board;
    private Random coin;

    public TicTacToe()
    {
        board = new String[3][3];
        for(int r = 0; r<3; r++)
        {
            for(int c = 0; c<3; c++)
            {
                board[r][c] = " ";
            }
        }

        coin = new Random();
    }

    public String toString()
    {
        String temp = "-------\n";
        for(int r = 0; r<3; r++)
        {
            for(int c = 0; c<3; c++)
            {
                temp += "|" + board[r][c];
            }
            temp += "|\n-------\n";
        }
        return temp;
    }

    public void set(int r, int c, String player)
    {
        board[r][c]=player;
    }

    public void fillBoard()
    {
        for(int r = 0; r<3; r++)
        {
            for(int c = 0; c<3; c++)
            {
                if(coin.nextInt(2)==0)
                {
                    set(r,c,"O");
                }
                else
                {
                    set(r,c,"X");
                }
            }
        }
    }

    public String getWinner()
    {
        int count;
        //horizontal O winner
        for(int r = 0; r < 3; r++)
        {
            count = 0;
            for(int c = 0; c < 3; c++)
            {
                if(board[r][c].equals("O"))
                {
                    count++;
                }
            }
            if(count==3)
            {
                return "O";
            }
        }

        //horizontal X winner
        for(int r = 0; r < 3; r++)
        {
            count = 0;
            for(int c = 0; c < 3; c++)
            {
                if(board[r][c].equals("X"))
                {
                    count++;
                }
            }
            if(count==3)
            {
                return "X";
            }
        }

        //vertical O winner
        for(int c = 0; c < 3; c++)
        {
            count = 0;
            for(int r = 0; r < 3; r++)
            {
                if(board[r][c].equals("O"))
                {
                    count++;
                }
            }
            if(count==3)
            {
                return "O";
            }
        }

        //vertical X winner
        for(int c = 0; c < 3; c++)
        {
            count = 0;
            for(int r = 0; r < 3; r++)
            {
                if(board[r][c].equals("X"))
                {
                    count++;
                }
            }
            if(count==3)
            {
                return "X";
            }
        }

        //top-left diagonal X winner
        count = 0;
        for(int i = 0; i < 3; i++)
        {
            {
                if(board[i][i].equals("X"))
                {
                    count++;
                }
            }
        }
        if(count==3)
        {
            return "X";
        }

        //top-left diagonal O winner
        count = 0;
        for(int i = 0; i < 3; i++)
        {
            {
                if(board[i][i].equals("O"))
                {
                    count++;
                }
            }
        }
        if(count==3)
        {
            return "O";
        }

        //bottom-left diagonal X winner
        count = 0;
        for(int i = 0; i < 3; i++)
        {
            {
                if(board[2-i][i].equals("X"))
                {
                    count++;
                }
            }
        }
        if(count==3)
        {
            return "X";
        }

        //bottom-left diagonal O winner
        count = 0;
        for(int i = 0; i < 3; i++)
        {
            {
                if(board[2-i][i].equals("O"))
                {
                    count++;
                }
            }
        }
        if(count==3)
        {
            return "O";
        }

        return "TIE!";
    }
}