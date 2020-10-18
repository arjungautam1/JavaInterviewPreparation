package super_keyword.parent_class_method;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 8:26 PM
 */

//2) super can be used to invoke parent class method

public class Animal {
    void eat()
    {
        System.out.println("eating..");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("barking..");
    }
    void work()
    {
        super.eat();
        bark();
    }
}
class MainClass{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.work();
    }
}
