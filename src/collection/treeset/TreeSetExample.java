/**
 * Created By Arjun Gautam .
 * Date: 2020-12-06
 * Time: 12:49
 * Project Name : JavaEssential
 */
package collection.treeset;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("B");

        treeSet.add("C"); //Duplicates will not get insert

        //Elements get sotred in default natural sorting order (Ascending)
        System.out.println(treeSet);
    }
}
