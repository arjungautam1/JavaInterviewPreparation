/**
 * @author :arjun
 * Project :JavaEssential
 * Date : 2020-12-27
 * Time : 22:46
 */
package interview_questions;

public class ReverseInteger {
    public static void main(String[] args) {
        int n= 12,rev=0;
        while (n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("The reversed number is :"+rev);


    }
}
