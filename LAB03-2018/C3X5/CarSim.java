/*
CarSim.java     MrG     2018.1024
purpose:            abstracting a car
required files:     CarSim.java         main class
                    Car.java            derived class
translator phase:   javac CarSim.java
interpreter phase:  java CarSim
*/

//main class
public class CarSim
{
    public static void main(String[] args)
    {
        Car ross = new Car(50);
        System.out.println("gas level = " + ross.getGasInTank() + " gallons");
        System.out.println("efficiency = " + ross.getMPG() + " miles/gallon");

        ross.addGas(20);
        System.out.println("gas level = " + ross.getGasInTank() + " gallons");

        ross.drive(100);
        System.out.println("gas level = " + ross.getGasInTank() + " gallons");
    }
}









