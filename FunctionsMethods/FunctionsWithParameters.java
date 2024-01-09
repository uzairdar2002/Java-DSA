package FunctionsMethods;

import java.util.Scanner;

/**
 * FunctionsWithParameters
 */
public class FunctionsWithParameters {

    // User Defined Function.
    public static int calculateSum(int a, int b) { // Parameters or Formal Parameters --> Function Definition.
        int add = a + b;
        return add;
    }

    // Main Function.
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        scn.close();

        int sum = calculateSum(num1, num2); // Actual Parameters or Arguments --> We pass these while Function Calling.
                                            // --> These are actual Values.
        System.out.println(sum);
    }
}