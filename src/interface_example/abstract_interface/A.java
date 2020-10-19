package interface_example.abstract_interface;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 9:20 PM
 */

//Creating interface that has 4 methods
public interface A {
    void a(); //by default , public and abstract

    void b();

    void c();

    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class B implements A {
    public void c() {
        System.out.println("I am implementation method c ");
    }
}

class M extends B {
    public void a() {
        System.out.println("I am implementation method a");
    }

    public void b() {
        System.out.println("I am implementation method b");
    }

    public void d() {
        System.out.println("I am implementation method d");
    }

}

//creating a test class that calls methods of A interface
class Test {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}