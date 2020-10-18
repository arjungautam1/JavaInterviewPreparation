package method_overriding.bike_example;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 7:16 PM
 */

public class Bike extends Vehicle {
    void run()
    {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.run();

    }
}
