//BigFindPhi.java           MrG         2019.0117
import java.math.BigDecimal;
public class BigFindPhi
{
    private BigDecimal eps;
    private BigDecimal TWO;
    private BigDecimal oldGuess;
    private BigDecimal newGuess;

    public BigFindPhi(String x0, String eps)
    {
        this.eps=new BigDecimal(eps);
        //eps=new BigDecimal("0.000000001");
        TWO=new BigDecimal("2");
        oldGuess=BigDecimal.ZERO;
        newGuess=new BigDecimal(x0);
        //newGuess=new BigDecimal("1");
    }

    public boolean hasMoreGuesses()
    {
        //return Math.abs(newGuess-oldGuess)>eps;
        return (newGuess.subtract(oldGuess)).abs().compareTo(eps)>0;
    }

    public BigDecimal nextGuess()
    {
        oldGuess=newGuess;
        BigDecimal num = oldGuess.pow(2).subtract(oldGuess).subtract(BigDecimal.ONE);
        BigDecimal den = TWO.multiply(oldGuess).subtract(BigDecimal.ONE);
        //newGuess=oldGuess-num/den;
        newGuess=oldGuess.subtract(num.divide(den,40,BigDecimal.ROUND_HALF_UP));
        return newGuess;
    }
}








