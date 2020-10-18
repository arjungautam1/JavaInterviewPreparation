package static_keyword.method;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 1:31 PM
 */

public class Student {
    int rollNo;
    String name;
    static String college = "Viswa Niketan";

    static void changeCollege() {
        college = "Texas";
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    public static void main(String[] args) {

        Student.changeCollege(); //Calling change college method

        Student s1 = new Student(1, "Arjun");
        Student s2 = new Student(2, "Pooja");
        s1.display();
        s2.display();
    }
}
