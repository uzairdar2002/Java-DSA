import java.util.Scanner;

public class AverageOfThreeNumbers {
    // Average of three numbers.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        float A = scn.nextFloat();
        float B = scn.nextFloat();
        float C = scn.nextFloat();
        float sum = A + B + C;
        float average = sum / 3;

        scn.close();

        System.out.println("The average of three numbers is : " + average);

    }
}
