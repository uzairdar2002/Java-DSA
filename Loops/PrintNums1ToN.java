package Loops;

import java.util.Scanner;

public class PrintNums1ToN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the nth number: ");

        int num = scn.nextInt();
        scn.close();
        int counter = 0;
        while (counter <= num) {
            System.out.println(counter);
            counter++;
        }
    }
}
