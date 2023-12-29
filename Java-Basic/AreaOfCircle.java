import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        float radius = scn.nextFloat();

        float area = 3.14f * radius * radius;

        System.out.println("The area of the circle is " + area);
        scn.close();
    }
}
