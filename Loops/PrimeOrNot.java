package Loops;

import java.util.*;
// import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        if (n == 2) {
            System.out.println("Prime!");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Prime!");
            } else {
                System.out.println("Not Prime!");
            }
        }

    }
}
