/*
EmployeeTester.java     MrG         2019.0523
purpose:                experimenting with extends!
required files:         EmployeeTester.java             main class
                        Employee.java                   derived classes
                        Manager.java
                        Executive.java
translator phase:       javac EmployeeTester.java
interpreter phase:      java EmployeeTester
*/

public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee e = new Employee("Edgar", 65000);
        System.out.println("e = " + e);

        Manager m = new Manager("Mary", 85000, "Engineering");
        System.out.println("m = " + m);

        Executive v = new Executive("Veronica", 105000, "Physics");
        System.out.println("v = " + v);
    }
}