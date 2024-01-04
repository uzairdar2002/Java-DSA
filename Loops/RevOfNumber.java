package Loops;

import java.util.Scanner;
// Reverse of a number

public class RevOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();
        scn.close();

        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem);
            num = num / 10;
        }
    }
}
