package break_continue;/*
 * Created By Arjun Gautam .
 * Date : 10/17/20
 * Time : 7:41 AM
 */

public class BreakDemo {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
        }
    }
}

//Output :0 1 2 3 4