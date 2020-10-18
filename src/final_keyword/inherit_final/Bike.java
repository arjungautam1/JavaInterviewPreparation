package final_keyword.inherit_final;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 10:35 PM
 */

//Q ) Is final method inherited ?
//Yes , final method is inherited but you can't override it .

public class Bike {
    final void run() {
        System.out.println("Running ...");
    }

}

class Honda extends Bike {
    public static void main(String[] args) {
        new Honda().run();
    }
}
