package FunctionsMethods;

import java.util.Scanner;

public class Product {

    public static int productOfTwoNumbers(int a, int b) {
        int prooduct = a * b;
        return prooduct;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        scn.close();
        int product = productOfTwoNumbers(num1, num2);
        System.out.println(product);
    }
}
