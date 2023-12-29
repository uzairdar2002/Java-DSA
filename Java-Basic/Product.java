import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = scn.nextFloat();
        System.out.println("Enter the second nummber: ");
        float b = scn.nextFloat();
        scn.close();

        float c = a * b;

        System.out.println("the product of two numbers is : " + c);
    }
}
