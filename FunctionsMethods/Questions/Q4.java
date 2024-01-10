package FunctionsMethods.Questions;

import java.util.Scanner;

public class Q4 {
    public static int sumDigits(int num) {
        int sumOfDigits = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            num = num / 10;
        }

        return sumOfDigits;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scn.nextInt();
        scn.close();
        System.out.println("The sum of digits: " + sumDigits(number));
    }
}
