//Worker.java       MrG         2019.0530
public abstract class Worker
{
    private String name;
    private double rate;

    public Worker(String n, double r)
    {
        name = n;
        rate = r;
    }

    public double getRate()
    {
        return rate;
    }

    public abstract double computePay(int hours);
}