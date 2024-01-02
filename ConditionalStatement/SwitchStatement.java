import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1 for Tea, 2 for Coffee, 3 for Cold Drink: ");
        int option = scn.nextInt();
        scn.close();

        switch (option) {
            case (1):
                System.out.println("Tea.");
                break;
            case (2):
                System.out.println("Coffee.");
                break;
            case (3):
                System.out.println("Cold Drink.");
                break;
            default:
                System.out.println("No thanks.");
                break;
        }
    }
}
