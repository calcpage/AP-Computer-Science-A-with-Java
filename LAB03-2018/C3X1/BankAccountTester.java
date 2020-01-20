/*
BankAccountTester.java  MrG 2018.1018
purpose:            practice making my own class!
required files:     BankAccountTester.java      main class
                    BankAccount.java            derived class
translator phase:   javac BankAccountTester.java
interpreter phase:  java BankAccountTester
*/

//main class
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount bob = new BankAccount();
        System.out.println("balance = $" + bob.getBalance());

        bob.deposit(500);
        System.out.println("balance = $" + bob.getBalance());

        bob.deposit(400);
        System.out.println("balance = $" + bob.getBalance());

        bob.withdraw(100);
        System.out.println("balance = $" + bob.getBalance());
    }
}













