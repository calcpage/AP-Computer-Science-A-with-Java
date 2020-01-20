/*
TicTacToeRunner.java                MrG                 2019.0314
purpose:                use a 2D static array to find the winner
required files:         TicTacToeRunner.java                main class
                        TicTacToe.java                      derived class
translator phase:       javac TicTacToeRunner.java
interpreter phase:      java TicTacToeRunner
*/

//main class
public class TicTacToeRunner
{
    public static void main(String[] args)
    {
        TicTacToe2 game = new TicTacToe2();

        //game.fillBoard();
        game.set(0,0,"O");game.set(0,1,"O");game.set(0,2,"O");
        game.set(1,0,"X");game.set(1,1,"O");game.set(1,2,"X");
        game.set(2,0,"X");game.set(2,1,"X");game.set(2,2,"O");

        System.out.println("board: \n" + game);

        System.out.println("Winner: " + game.getWinner());
    }
}











