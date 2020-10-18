package super_keyword.parent_class_constructor;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 8:35 PM
 */

public class Animal {
    Animal(){
        System.out.println("Animal constructor is created.");

    }
}
class Dog extends Animal{
    Dog(){
        super();
//        if i don't use super keyword here super() is provided by compiler implicitly
        System.out.println("Dog is created.");
    }
}
class MainClass{
    public static void main(String[] args) {
     Dog dog=new Dog();
    }
}
