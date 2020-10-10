import java.util.Scanner;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
//        Program to display prime numbers up to n

        System.out.println("Enter any number:");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if (n < 1) {
            System.out.println("Please enter a valid number.");
        } else {
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }

                }
                if (isPrime) {
                    System.out.println(i);
                }
            }


        }


    }


}

