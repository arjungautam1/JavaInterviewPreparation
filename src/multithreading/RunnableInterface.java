/**
 * @author Arjun Gautam
 * Project :JavaEssential
 * Date : 2021-05-15
 * Time : 11:16
 */
package multithreading;

public class RunnableInterface implements Runnable {
    public void run(){
        System.out.println("Thread is running runnable");
    }

    public static void main(String[] args) {

        RunnableInterface r1=new RunnableInterface();
        Thread t1=new Thread(r1);
        t1.start();

    }
}
