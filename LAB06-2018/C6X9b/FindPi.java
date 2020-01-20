//FindPi.java           MrG         2019.0117
public class FindPi
{
    private double eps;
    private double oldGuess;
    private double newGuess;

    public FindPi(double x0, double tolerance)
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
        double num = Math.sin(oldGuess);
        double den = Math.cos(oldGuess);
        newGuess=oldGuess-num/den;
        return newGuess;
    }


}








