package class_object;/*
 * Created By Arjun Gautam .
 * Date : 10/16/20
 * Time : 8:44 PM
 */

public class Test {
    int a, b,c;
    void getData(int x, int y)
    {
        a=x;
        b=y;
    }
    void add()
    {
        c=a+b;
        System.out.println("Sum of numbers is :"+c);
    }

    public static void main(String[] args) {
        Test obj=new Test();
        obj.getData(10,20);
        obj.add();
    }

}
