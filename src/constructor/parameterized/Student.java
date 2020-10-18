package constructor.parameterized;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 10:45 AM
 */
//Program to demonstrate parameterized constructor

public class Student {
    int id;
    String name;
    Student(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student s1=new Student(101,"Arjun");
        Student s2=new Student(102,"Pooja");
        s1.display();
        s2.display();

    }
}
