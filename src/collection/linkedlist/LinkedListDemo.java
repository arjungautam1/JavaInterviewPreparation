/**
 * Created By Arjun Gautam .
 * Date: 2020-12-06
 * Time: 12:44
 * Project Name : JavaEssential
 */
package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        for (int i=1;i<=5;i++){
            ll.add(i);
        }
        System.out.println(ll);
    }

}
