package control_statement;

import java.util.Scanner;

//To check whether the entered number is prime or not.
public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter any number :");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        boolean isPrime = true;    //This is set to make statement isPrime -> true
        for (int i = 2; i < num; i++)  //2,3,4,.....num-1
        {
            if (num % i == 0) {
                isPrime = false; //if not prime number
                break;
            }
        }
        if (isPrime) {
            System.out.println("The entered number is prime .");
        } else {
            System.out.println("The enterd number is not prime number .");
        }

    }
}
