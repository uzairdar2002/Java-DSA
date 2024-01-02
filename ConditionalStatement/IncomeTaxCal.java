import java.util.Scanner;

public class IncomeTaxCal {
    public static void main(String[] args) {
        /*
         * income < 5L. ----> 0% tax.
         * 
         * income between 5L to 10L ---> 20% tax.
         * 
         * income > 10L ----> 30% tax.
         */

        Scanner scn = new Scanner(System.in);
        int income = scn.nextInt();
        scn.close();
        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }

        System.out.println("The Tax is  : " + tax);
    }
}
