package inheritance.sub_super_class;

/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 3:45 PM
 */
//Sub class
public class Programmer extends Employee {
    int bonus=1000;

    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println("Programmer salary is :"+p.salary);
        System.out.println("Programmer Bonus is :"+p.bonus);

    }
}
