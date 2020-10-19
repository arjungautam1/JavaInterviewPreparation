package access_modifier.default_modifier_main;/*
 * Created By Arjun Gautam .
 * Date : 10/19/20
 * Time : 10:11 PM
 */

import access_modifier.default_modifier.A;

public class B {
    public static void main(String[] args) {
        A obj=new A();
//        obj.msg() //compile time error

    }
}
