import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the side of a Square");

        float side = scn.nextFloat();

        scn.close();

        float area = side * side;

        System.out.println("The area of a square is : " + area);

    }
}
