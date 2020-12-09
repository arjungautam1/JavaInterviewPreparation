/**
 * Created By Arjun Gautam .
 * Date: 2020-12-09
 * Time: 12:51
 * Project Name : JavaEssential
 */
package exception;
/*Throws keyword is used to declare an extion .
*  It gives an information to the programmer that there may occur an exception so it is better for the programmer
* to provide the exception handling code so that normal flow can be maintained.*/
class ThrowsKeywordExample{
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Hello Geeks");
    }
}