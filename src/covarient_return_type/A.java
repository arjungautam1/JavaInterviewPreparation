package covarient_return_type;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 8:01 PM
 */

class A{
    A get(){return this;}
}

class B1 extends A{
    B1 get(){return this;}
    void message(){System.out.println("welcome to covariant return type");}

    public static void main(String args[]){
        new B1().get().message();
    }
}