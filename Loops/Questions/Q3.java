package Loops.Questions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Factorial of a number.
        Scanner scn = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("Enter any positive number: ");

        num = scn.nextInt();
        scn.close();

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
