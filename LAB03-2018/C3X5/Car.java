//Car.java      MrG     2018.1024
public class Car
{
    private double mpg;
    private double tank;

    public Car(double mpg)
    {
        this.mpg=mpg;
        tank=0;
    }

    public double getGasInTank()
    {
        return tank;
    }

    public double getMPG()
    {
        return mpg;
    }

    public void addGas(double gas)
    {
        tank = tank + gas;
    }

    public void drive(double miles)
    {
        tank -= miles/mpg;
    }
}






