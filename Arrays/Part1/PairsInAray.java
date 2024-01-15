package Arrays.Part1;

import java.util.Scanner;

public class PairsInAray {

    public static void pairsOfArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + ", " + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int numbers[] = new int[5];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }
        System.out.println();
        scn.close();
        pairsOfArray(numbers);
    }
}
