/*
WorkerTester.java       MrG     2019.0530
purpose:        practice with abstract classes
required files: WorkerTester.java               main class
                Worker.java                     abstract class
                SalariedWorker.java             subclass
                HourlyWorker.java               subclass
translator:     javac WorkerTester.java
interpreter:    java WorkerTester
*/

public class WorkerTester
{
    public static void main(String[] args)
    {
        Worker s = new SalariedWorker("Sally", 40);
        Worker h = new HourlyWorker("Harry", 40);
        System.out.println("Sally work 30 hours earning:$"+s.computePay(30));
        System.out.println("Harry work 30 hours earning:$"+h.computePay(30));
        System.out.println("Sally work 50 hours earning:$"+s.computePay(50));
        System.out.println("Harry work 50 hours earning:$"+h.computePay(50));
    }
}