//Employee.java     MrG     2019.0523
public class Employee
{
    private String name;
    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String toString()
    {
        return "Employee[name = " + name + ", salary = " + salary + "]";
    }
}