package Loops;

import java.util.Scanner;

public class BreakQues {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            int n = scn.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
        scn.close();
    }
}
