package super_keyword.parent_instance_variable;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 8:16 PM
 */

//1) super is used to refer immediate parent class instance variable

//parent class
public class Animal {
    String color = "white";
}

//child class
class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println("Color from dog class " + color);  //prints the color of Dog class
        System.out.println("Color from animal class " + super.color); //prints the color of the Animal class

    }

}

class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}