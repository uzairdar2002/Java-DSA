package TwoDArrays;

import java.util.Scanner;

public class TwoDArrays {

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the elements of matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scn.nextInt();
            }
            System.out.println();
        }
        scn.close();
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
