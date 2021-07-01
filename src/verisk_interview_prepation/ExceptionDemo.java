package verisk_interview_prepation;

public class ExceptionDemo {
    public static void main(String[] args) {

        try{
            int[] a=new int[]{23,24};
            System.out.println(a[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundexception occured");
        }catch (RuntimeException e){
            System.out.println("RunTime exception occured");
        }


    }
}
