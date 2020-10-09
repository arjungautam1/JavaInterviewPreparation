import java.util.Scanner;

//Program to display whether the number is odd or even
public class Conditional {
    public static void main(String[] args) {
        System.out.print("Enter any number :");
        Scanner num = new Scanner(System.in); //Scanner package //new keyword used to make object //System.in
        int a = num.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd");
        }
    }
}

