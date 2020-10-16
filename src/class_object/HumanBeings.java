package class_object;/*
 * Created By Arjun Gautam .
 * Date : 10/16/20
 * Time : 9:28 PM
 */

public class HumanBeings {
    String name;
    int age;
    String color;


    void getData(String n, int a, String c) {
        name = n;
        age = a;
        color = c;
    }

    void display() {
        System.out.println("My name :" + name + "\n My age:" + age + "\n My color :" + color);
    }


    public static void main(String[] args) {
        Humans obj = new Humans();
        obj.getData("Arjun", 22, "Red");
        obj.display();

        Humans obj1 = new Humans();
        obj1.getData("Pooja", 19, "Lovely");
        obj1.display();

        Humans obj3=new Humans();
        obj3.getData("Aarjo",2,"Lovely");
        obj3.display();
    }
}
