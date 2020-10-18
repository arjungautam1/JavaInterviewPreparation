package constructor.default_constructor;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 10:30 AM
 */
//Java program to create and call a default constructor
public class Constructor {
    Constructor(){
        System.out.println("Constructor is created");

    }

    public static void main(String[] args) {
        Constructor obj=new Constructor();
    }
}
//Q) What is the purpose of a default constructor?
//        The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type