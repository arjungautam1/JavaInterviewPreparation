package class_object;/*
 * Created By Arjun Gautam .
 * Date : 10/17/20
 * Time : 6:11 AM
 */
//Using the concept of encapsulation
public class Student {
    int id ;
    String name;
    int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student mark=new Student();
        mark.setId(1);
        mark.setAge(22);
        mark.setName("Arjun");
        System.out.println(mark.getId()+"\n"+mark.getAge()+"\n"+mark.getName());



    }
}
