package FunctionsMethods;

import java.util.Scanner;

public class BionomialCoefficient {

    public static int factorialOfNumber(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinoCoeff(int a, int b) {
        int fact_n = factorialOfNumber(a);
        int fact_r = factorialOfNumber(b);
        int fact_nmr = factorialOfNumber(a - b);
        int NCR = fact_n / (fact_r * fact_nmr);
        return NCR;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n and r to calculate Binomial Coefficient : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        scn.close();

        int nCr = BinoCoeff(n, r);

        System.out.println(nCr);
    }
}
