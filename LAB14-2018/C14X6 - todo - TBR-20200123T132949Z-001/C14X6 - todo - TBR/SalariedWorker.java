//SalariedWorker.java        MrG         2019.0530
public class SalariedWorker extends Worker
{
    public SalariedWorker(String n, double r)
    {
        super(n,r);
    }

    public double computePay(int hours)
    {
        return 40 * getRate();
    }
}
