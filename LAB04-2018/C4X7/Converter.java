//Converter.java        MrG     2018.1114
public class Converter
{
    private double meters;
    private final int METERS_PER_KM = 1000;
    private final double KILOS_PER_MI = 1.609;
    private final int FEET_PER_MI = 5280;
    private final int INCHES_PER_FT = 12;

    public Converter(double meters)
    {
        this.meters=meters;
    }

    public double getMeters()
    {
        return meters;
    }

    public double meter2km()
    {
        return meters/METERS_PER_KM;
    }

    public double kilo2mi()
    {
        return meter2km()/KILOS_PER_MI;
    }

    public double mile2ft()
    {
        return kilo2mi()*FEET_PER_MI;
    }

    public double foot2in()
    {
        return mile2ft()*INCHES_PER_FT;
    }
}







