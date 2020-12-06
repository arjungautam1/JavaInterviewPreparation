/**
 * Created By Arjun Gautam .
 * Date: 2020-12-06
 * Time: 13:05
 * Project Name : JavaEssential
 */
package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        //Traversing elements
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
