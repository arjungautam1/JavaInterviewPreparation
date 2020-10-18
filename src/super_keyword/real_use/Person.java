package super_keyword.real_use;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 9:04 PM
 */

public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;

    Emp(int id, String name, float salary) {
        super(id, name);  //resuing parent constructor
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);

    }
}

class MainClass {
    public static void main(String[] args) {
        Emp e1 = new Emp(1, "Arjun", 10000);
        e1.display();
    }
}
