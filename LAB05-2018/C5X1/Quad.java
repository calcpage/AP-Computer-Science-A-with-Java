//Quad.java         MrG         2018.1129
public class Quad
{
    private double a;
    private double b;
    private double c;

    public Quad(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public double getC()
    {
        return c;
    }

    private double getDisc()
    {
        return b*b-4*a*c;
    }

    public boolean isReal()
    {
        return getDisc()>=0;
    }

    public boolean isEqual()
    {
        return getDisc()==0;
    }

    public boolean isRat()
    {
        return Math.sqrt(getDisc())==Math.floor(Math.sqrt(getDisc()));
    }

    public double getRoot1()
    {
        return (-b-Math.sqrt(getDisc()))/(2*a);
    }

    public double getRoot2()
    {
        return (-b+Math.sqrt(getDisc()))/(2*a);
    }
}