//DataSet.java      MrG     2018.1107
public class DataSet
{
    private int sum;
    private int count;

    public DataSet()
    {
        sum=0;
        count=0;
    }

    public int getSum()
    {
        return sum;
    }

    public int getCount()
    {
        return count;
    }

    public double getAVG()
    {
        return (double)sum/count;
    }

    public void addValue(int grade)
    {
        sum+=grade;
        count++;
    }
}