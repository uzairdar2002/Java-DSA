package Arrays.Part1;

import java.util.Scanner;

// Arrays in functions pass by reference.
public class ArraysAsFuncArguments {
    public static void arrayFunct(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = new int[5];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < number.length; i++) {
            number[i] = scn.nextInt();
            System.out.println();
        }
        scn.close();

        arrayFunct(number);

    }
}
