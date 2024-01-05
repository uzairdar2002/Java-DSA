package Loops.Questions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number: ");

            number = scn.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("To continue press 1 to exit press 0: ");

            choice = scn.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        scn.close();
    }
}
