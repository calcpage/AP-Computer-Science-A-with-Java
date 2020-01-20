//Product.java      MrG     2018.1025
public class Product
{
    private String name;
    private double price;

    /**
     * Constructor
     * @param name The Product Designation
     * @param price Cost in dollars
     * postCondition: initialize name and price
    **/
    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    /**
     * Accessor
     * preCondition: name has been initialized
     * @return The Product Designation
    **/
    public String getName()
    {
        return name;
    }

    /**
     * Accessor
     * preCondition: price has been initialized
     * @return The Cost Dollars
    **/
    public double getPrice()
    {
        return price;
    }

    /**
     * Mutator
     * preCondition: price>=discount
     * @param discount Amount of Dollars Saved
     * postCondition: price is reduced by discount
    **/
    public void reducePrice(double discount)
    {
        price-=discount;
    }
}





















