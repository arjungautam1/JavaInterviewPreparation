package final_keyword.method;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 10:27 PM
 */

public class Bike {
    final void run() {
        System.out.println("Running ...");
    }

}

class Honda extends Bike {

//    void run() // Can't override    //gives compile time error
//
//    {
//        System.out.println("Running slow ... :)");
//    }

    public static void main(String[] args) {
       new Honda().run();
    }
}
