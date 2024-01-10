package FunctionsMethods.Questions;

import java.util.Scanner;

public class Q2 {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scn.nextInt();
        scn.close();

        if (isEven(num)) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}
