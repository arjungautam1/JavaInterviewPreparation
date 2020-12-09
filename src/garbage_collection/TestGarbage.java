/**
 * Created By Arjun Gautam .
 * Date: 2020-12-09
 * Time: 14:25
 * Project Name : JavaEssential
 */
package garbage_collection;

import class_object.Test;

public class TestGarbage {
    public void finalize() {
        System.out.println("Object is garbage collected.");
    }

    public static void main(String[] args) {
        TestGarbage testGarbage = new TestGarbage();
        TestGarbage testGarbage1 = new TestGarbage();
        testGarbage = null;
        testGarbage1 = null;
        System.gc();
    }
}
