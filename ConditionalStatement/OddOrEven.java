import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number ot see is it odd or even: ");
        int number = scn.nextInt();
        scn.close();

        if (number % 2 == 0) {
            System.out.println("Your number is Even.");
        } else {
            System.out.println("Your Number is odd.");
        }
    }
}
