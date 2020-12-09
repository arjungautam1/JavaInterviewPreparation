/**
 * Created By Arjun Gautam .
 * Date: 2020-12-06
 * Time: 15:38
 * Project Name : JavaEssential
 */
package exception;
/*Throw keyword us used to explictly throw an exception from a method or any block of code .
The throw keyword is mainly used to throw custom exception */
//        Java program to demostrate the use of throw


import java.util.Scanner;

public class ThrowExample {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Not valid ");
        else
            System.out.println("Welcome to vote .");
    }

    public static void main(String[] args) {
        System.out.println("Enter you age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        validate(age);
        System.out.println("Rest of the Code.");

    }
}