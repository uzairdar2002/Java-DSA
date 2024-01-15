package Arrays.Part1;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
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
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
