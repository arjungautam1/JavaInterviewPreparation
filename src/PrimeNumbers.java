public class PrimeNumbers {
    //    program to check whether the entered number is prime or not
    public static void main(String[] args) {
//        2, 3, 5, 7, and 11
        int num = 11;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The number is Prime .");
        } else {
            System.out.println("Number is not prime .");
        }

    }
}

