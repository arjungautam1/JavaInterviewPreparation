/**
 * Created By Arjun Gautam
 * Date :2020-12-10
 * Time :22:56
 * Project Name :JavaEssential
 */
package interview_questions;

//Swap numbers without using third varibale
public class InterviewQuestion03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b; //30
        b = a - b; //10
        a = a - b; //20

        System.out.println(a);
        System.out.println(b);

    }
}
