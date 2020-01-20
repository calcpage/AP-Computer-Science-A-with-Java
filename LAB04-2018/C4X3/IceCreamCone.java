//IceCreamCone.java     MrG     2018.1102
public class IceCreamCone
{
    private double r;
    private double h;


    /**
     * Constructor
     * @param r radius of a cone in inches
     * @param h height of a cone in inches
     * postCondition: instantiated an IceCreamCone object
     */
    public IceCreamCone(double r, double h)
    {
        this.r=r;
        this.h=h;
    }

    /**
     * Accessor
     * preCondition: an IceCreamCone object has been instatiated
     * @return the radius of a cone
     */
    public double getR()
    {
        return r;
    }

    /**
     * Accessor
     * preCondition: an IceCreamCone object has been instatiated
     * @return the height of a cone
     */
    public double getH()
    {
        return h;
    }

    /**
     * Accessor
     * preCondition: an IceCreamCone object has been instatiated
     * @return the volume of a cone
     */
    public double getVol()
    {
        return Math.PI*Math.pow(r,2)*h/3;
    }

    /**
     * Accessor
     * preCondition: an IceCreamCone object has been instatiated
     * @return the surface area of a cone
     */
    public double getSA()
    {
        return Math.PI*r*Math.sqrt(r*r+h*h);
    }
}