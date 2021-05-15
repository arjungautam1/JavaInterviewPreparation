/**
 * @author Arjun Gautam
 * Project :JavaEssential
 * Date : 2021-05-15
 * Time : 11:01
 */
package toString;

public class Student {
    int rollNo;
    String name;
    String city;

    public Student(int rollNo, String name, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
     return rollNo+" "+name+ " "+city;
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Arjun", "Kathmandu");
        System.out.println(s1);

    }

}
