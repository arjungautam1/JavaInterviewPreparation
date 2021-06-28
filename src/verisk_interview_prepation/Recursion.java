package verisk_interview_prepation;

public class Recursion {

    void printTenNumbers(int n) {
        if (n > 0) {
            printTenNumbers(n - 1);
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        Recursion objName = new Recursion();
        objName.printTenNumbers(100);
    }


}
