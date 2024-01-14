package Arrays.Part1;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // Defining an Array of integers.
        int numbers[] = new int[5];

        // Taking input from user .
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Defining an Array of Strings.
        String names[] = new String[5];

        // Taking user input for names.
        for (int i = 0; i < names.length; i++) {
            names[i] = scn.nextLine();
            System.out.print(names[i] + " ");
        }
        System.out.println();
        scn.close();
    }
}
