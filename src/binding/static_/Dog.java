package binding.static_;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 7:08 AM
 */
//When type of object is determined at compiled time(by the compiler) , it is known as static binding
//If there is any private ,final or static method in a class , there is static binfing

public class Dog {
    private void eat(){
        System.out.println("Dog is eating ...");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
    }
}
