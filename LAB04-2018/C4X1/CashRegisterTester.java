/*
CashRegisterTester.java     MrG     2018.1101
purpose:            simulate a cash register transaction
required files:     CashRegisterTester.java         main class
                    CashRegister.java               derived class
translator phase:   javac CashRegisterTester.java
interpreter phase:  java CashRegisterTester
*/

//main class
public class CashRegisterTester
{
    public static void main(String[] args)
    {
        CashRegister andrew = new CashRegister();

        System.out.println("total purchase: $" + andrew.getTotalPurchase());
        System.out.println("total payment: $" + andrew.getTotalPayment());

        andrew.recordPurchase(1.25);
        System.out.println("total purchase: $" + andrew.getTotalPurchase());
        andrew.recordPurchase(2.50);
        System.out.println("total purchase: $" + andrew.getTotalPurchase());
        andrew.recordPurchase(5.00);
        System.out.println("total purchase: $" + andrew.getTotalPurchase());

        andrew.enterDollars(4);
        System.out.println("total payment: $" + andrew.getTotalPayment());
        andrew.enterQuarters(3);
        System.out.println("total payment: $" + andrew.getTotalPayment());
        andrew.enterDimes(20);
        System.out.println("total payment: $" + andrew.getTotalPayment());
        andrew.enterNickels(30);
        System.out.println("total payment: $" + andrew.getTotalPayment());
        andrew.enterPennies(60);
        System.out.println("total payment: $" + andrew.getTotalPayment());

        System.out.println("change = $" + andrew.makeChange());
    }
}













