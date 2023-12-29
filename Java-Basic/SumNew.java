import java.util.Scanner;

public class SumNew {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number: ");

        int a = scn.nextInt();

        System.out.println("Enter second number: ");

        int b = scn.nextInt();

        int c = a + b;

        System.out.println("The sum of those = " + c);
        scn.close();
    }
}
