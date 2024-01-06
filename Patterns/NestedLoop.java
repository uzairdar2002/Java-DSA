package Patterns;

// import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter no. of lines: ");
        // int lines = scn.nextInt();
        // scn.close();

        for (int lines = 1; lines <= 4; lines++) {
            for (int star = 1; star <= lines; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
