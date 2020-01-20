/*
ProductPrinter.java     MrG     2018
purpose:            writing my own class
required files:     ProductPrinter.java     main class
                    Product.java            derived class
Translator phase:   javac ProductPrinter.java
Interpreter phase:  java ProductPrinter
*/

//main class
public class ProductPrinter
{
    public static void main(String[] args)
    {
        Product seun = new Product("Toaster", 29.95);
        Product amir = new Product("747", 12000000.99);

        System.out.println("name 1 = " + seun.getName());
        System.out.println("price 1 = $" + seun.getPrice());
        System.out.println("name 2 = " + amir.getName());
        System.out.println("price 2 = $" + amir.getPrice());

        seun.reducePrice(5);
        amir.reducePrice(2000000);

        System.out.println("name 1 = " + seun.getName());
        System.out.println("price 1 = $" + seun.getPrice());
        System.out.println("name 2 = " + amir.getName());
        System.out.println("price 2 = $" + amir.getPrice());
    }
}












