//CashRegister.java     MrG     2018.1101
public class CashRegister
{
    private double totalPurchase;
    private double totalPayment;

    private final double QUARTER_VALUE=0.25;
    private final double DIME_VALUE=0.10;
    private final double NICKEL_VALUE=0.05;
    private final double PENNY_VALUE=0.01;

    public CashRegister()
    {
        totalPurchase = 0;
        totalPayment = 0;
    }

    public double getTotalPurchase()
    {
        return totalPurchase;
    }

    public double getTotalPayment()
    {
        return totalPayment;
    }

    public double makeChange()
    {
        return Math.round((totalPayment-totalPurchase)*100)/100.0;
    }

    public void recordPurchase(double amount)
    {
        totalPurchase+=amount;
    }

    public void enterDollars(int num)
    {
        totalPayment+=num;
    }

    public void enterQuarters(int num)
    {
        totalPayment+=num*QUARTER_VALUE;
    }

    public void enterDimes(int num)
    {
        totalPayment+=num*DIME_VALUE;
    }

    public void enterNickels(int num)
    {
        totalPayment+=num*NICKEL_VALUE;
    }

    public void enterPennies(int num)
    {
        totalPayment+=num*PENNY_VALUE;
    }

}