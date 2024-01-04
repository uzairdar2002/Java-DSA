package Loops;

import java.util.Scanner;

public class ContinueQues {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Enter the number: ");
            int num = scn.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            // scn.close();
            System.out.println("Number was : " + num);
        } while (true);
    }
}
