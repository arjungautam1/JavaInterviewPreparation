/**
 * @author Arjun Gautam
 * Project :JavaEssential
 * Date : 2021-05-16
 * Time : 19:05
 */
package lamda;

import java.util.ArrayList;

public class LamdaDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            System.out.println(n);
        });
    }
}
