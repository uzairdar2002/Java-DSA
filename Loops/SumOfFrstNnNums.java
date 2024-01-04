package Loops;

import java.util.Scanner;

public class SumOfFrstNnNums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int nth_num = scn.nextInt();
        scn.close();
        int i = 0;
        int sum = 0;
        while (i <= nth_num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
