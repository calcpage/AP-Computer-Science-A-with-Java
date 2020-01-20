//SavingsAccount.java   MrG     2018.1019
public class SavingsAccount
{
    private double balance;
    private double apr;

    public SavingsAccount(double initialBalance, double interestRate)
    {
        balance=initialBalance;
        apr=interestRate;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAPR()
    {
        return apr;
    }

    public void addInterest()
    {
        //balance=balance+balance*apr/100;
        balance+=balance*apr/100;
    }
}