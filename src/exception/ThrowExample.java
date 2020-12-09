/**
 * Created By Arjun Gautam .
 * Date: 2020-12-06
 * Time: 15:38
 * Project Name : JavaEssential
 */
package exception;

public class ThrowExample {
    public static void main(String[] args) {


        int i = 1, j = 10;
        do {
            if (i++ > --j) {
                continue;
            }
        }
        while(i<5);
        System.out.println("i= "+i + "and j="+j);
    }
}
