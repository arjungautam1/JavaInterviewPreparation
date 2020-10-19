package interface_example.basic;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 7:28 PM
 */

public interface printable {
    void print();
}

class A implements printable {
    public void print() {
        System.out.println("This is the implementation of method print(). ");
    }


    public static void main(String[] args) {
        A obj = new A();
        obj.print();
    }
}