/**
 * @author Arjun Gautam
 * Project :JavaEssential
 * Date : 2021-05-13
 * Time : 21:42
 */
package coursera;

public class Mix {
    public static void main(String[] args) {
        System.out.println(k(6,6));
    }
    static int k (int a, int b) {
        if (a < b) {
            if (b > 4) {
                return 0 ;
            }
            else {
                return 1;
            }
        }
        else {
            if (a > 4) {
                return 2;
            }
            else {
                return 3;
            }
        }
    }


}
