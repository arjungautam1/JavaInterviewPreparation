package aggregation.circle_example;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 6:35 PM
 */

public class Circle {
    Operation operation;  //This is called aggregation
    double pi = 3.14;

    double area(int radius) {
        operation = new Operation();
        int rsquare = operation.square(radius);
        return pi * rsquare;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);

    }
}
