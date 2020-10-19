package interface_example.multiple_inheritance;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 8:05 PM
 */

public interface Printable {
    void print();
}
interface Showable{
    void show();

}
class A implements Printable,Showable{
    public void print()
    {
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");

    }

    public static void main(String[] args) {
        A obj=new A();
        obj.print();
        obj.show();
    }
}
