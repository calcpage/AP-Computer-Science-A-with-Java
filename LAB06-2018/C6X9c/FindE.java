//FindE.java           MrG         2019.0117
public class FindE
{
    private double eps;
    private double oldGuess;
    private double newGuess;

    public FindE(double x0, double tolerance)
    {
        eps=tolerance;
        oldGuess=0;
        newGuess=x0;
    }

    public boolean hasMoreGuesses()
    {
        return Math.abs(newGuess-oldGuess)>eps;
    }

    public double nextGuess()
    {
        oldGuess=newGuess;
        double num = Math.log(oldGuess)-1;
        double den = 1/oldGuess;
        newGuess=oldGuess-num/den;
        return newGuess;
    }


}








