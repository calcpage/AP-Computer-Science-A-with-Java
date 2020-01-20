//PowerGenerator.java        MrG         2019.0107
public class PowerGenerator
{
    private int base;
    private long power;

    public PowerGenerator(int base)
    {
        this.base=base;
        power=1;
    }

    public long nextPower()
    {
        power=power*base;
        return power;
    }
}