import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = scn.nextDouble();
        scn.close();
        if (temp > 100) {
            System.out.println("You have fever.");
        } else {
            System.out.println("You don't have fever.");
        }
    }
}
