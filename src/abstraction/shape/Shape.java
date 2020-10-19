package abstraction.shape;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 7:37 AM
 */

//Abstraction is a process of hiding the implementation details and showing only functionality to the user
public abstract class Shape {
    abstract void draw();

}

//In real scenario, implementation id provided by others i,e.unknown by user
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle ...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle ..");
    }
}
//In real scenario , method id called by the programmer or user

class TestAbstraction {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        Shape s1 = new Rectangle();
        s1.draw();
    }
}
