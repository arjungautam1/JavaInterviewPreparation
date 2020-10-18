package static_keyword.variable;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 1:01 PM
 */

public class Student {
    int rollNo;
    String name;
    static String college;


    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.college = "Texas";
        Student s1 = new Student(1, "Arjun");
        Student s2 = new Student(2, "Pooja");
        s1.display();
        s2.display();


    }

}
