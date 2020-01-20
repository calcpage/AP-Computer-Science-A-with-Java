//Executive.java        MrG         2019.0523
public class Executive extends Manager
{
    public Executive(String name, double salary, String dept)
    {
        super(name, salary, dept);
    }

    public String toString()
    {
        return "Executive[" + super.toString();
    }
}