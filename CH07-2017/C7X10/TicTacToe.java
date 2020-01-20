//TicTacToe.java    MrG     2018.0328
public class TicTacToe
{
    private String[][] board;

    public TicTacToe()
    {
        board = new String[3][3];

        for(int r=0; r<3; r++)
        {
            for(int c=0; c<3; c++)
            {
                board[r][c]="-";
            }
        }
    }

    public String toString()
    {
        String temp="";
        for(int r=0; r<3; r++)
        {
            for(int c=0; c<3; c++)
            {
                temp+=board[r][c];
            }
            temp+="\n";
        }
        return temp;
    }
}