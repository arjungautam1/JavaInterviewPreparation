package verisk_interview_prepation;

public class Swap {
    public static void main(String[] args) {

        //a=10 b=20     a=20 b=10
        int a = 10;
        int b = 20;

        a = a + b; //30
        b = a - b;  //10
        a = a - b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);


    }
}
