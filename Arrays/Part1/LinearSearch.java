package Arrays.Part1;

import java.util.Scanner;

public class LinearSearch {
    public static void linearSearch(int numbers[]) {
        int search = 7;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("At index: " + i + " is the number " + search + " you wanted to search.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numbers[] = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }
        System.out.println();
        scn.close();

        linearSearch(numbers);

    }

}
