package this_keyword;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 2:58 PM
 */
//this: to refer current class instance variable
public class Student {
    int rollNo;
    String name;
    float fee;
    Student(int rollNo,String name,float fee)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollNo+" "+name+" "+fee);
    }

    public static void main(String[] args) {
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
