//Data.java             MrG             2018.1206
public class Data
{
    private double n1;
    private double n2;
    private double n3;

    public Data(double n1, double n2, double n3)
    {
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
    }

    public double getSmallest()
    {
        return Math.min(n1,Math.min(n2,n3));
    }

    public double getLargest()
    {
        return Math.max(n1,Math.max(n2,n3));
    }

    public double getMiddle()
    {
        return n1+n2+n3-getSmallest()-getLargest();
    }
}