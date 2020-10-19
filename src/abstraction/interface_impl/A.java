package abstraction.interface_impl;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 9:00 AM
 */

public interface A {
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A{
    public void c(){
        System.out.println(" I am c ");
    }
}
class M extends B{
    public void a(){
        System.out.println(" I am a ");
    }
    public void b(){
        System.out.println(" I am b");
    }
    public void d()
    {
        System.out.println(" I am d");
    }

}
class Main{
    public static void main(String[] args) {
        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
