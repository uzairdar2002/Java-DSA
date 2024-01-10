package FunctionsMethods.Questions;

import java.util.Scanner;

public class Q3 {
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int rem = palindrome % 10;
            reverse = reverse * 10 + rem;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scn = new Scanner(System.in);
        int palindrome = scn.nextInt();
        scn.close();

        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome.");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome.");
        }
    }
}
