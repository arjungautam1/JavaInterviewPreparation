package verisk_interview_prepation;

public class Palindrome {
    public static void main(String[] args) {

        int n, temp, sum=0,r;
        n=549;

        temp=n;

        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Number is palindrome.");
        }
        else {
            System.out.println("Number is not palindrome.");
        }

    }
}
