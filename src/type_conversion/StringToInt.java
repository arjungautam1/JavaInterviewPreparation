/**
 * @author Arjun Gautam
 * Project :JavaEssential
 * Date : 2021-05-15
 * Time : 12:59
 */
package type_conversion;

public class StringToInt {
    public static void main(String[] args) {
        String s="100";

        int i=Integer.parseInt(s); //Integer.parseInt() converts String String int integer

        String newString=String.valueOf(i);  //String.valueOf() converts integer to string

        System.out.println(s);

        System.out.println(newString);
    }
}
