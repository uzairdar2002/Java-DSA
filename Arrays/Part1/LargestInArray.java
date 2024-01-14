package Arrays.Part1;

import java.util.Scanner;

public class LargestInArray {

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = new int[5];
        System.out.println("Enter the Array Elements: ");

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }
        scn.close();

        System.out.println("The largest element is: " + largest(numbers));
    }
}
