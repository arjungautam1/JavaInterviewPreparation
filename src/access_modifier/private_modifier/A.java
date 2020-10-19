package access_modifier.private_modifier;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 10:02 PM
 */

public class A {
    private int data = 40;

    private void msg() {
        System.out.println("Hello Java");

    }

    public class Simple {
        //    public static void main(String[] args) {
        A obj = new A();
//        System.out.println(obj.data); // Gives compile time error
//        obj.msg();                    // Compile time error
    }
}


