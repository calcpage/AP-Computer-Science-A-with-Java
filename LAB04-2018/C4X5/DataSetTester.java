/*
DataSetTester.java      MrG     2018.1107
purpose:            find the avg of a list of integers
required files:     DataSetTester.java              main class
                    DataSet.java                    derived class
translator phase:   javac DataSetTester.java
interpreter phase:  java DataSetTester grade1 grade2
*/

//main class
public class DataSetTester
{
    public static void main(String[] args)
    {
        DataSet foo = new DataSet();
        System.out.println("sum = " + foo.getSum());
        System.out.println("count = " + foo.getCount());

        foo.addValue(Integer.parseInt(args[0]));
        System.out.println("sum = " + foo.getSum());
        System.out.println("count = " + foo.getCount());
        System.out.println("avg = " + foo.getAVG());

        foo.addValue(Integer.parseInt(args[1]));
        System.out.println("sum = " + foo.getSum());
        System.out.println("count = " + foo.getCount());
        System.out.println("avg = " + foo.getAVG());

    }
}