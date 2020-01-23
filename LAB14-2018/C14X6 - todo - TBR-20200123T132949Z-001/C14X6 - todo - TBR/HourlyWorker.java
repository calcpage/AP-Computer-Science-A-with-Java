//HourlyWorker.java          MrG         2019.0530
public class HourlyWorker extends Worker
{
    public HourlyWorker(String n, double r)
    {
        super(n,r);
    }

    public double computePay(int hours)
    {
        double temp = hours*getRate();
        if(hours > 40)
        {
            temp += (hours - 40)*getRate()/2;
        }
        return temp;
    }
}
