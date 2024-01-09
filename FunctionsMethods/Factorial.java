package FunctionsMethods;

import java.util.Scanner;

public class Factorial {
    public static int factorialOfNumber(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Enter any positive number: ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();
        int fact = factorialOfNumber(num);
        System.out.println(fact);
    }
}
