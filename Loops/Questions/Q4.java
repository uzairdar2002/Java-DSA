package Loops.Questions;

import java.util.Scanner;

// Multiplication Table.
public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scn.nextInt();
        scn.close();
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
