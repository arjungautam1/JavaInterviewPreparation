/**
 * @author Arjun Gautam
 * Project :JavaEssential
 * Date : 2021-05-15
 * Time : 11:13
 */
package multithreading;

//Java thread extending thread class
public class ExtendingThread extends Thread{
    public void run(){
        //run() used to do an action for a thread
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        ExtendingThread t1=new ExtendingThread();
        t1.start();
    }

}
