package method_overloading.changing_no_args;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 7:04 PM
 */

public class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
