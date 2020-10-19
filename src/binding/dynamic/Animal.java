package binding.dynamic;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 7:11 AM
 */
//When type of the object is determined at run-time . It is known as dynamic binding .

public class Animal {
    void eat() {
        System.out.println("Animal is eating ...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating ...");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }
}

//In the above example object type can't be determined by the compiler,
// because the instance of Dog is also an instance of Animal .
//Do compiler doesn't know it's type , only it's base typ .