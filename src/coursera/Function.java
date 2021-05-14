/**
 * @author Arjun Gautam
 * Project :JavaEssential
 * Date : 2021-05-13
 * Time : 21:36
 */
package coursera;

public class Function {
    public static void main(String[] args) {
        System.out.println(start());
    }

    static int func2(int w) {
        return w * 3;
    }

    static int func1(int a, int b) {
        int n = a + b;
        return 2 + func2(n);
    }

    static int start() {
        int z = 4;
        return func1(z, 1) - 3;
    }



}
