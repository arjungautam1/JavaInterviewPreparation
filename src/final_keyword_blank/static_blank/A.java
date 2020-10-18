package final_keyword_blank.static_blank;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 10:48 PM
 */
// A static final variable that is not initialized at the time of declaration is known as static blank final variable.

public class A {
    static final int data; //static blank final variable
    static {
        data=50;
    }

    public static void main(String[] args) {
        System.out.println(A.data);
    }
}
