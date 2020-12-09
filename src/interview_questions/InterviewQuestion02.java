/**
 * Created By Arjun Gautam .
 * Date: 2020-12-09
 * Time: 12:22
 * Project Name : JavaEssential
 */

package interview_questions;

//Program to find the duplicate character in String
public class InterviewQuestion02 {
    public static void main(String[] args) {

        String string1 = "helloo";
        int count;

        char string[] = string1.toCharArray();

        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;

                    string[j] = '0';

                }
            }
            if (count > 1 && string[i] != '0') {
                System.out.println(string[i]);
            }

        }
    }
}

