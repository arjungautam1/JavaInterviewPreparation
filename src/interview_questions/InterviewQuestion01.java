/**
 * Created By Arjun Gautam .
 * Date: 2020-12-09
 * Time: 12:22
 * Project Name : JavaEssential
 */
package interview_questions;

public class InterviewQuestion01 {
    public static void main(String[] args) {

        int i = 1, j = 10;
        do {
            if (i++ > --j) {
                continue;
            }
        }
        while (i < 5);
        System.out.println("i= " + i + "and j=" + j);
    }

}
