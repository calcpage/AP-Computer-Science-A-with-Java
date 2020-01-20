//BankAccount.java  MrG     2018.1018
public class BankAccount
{
    private double balance;

    public BankAccount()
    {
        balance=0;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance=balance+amount;
    }

    public void withdraw(double amount)
    {
        balance=balance-amount;
    }
}






