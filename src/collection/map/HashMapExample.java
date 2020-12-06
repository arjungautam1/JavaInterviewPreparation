/**
 * Created By Arjun Gautam .
 * Date: 2020-12-06
 * Time: 12:57
 * Project Name : JavaEssential
 */
package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Mango");
        map.put(1,"Sweet Apple");

        System.out.println("Iterating HashMap... ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
