package constructor_overloading;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 11:11 AM
 */
//Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
// They are arranged in a way that each constructor performs a different task.
// They are differentiated by the compiler by the number of parameters in the list and their types.

public class Student {
    int id;
    String name;
    int age;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Hari");
        Student s2 = new Student(102, "Hari", 11);
        s1.display();
        s2.display();
    }
}
