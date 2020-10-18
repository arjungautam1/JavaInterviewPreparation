package final_keyword_blank;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 10:43 PM
 */

// A final variable that is not initialized at the time of declaration is known as blank final variable.

public class Bike {

    final int speedLimit;   //blank final variable

    Bike(){
        speedLimit=70;
        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        new Bike();
    }
}
