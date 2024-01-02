import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scn.nextInt();
        System.out.println("Enter the second number: ");
        int b = scn.nextInt();
        scn.close();

        if (a > b) {
            System.out.println(a + " A is greater than B.");
        } else {
            System.out.println(b + " B is greater than A.");
        }
    }
}
