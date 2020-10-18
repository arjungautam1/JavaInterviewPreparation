package constructor.default_constructor;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 10:34 AM
 */

//Java program demonstrating default constructor
public class DefaultConstructor {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
//        Creating object
        DefaultConstructor obj1 = new DefaultConstructor();
        DefaultConstructor obj2 = new DefaultConstructor();
//       Displaying values of the object
        obj1.display();
        obj2.display();
    }
}

//Explanation:In the above class,you are not creating any constructor
// so compiler provides you a default constructor.
// Here 0 and null values are provided by default constructor.