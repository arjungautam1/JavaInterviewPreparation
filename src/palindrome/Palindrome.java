/**
 * Created By Arjun Gautam .
 * Date: 2020-12-09
 * Time: 15:35
 * Project Name : JavaEssential
 */
package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str, rev = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String:");
        str = scanner.nextLine();
        int length = str.length();


        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
