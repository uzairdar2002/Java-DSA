import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Using Switch .
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float a = scn.nextFloat();
        System.out.println("Enter the operation (+, -, *, /) :");
        char operation = scn.next().charAt(0);
        System.out.println("Enter 2nd number: ");
        float b = scn.nextFloat();
        scn.close();

        switch (operation) {
            case ('+'):
                System.out.println(a + b);
                break;
            case ('-'):
                System.out.println(a - b);
                break;
            case ('*'):
                System.out.println(a * b);
                break;
            case ('/'):
                System.out.println(a / b);
                break;
            default:
                System.out.println("You are dumb!.");
                break;
        }
    }
}