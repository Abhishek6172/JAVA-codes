package JAVA.java_class1;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev* 10 + digit;
            number /= 10;
        }
        if (originalNumber == rev) {
            System.out.println(originalNumber+ " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
