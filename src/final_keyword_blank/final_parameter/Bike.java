package final_keyword_blank.final_parameter;/*
 * Created By Arjun Gautam .
 * Date : 10/18/20
 * Time : 10:51 PM
 */
//Final parameter
public class Bike {
    int cube(final int n) {
//       n=n+2; //can't be chaned as n is final //

//        gives compile time error
        return n * n;

    }


    public static void main(String[] args) {
        new Bike().cube(1);
    }
}
