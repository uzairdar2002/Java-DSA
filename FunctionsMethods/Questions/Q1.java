package FunctionsMethods.Questions;

import java.util.Scanner;

public class Q1 {
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double x = scn.nextDouble();
        double y = scn.nextDouble();
        double z = scn.nextDouble();
        scn.close();

        System.out.println("The average is " + average(x, y, z));
    }
}
