//Newton.java           MrG         2019.0117
public class Newton
{
    private double a;
    private int n;
    private double eps;
    private double oldGuess;
    private double newGuess;

    public Newton(double a, int n, double tolerance)
    {
        this.a=a;
        this.n=n;
        eps=tolerance;
        oldGuess=0;
        newGuess=1;
    }

    public boolean hasMoreGuesses()
    {
        return Math.abs(newGuess-oldGuess)>eps;
    }

    public double nextGuess()
    {
        oldGuess=newGuess;
        double num = Math.pow(oldGuess,n)-a;
        double den = n*Math.pow(oldGuess,n-1);
        newGuess=oldGuess-num/den;
        return newGuess;
    }


}








