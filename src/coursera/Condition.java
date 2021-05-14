/**
 * @author Arjun Gautam
 * Project :JavaEssential
 * Date : 2021-05-13
 * Time : 21:40
 */
package coursera;

public class Condition {
    public static void main(String[] args) {
        System.out.println(g(5));
    }
    static int g (int a) {
        if (a < 9) {
            return 9;
        }

        if (a < 7) {
            return 7;
        }

        if (a < 4) {
            return 4;
        }

        return 0;
    }
}
