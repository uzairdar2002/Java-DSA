import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to check the greatest: ");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();

        if ((a >= b) && (a >= c)) {
            System.out.println("A is greater.");
        } else if (b >= c) {
            System.out.println("B is greater.");
        } else {
            System.out.println("C is greater.");
        }
    }
}
