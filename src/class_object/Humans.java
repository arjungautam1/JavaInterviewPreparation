package class_object;/*
 * Created By Arjun Gautam .
 * Date : 10/16/20
 * Time : 9:00 PM
 */

public class Humans {
    String name;
    int age;
    String color;
    void getData(String n, int a, String c){
        name=n;
        age=a;
        color=c;
    }
    void display(){
        System.out.println("My name is : "+ name+"\nMy age is "+age+"\nMy color is "+color);

    }

    public static void main(String[] args) {
        Humans obj=new Humans();
        obj.getData("Arjun",22,"Yellowish");
        obj.display();

        System.out.println("\n");

        Humans obj1=new Humans();
        obj1.getData("Pooja",21,"Red");
        obj1.display();


    }
}
