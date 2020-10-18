package final_keyword.variable;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 10:23 PM
 */

public class Bike {
     final int speedLimit=90; //final variable
    void run()
    {
//        speedLimit=100;  //gives compile time error

        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.run();
    }
}
