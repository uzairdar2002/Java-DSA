package Arrays.Part1;

import java.util.Scanner;

public class SubArrays {

    public static void subarays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = new int[5];

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Array Elements: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }
        System.out.println();
        scn.close();

        subarays(numbers);
    }
}
