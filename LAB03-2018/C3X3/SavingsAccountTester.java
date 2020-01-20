/*
SavingsAccountTester.java MrG   2018.1019
purpose:            practice OOP by making my own class!
required files:     SavingsAccountTester.java   main class
                    SavingsAccount.java         derived class
translator phase:   javac SavingsAccountTester.java
interpreter phase:  java SavingsAccountTester
*/

//main class
public class SavingsAccountTester
{
    public static void main(String[] args)
    {
        SavingsAccount ross = new SavingsAccount(1000,10);
        System.out.println("balance = $" + ross.getBalance());
        System.out.println("apr = " + ross.getAPR() + "%");

        ross.addInterest();
        System.out.println("balance = $" + ross.getBalance());
        ross.addInterest();
        System.out.println("balance = $" + ross.getBalance());
        ross.addInterest();
        System.out.println("balance = $" + ross.getBalance());
        ross.addInterest();
        System.out.println("balance = $" + ross.getBalance());
        ross.addInterest();
        System.out.println("balance = $" + ross.getBalance());

    }
}