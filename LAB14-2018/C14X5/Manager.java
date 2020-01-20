//Manager.java       MrG         2019.0523
public class Manager extends Employee
{
    private String dept;

    public Manager(String name, double salary, String dept)
    {
        super(name, salary);
        this.dept = dept;
    }

    public String toString()
    {
        return "Manager[" + super.toString() + ", dept = " + dept + "]";
    }
}